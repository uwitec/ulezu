package ulezu.com.controler.servlet;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import ulezu.com.business.BHouseInfo;
import ulezu.com.business.BUser;
import ulezu.com.common.IDFactory;
import ulezu.com.controler.servlet.common.UlezuHttpServlet;
import ulezu.com.model.MHouseInfo;
import ulezu.com.model.MObjectValue;
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
			release(request, response);
		} 
	}

	/**
	 * 增加房屋信息
	 *@author qw
	 *@version 创建时间:2014-3-18下午04:34:54
	 *@param request
	 * @param response 
	 * @throws Exception 
	 */
	private void release(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//BUser  bUser = new BUser();
	//	if(!bUser.isAvailableUser(request.getParameter("email"), request.getParameter("userPassword"))) {
		//	response(response, "0");
		//}
		
		JSONObject jsonObject = JsonHelper.readJSONObject(request);
		MHouseInfo houseInfo = 	(MHouseInfo)JSONObject.toBean(jsonObject, MHouseInfo.class);
		
		
		request.getSession().setAttribute("userName", "秦伟");//测试用
		/*设置默认值*/
		houseInfo.setId(IDFactory.getId("ulezu", "houseInfo"));
		houseInfo.setUserName((String) request.getSession().getAttribute("userName"));
		houseInfo.setIsHome(0);//0否，1是
		houseInfo.setModifyTime(new Date());
		houseInfo.setIsDelete(0);//0未删除，1删除
		houseInfo.setIsValid(1);//已通过，未通过
		houseInfo.setHouseTitle("【" + MObjectValue.rentWayElements[houseInfo.getRentWay()] + "】 " + houseInfo.getAddressCircle() + " " + MObjectValue.decorationTypeElements[houseInfo.getDecorationType()]);//title为： 【出租方试】+ 商圈 + 装修情况
		houseInfo.setAddress(houseInfo.getAddressArea() + houseInfo.getAddressCircle() + houseInfo.getAddressAttach());//地址为 区域+商圈+附属
		
		
		try {
			if(!houseInfoBusi.addHouseInfo(houseInfo)) {
				response(response, "1");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response(response, super.getJsonMsg("发布成功"));
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
