package ulezu.com.controler.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ulezu.com.business.BHouseInfo;
import ulezu.com.model.MHouseInfo;
import ulezu.com.util.EscapeAndUnescapeUtil;
import ulezu.com.util.JsonHelper;

/**
 * Servlet implementation class SearchServlet
 */
public class CSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * 房屋信息处理
	 */
	private BHouseInfo houseInfoBusi = null;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CSearchServlet() {
        super();
    }
	
	/**
     * 初始化方法
     */
    @Override
    public void init() throws ServletException {
    	this.houseInfoBusi = new BHouseInfo();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//先从缓存中加载数据，然后再从数据库中加载数据
		String searchValue = request.getParameter("v");
		String searchSelectAddress = request.getParameter("h");
		if("none".equals(EscapeAndUnescapeUtil.unescape(searchSelectAddress))){
			String[] searchArr = searchValue.split(" ");
			for (String value : searchArr) {
				this.homeQuery(value, response);
			}
		}else{
			this.homeQuery(EscapeAndUnescapeUtil.unescape(searchSelectAddress), response);
			
		}
	}
	
	/**
	 * 首页查询（10条）
	 * @param keyWord 查询关键字
	 * @param response  相应对象
	 */
	private void homeQuery(String keyWord, HttpServletResponse response){
		try {
			List<MHouseInfo> infos = this.houseInfoBusi.homeQuery(keyWord, 5);
			JsonHelper.printObjectListToJsonString(response, infos);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
