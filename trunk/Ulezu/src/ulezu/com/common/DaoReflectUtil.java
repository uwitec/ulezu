/**
 * @fileName ObjectReflectUitl.java
 * 对象反射的工具类
 * @author 秦伟
 * @since 2014-2-25 下午06:03:02
 */
package ulezu.com.common;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DaoReflectUtil<T> {
	Class<T> entityClass;

	/**
	 * 通过反射获得子类确定的泛型类 constractor
	 */
	public DaoReflectUtil(Class<T> entityClass) {
		super();
		this.entityClass = entityClass;
	}

	/**
	 * Turn the ResultSet into an Object.
	 * 
	 * @param <T>
	 * 
	 * @param rs
	 *            The ResultSet to handle.
	 * 
	 * @return An Object initialized with ResultSet data. It is return null if
	 *         the ResultSet contained 0 rows.
	 * 
	 * @throws SQLException
	 *             if a database access error occurs
	 */
	protected T handleBean(ResultSet rs) throws SQLException {
		PropertyDescriptor[] props = this.propertyDescriptors();
		ResultSetMetaData rsmd = rs.getMetaData();
		int[] columnToProperty = this.mapColumnsToProperties(rsmd, props);
		return rs.next() ? this.createBean(rs, props, columnToProperty) : null;
	}

	/**
	 * Turn the ResultSet into an Objects List.
	 * 
	 * @author qw
	 * @version 创建时间:2013-12-27上午11:13:38
	 * @param <T>
	 * @param rs
	 *            The ResultSet to handle.
	 * 
	 * @return An Object List initialized with ResultSet data.
	 * 
	 * @throws SQLException
	 */
	protected List<T> handleList(ResultSet rs) throws SQLException {
		List<T> results = new ArrayList<T>();

		if (!rs.next()) {
			return results;
		}

		PropertyDescriptor[] props = this.propertyDescriptors();
		ResultSetMetaData rsmd = rs.getMetaData();
		int[] columnToProperty = this.mapColumnsToProperties(rsmd, props);
		do {
			results.add(this.createBean(rs, props, columnToProperty));
		} while (rs.next());

		return results;
	}

	/**
	 * Returns a PropertyDescriptor[] for the given Class.
	 * 
	 * @param c
	 *            The Class to retrieve PropertyDescriptors for.
	 * @return A PropertyDescriptor[] describing the Class.
	 * @throws SQLException
	 *             if introspection failed.
	 */
	private PropertyDescriptor[] propertyDescriptors() throws SQLException {
		// Introspector caches BeanInfo classes for better performance
		BeanInfo beanInfo = null;
		try {
			beanInfo = Introspector.getBeanInfo(entityClass);

		} catch (IntrospectionException e) {
			throw new SQLException("Bean introspection failed: "
					+ e.getMessage());
		}

		return beanInfo.getPropertyDescriptors();
	}

	/**
	 * The positions in the returned array represent column numbers. The values
	 * stored at each position represent the index in the PropertyDescriptor[]
	 * for the bean property that matches the column name. If no bean property
	 * was found for a column, the position is set to -1
	 * 
	 * @param rsmd
	 *            The ResultSetMetaData containing column information.
	 * @param props
	 *            The bean property descriptors.
	 * @throws SQLException
	 *             if a database access error occurs
	 * @return An int[] with column index to property index mappings. The 0th
	 *         element is meaningless because JDBC column indexing starts at 1.
	 */
	private int[] mapColumnsToProperties(ResultSetMetaData rsmd,
			PropertyDescriptor[] props) throws SQLException {

		int cols = rsmd.getColumnCount();
		int[] columnToProperty = new int[cols + 1];
		Arrays.fill(columnToProperty, -1);

		for (int col = 1; col <= cols; col++) {
			String columnName = rsmd.getColumnLabel(col);
			if (null == columnName || 0 == columnName.length()) {
				columnName = rsmd.getColumnName(col);
			}
			String propertyName = columnName;
			for (int i = 0; i < props.length; i++) {

				if (propertyName.equalsIgnoreCase(props[i].getName())) {
					columnToProperty[col] = i;
					break;
				}
			}
		}

		return columnToProperty;
	}

	/**
	 * Creates a new object and initializes its fields from the ResultSet.
	 * 
	 * @param <T>
	 *            The type of bean to create
	 * @param rs
	 *            The result set. rs must havae call next() methed first; age:
	 *            if(rs.next()) { return createBean(rs, ....); }
	 * @param type
	 *            The bean type (the return type of the object).
	 * @param props
	 *            The property descriptors.
	 * @param columnToProperty
	 *            The column indices in the result set.
	 * @return An initialized object.
	 * @throws SQLException
	 *             if a database error occurs.
	 */
	private T createBean(ResultSet rs, PropertyDescriptor[] props,
			int[] columnToProperty) throws SQLException {

		T bean = this.newInstance();

		for (int i = 1; i < columnToProperty.length; i++) {

			if (columnToProperty[i] == -1) {
				continue;
			}
			PropertyDescriptor prop = props[columnToProperty[i]];
			Object value = rs.getObject(i);
			if(value != null) {
				this.callSetter(bean, prop, value);
			}
		}
		return bean;
	}

	/**
	 * Factory method that returns a new instance of the given Class. This is
	 * called at the start of the bean creation process and may be overridden to
	 * provide custom behavior like returning a cached bean instance.
	 * 
	 * @param <T>
	 *            The type of object to create
	 * @param c
	 *            The Class to create an object from.
	 * @return A newly created object of the Class.
	 * @throws SQLException
	 *             if creation failed.
	 */
	private T newInstance() throws SQLException {
		try {
			return entityClass.newInstance();

		} catch (InstantiationException e) {
			throw new SQLException("Cannot create " + entityClass.getName()
					+ ": " + e.getMessage());

		} catch (IllegalAccessException e) {
			throw new SQLException("Cannot create " + entityClass.getName()
					+ ": " + e.getMessage());
		}
	}

	/**
	 * Calls the setter method on the target object for the given property. If
	 * no setter method exists for the property, this method does nothing.
	 * 
	 * @param target
	 *            The object to set the property on.
	 * @param prop
	 *            The property to set.
	 * @param value
	 *            The value to pass into the setter.
	 * @throws SQLException
	 *             if an error occurs setting the property.
	 */
	private void callSetter(Object target, PropertyDescriptor prop, Object value)
			throws SQLException {

		Method setter = prop.getWriteMethod();

		if (setter == null) {
			return;
		}

		try {
			setter.invoke(target, new Object[] { value });
		} catch (IllegalArgumentException e) {
			throw new SQLException("Cannot set " + prop.getName() + ": "
					+ e.getMessage());

		} catch (IllegalAccessException e) {
			throw new SQLException("Cannot set " + prop.getName() + ": "
					+ e.getMessage());

		} catch (InvocationTargetException e) {
			throw new SQLException("Cannot set " + prop.getName() + ": "
					+ e.getMessage());
		}
	}

}