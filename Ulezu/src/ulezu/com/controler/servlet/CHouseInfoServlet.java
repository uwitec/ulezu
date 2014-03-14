package ulezu.com.controler.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ulezu.com.business.BHouseInfo;
import ulezu.com.model.MHouseInfo;

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
		String action = request.getParameter("action");
		if("get".equals(action)){	
			String id = request.getParameter("id");	
			request.setAttribute("houseBean", this.getHouseInfoById(id));
			RequestDispatcher rd = request.getRequestDispatcher("detail.jsp") ;
			rd.forward(request,response) ;
		}else if("count".equals(action)){
			String id = request.getParameter("id");
			this.updateAccessCountById(id);
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
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 通过ID更新访问量
	 * @param id ID
	 * @return 返回更新的行数
	 */
	private int updateAccessCountById(String id){
		try {
			return this.houseInfoBusi.updateAccessCountById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
