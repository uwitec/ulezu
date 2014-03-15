package ulezu.com.controler.servlet;

import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import ulezu.com.business.BHouseInfo;
import ulezu.com.business.BUser;
import ulezu.com.controler.servlet.common.UlezuHttpServlet;
import ulezu.com.model.MHouseInfo;
import ulezu.com.util.JsonHelper;

/**
 * CHouseInfoServlet
 */
public class CHouseInfoServlet extends UlezuHttpServlet {
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
	 * @see doPost
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String action = request.getParameter("action");
		if("get".equals(action)){	
			String id = request.getParameter("id");	
			request.setAttribute("houseBean", this.getHouseInfoById(id));
			forwardToUrl(request, response, "detail.jsp");
		}else if("count".equals(action)){
			String id = request.getParameter("id");
			this.updateAccessCountById(id);
		}else if("release".equals(action)) {
			BUser  bUser = new BUser();
			JSONObject jsonObject = JsonHelper.readJSONObject(request);
			if(!bUser.isAvailableUser(jsonObject.getString("email"), jsonObject.getString("userPassword"))) {
				response(response, "0");
			}
			
			MHouseInfo houseInfo = 	(MHouseInfo)JSONObject.toBean(jsonObject, MHouseInfo.class);
			
			System.out.println(houseInfo.getLinkMan());
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
