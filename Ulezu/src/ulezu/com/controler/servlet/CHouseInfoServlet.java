package ulezu.com.controler.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ulezu.com.business.BHouseInfo;
import ulezu.com.model.MHouseInfo;
import ulezu.com.util.JsonHelper;

/**
 * CHouseInfoServlet
 */
public class CHouseInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * 房屋信息业务类
	 */
	private BHouseInfo houseInfoBusi = null;
	
	/**
     * 初始化方法
     */
    @Override
    public void init() throws ServletException {
    	this.houseInfoBusi = new BHouseInfo();
    }
    
    /**
     * @see CHouseInfoServlet
     */
    public CHouseInfoServlet() {
        super();
    }

	/**
	 * @see doGet
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see doPost
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");	
		String type = request.getParameter("type");
		if(type.equals("get")){
			JsonHelper.printObjectToJsonString(response, this.getHouseInfoById(id));
		}		
	}
	
	/**
	 * 根据ID获取房屋信息
	 * @param id ID
	 * @return 房屋信息
	 */
	private MHouseInfo getHouseInfoById(String id){
		try {
			return this.houseInfoBusi.getHouseInfoById(id);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
