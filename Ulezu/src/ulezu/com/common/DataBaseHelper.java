package ulezu.com.common;

import java.lang.reflect.Field;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 鐢抽奔宸�
 * @category 鏁版嵁搴撴搷浣滅被
 */
public class DataBaseHelper {
	Connection conn=null;
	PreparedStatement ps=null;
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @author:鐢抽奔宸�
	 * @Date:
	 * @Description:  杩炴帴鏁版嵁搴�
	 */
	public Connection getConnection(){
		try {
			conn=DriverManager.getConnection(DBParameters.DBURL,DBParameters.DBUSERNAME,DBParameters.DBPASSWORD);
			if(conn==null){
				return conn=null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * 
	 * @author:鐢抽奔宸�
	 * @Date:
	 * @Description:  鑾峰彇棰勭紪璇�
	 * @return :Statement
	 * @throws Exception 锛氬紓甯�
	 */
	public PreparedStatement getPreparedStatement(String sql) { 
		try {
			ps=conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ps; 
	} 
	public int getCount(String sql){
		int count = 0;
		getPreparedStatement(sql);
		ResultSet rs=executeQuery();
		try {
			if(rs.next()){
				count=Integer.parseInt(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	/**
	 * 
	 * @author:鐢抽奔宸�
	 * @Description:  鎵ц鏌ヨ
	 * @param :stmt
	 *   @param :stmt
	 * @return :Resultset
	 * @throws Exception 锛氬紓甯�
	 */
	public ResultSet executeQuery() { 
		ResultSet rs = null;
		try {
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return rs; 
	} 
	/**
	 * 
	 * @author:lijiang
	 * @Date:2011-10-17:涓婂崍09:26:45
	 * @Description:  鍏抽棴鏁版嵁搴�
	 * @param :rs锛宲s锛宑onn
	 * @throws Exception 锛氬紓甯�
	 */
	public <T> List<T> getResult(String sql,T t){
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery(); 
			Field[] fileds=t.getClass().getFields();
			while(rs.next()){

				rs.getString(fileds[1].getName());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public void Close(ResultSet rs,PreparedStatement ps){
		try{
			if(rs!=null){
				rs.close();
			}
			if(ps!=null){
				ps.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 *@Description:鍏抽棴鏁版嵁搴�
	 *@author:鐢抽奔宸�
	 */
	public void Close(){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public CallableStatement getCallableStatement(String callstr) {			
		CallableStatement cs=null;

		try {				
			cs=conn.prepareCall("{"+callstr+"}");		
			Close();
		} catch (Exception e) {		
			e.printStackTrace();	
		}		

		return cs;	
	}
	public ResultSet executeQuery(CallableStatement cs) throws Exception{ 
		ResultSet rs=cs.executeQuery(); 
		return rs; 
	} 
}