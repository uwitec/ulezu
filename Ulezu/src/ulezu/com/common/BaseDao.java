/**
 * @fileName BaseDao.java
 * 持久层基础类，提供一些常用的数据库操作方法
 * @author 秦伟
 * @since 2014-2-25 下午05:39:21
 */
package ulezu.com.common;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Arrays;
import java.util.List;


/**
 * 请修改 getConnection() 方法，  得到自己的数据库连接
 */
public class BaseDao<T>{
	DaoReflectUtil<T> daoReflectUtil = null;
	public BaseDao() {
		daoReflectUtil = new DaoReflectUtil<T>();
	}

	/**
	 * 用于SQL语句中只有一个问号的情况 得到type类型的ArrayList,
	 * 
	 * @author qw
	 * @version 创建时间:2013-12-26下午08:11:57
	 * @param <T>
	 *            对象类型
	 * @param sql
	 *            执行的SQL语包，包含=？
	 * @param param
	 *            SQL语句中=？的值，只支持数字和字符串类型
	 * @return type类型的ArrayList,
	 * @throws SQLException
	 */
	public List<T> queryForList(String sql, Connection con, Object param) throws SQLException {
		return this.queryForList(sql, con, new Object[] { param });
	}

	/**
	 * 用于SQL语句中没有问号的情况 得到type类型的ArrayList,
	 * 
	 * @author qw
	 * @version 创建时间:2013-12-26下午08:11:57
	 * @param <T>
	 *            对象类型
	 * @param sql
	 *            执行的SQL语包，包含=？
	 * @param type
	 *            对象
	 * @return type类型的ArrayList,
	 * @throws SQLException
	 */
	public List<T> queryForList(String sql, Connection con) throws SQLException {
		return this.queryForList(sql, con, (Object[]) null);
	}

	/**
	 * 用于SQL语句中只有多个问号的情况 得到type类型的ArrayList,
	 * 
	 * @author qw
	 * @version 创建时间:2013-12-26下午08:11:57
	 * @param <T>
	 *            对象类型
	 * @param sql
	 *            执行的SQL语包，包含=？
	 * @param type
	 *            对象
	 * @param param
	 *            Object类型数组，以次表示SQL语句中=？的值，只支持数字和字符串类型
	 * @return type类型的ArrayList,
	 * @throws SQLException
	 */
	public List<T> queryForList(String sql,Connection con, Object... params)
			throws SQLException {
		checkParams(sql, con);
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<T> result = null;

		try {
			stmt = con.prepareStatement(sql);
			this.fillStatement(stmt, params);
			rs = stmt.executeQuery();
			result = daoReflectUtil.handleList(rs);
		} catch (SQLException e) {
			this.rethrow(e, sql, params);
		} finally {
			closeAll(rs, stmt, con);
		}

		return result;
	}

	

	/**
	 * 得到对象
	 * 
	 * @author qw
	 * @version 创建时间:2013-12-26下午08:18:29
	 * @param <T>
	 * @param sql
	 *            sql语句
	 * @param type
	 *            对象类型
	 * @param param
	 *            sql语句参数
	 * @return 得到的type类型对象
	 * @throws SQLException
	 */
	public T queryForObject(String sql, Connection con, Object param) throws SQLException {
		return this.queryForObject(sql, con, new Object[] { param });
	}

	/**
	 * 执行给定的SQL,SQL中没有参数（没有=？）。
	 * 
	 * @param <T>
	 *            返回的对象类型
	 * @param sql
	 *            The SQL statement to execute.
	 * @return An object generated.
	 * @throws SQLException
	 *             if a database access error occurs
	 */
	public T queryForObject(String sql, Connection con) throws SQLException {
		return this.queryForObject(sql, con, (Object[]) null);
	}

	/**
	 * 执行带有多个参数的SQL语句.
	 * 
	 * @param sql
	 *            The SQL statement to execute.
	 * @param params
	 *            An array of query replacement parameters in the sql.
	 * @return type 类型的对象.
	 * @throws SQLException
	 *             If there are database or parameter errors.
	 */
	public T queryForObject(String sql, Connection con, Object... params) throws SQLException {
		checkParams(sql, con);
		PreparedStatement stmt = null;
		ResultSet rs = null;
		T result = null;

		try {
			stmt = con.prepareStatement(sql);
			this.fillStatement(stmt, params);
			rs = stmt.executeQuery();
			result = daoReflectUtil.handleBean(rs);
		} catch (SQLException e) {
			this.rethrow(e, sql, params);
		} finally {
			closeAll(rs, stmt, con);
		}

		return result;
	}
	
	

	/**
	 * Executes the given INSERT, UPDATE, or DELETE SQL statement without any
	 * replacement parameters（not have "**=?" in sql）.
	 * 
	 * @param sql
	 *            The SQL statement to execute.
	 * @throws SQLException
	 *             if a database access error occurs
	 * @return The number of rows updated.
	 */
	public int update(String sql, Connection con) throws SQLException {
		return this.update(sql, con, (Object[]) null);
	}

	/**
	 * Executes the given INSERT, UPDATE, or DELETE SQL statement with a single
	 * replacement parameter. （not have "**=?" in sql）.
	 * 
	 * @param sql
	 *            The SQL statement to execute.
	 * @param param
	 *            The parem to replacement
	 * @throws SQLException
	 *             if a database access error occurs
	 * @return The number of rows updated.
	 */
	public int update(String sql, Connection con, Object param) throws SQLException {
		return this.update(sql, con, new Object[] { param });
	}

	/**
	 * Calls update after checking the parameters to ensure nothing is null.
	 * 
	 * @param sql
	 *            The SQL statement to execute.
	 * @param params
	 *            An array of update replacement parameters.
	 * @return The number of rows updated.
	 * @throws SQLException
	 *             If there are database or parameter errors.
	 */
	public int update(String sql, Connection con, Object... params) throws SQLException {
		checkParams(sql, con);
		PreparedStatement stmt = null;
		int rows = 0;
		try {
			stmt = con.prepareStatement(sql);
			this.fillStatement(stmt, params);
			rows = stmt.executeUpdate();
		} catch (SQLException e) {
			this.rethrow(e, sql, params);
		} finally {
			closeAll(null, stmt, con);
		}

		return rows;
	}

	/**
	 * 关闭链接对象
	 * 
	 * @param rest
	 * @param pStmt
	 * @param conn
	 * 
	 * @throws SQLException
	 */
	private void closeAll(ResultSet rest, PreparedStatement pStmt, Connection conn) {
		try {
			if (rest != null) {
				rest.close();
				rest = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (pStmt != null) {
				pStmt.close();
				pStmt = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Throws a new exception with a more informative error message.
	 * 
	 * @param cause
	 *            The original exception that will be chained to the new
	 *            exception when it's rethrown.
	 * 
	 * @param sql
	 *            The query that was executing when the exception happened.
	 * 
	 * @param params
	 *            The query replacement parameters; <code>null</code> is a valid
	 *            value to pass in.
	 * 
	 * @throws SQLException
	 *             if a database access error occurs
	 */
	private void rethrow(SQLException cause, String sql, Object... params)
			throws SQLException {

		String causeMessage = cause.getMessage();
		if (causeMessage == null) {
			causeMessage = "";
		}
		StringBuffer msg = new StringBuffer(causeMessage);

		msg.append(" Query: ");
		msg.append(sql);
		msg.append(" Parameters: ");

		if (params == null) {
			msg.append("[]");
		} else {
			msg.append(Arrays.deepToString(params));
		}

		SQLException e = new SQLException(msg.toString(), cause.getSQLState(),
				cause.getErrorCode());
		e.setNextException(cause);

		throw e;
	}

	/**
	 * Fill the PreparedStatement replacement parameters with the given objects
	 * array.
	 * 
	 * @param stmt
	 *            PreparedStatement to fill
	 * @param params
	 *            Query replacement parameters; null is a valid value to pass
	 *            in.
	 * @throws SQLException
	 *             if a database access error occurs
	 */
	private void fillStatement(PreparedStatement stmt, Object... params)
			throws SQLException {

		// check the parameter count
		ParameterMetaData pmd = null;
		pmd = stmt.getParameterMetaData();
		int stmtCount = pmd.getParameterCount();
		int paramsCount = params == null ? 0 : params.length;

		if (stmtCount != paramsCount) {
			throw new SQLException("Wrong number of parameters: expected "
					+ stmtCount + ", was given " + paramsCount);
		}

		// nothing to do here
		if (params == null) {
			return;
		}

		for (int i = 0; i < params.length; i++) {
			if (params[i] != null) {
				stmt.setObject(i + 1, params[i]);
			} else {
				int sqlType = Types.VARCHAR;
				try {
					sqlType = pmd.getParameterType(i + 1);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				stmt.setNull(i + 1, sqlType);
			}
		}
	}

	/**
	 * 检测传参数正确性
	 * @param sql
	 * @param con
	 * @return
	 *
	 * author 秦伟
	 * time 2014-2-27 下午05:32:24
	 * @throws SQLException 
	 */
	private void checkParams(String sql, Connection con) throws SQLException {
		if (con == null) {
			throw new SQLException("Null connection");
		}

		if (sql == null) {
			closeAll(null, null, con);
			throw new SQLException("Null SQL statement");
		}
	}
}
