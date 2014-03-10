package ulezu.com.controler.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ulezu.com.business.BHouseInfo;
import ulezu.com.controler.servlet.common.UleResponse;
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
     * @see HttpServlet#HttpServlet()
     */
    public CHouseInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		MHouseInfo info = null;
		try{
			info = this.houseInfoBusi.getHouseInfoById(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		JsonHelper.printObjectToJsonString(response, info);
	}

}
