<%@page import="ulezu.com.model.MHouseInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title></title>
    <style type="text/css">
        .topNavigate
        {
            _position: static;
            left: 0;
            top: 0;
            width: 100%;
            min-width: 1000px;
            border-bottom: 2px solid #72b088;
            background: #ffffff;
            text-align: left;
            font: 12px/1.5 helvetica,arial, "hiragino sans gb" , "\5b8b\4f53" ,sans-serif;
            color: #323232;
            clear: both;
            box-shadow: 0 2px 2px rgba(0,0,0,0.2);
            height: 50px;
        }
        .small_time
        {
            float: left;
            padding-left: 20px;
            margin-right: 10px;
            background: url(image/main_title_bg.png?v=2012614) no-repeat;
            background-position: 0 0;
        }
        .small_people_num
        {
            float: left;
            padding-left: 20px;
            margin-right: 10px;
            background: url(image/main_title_bg.png?v=2012614) no-repeat;
            background-position: 0 -36px;
        }
    </style>
	<script type="text/javascript" src="js/common/jquery-1.7.1.min.js"></script>
    <script type="text/javascript">
    $(function(){
    	$.ajax({
    		type: "get",
    		dataType: "json",
    		url: "houseInfo.do?action=count&id=456456456",
    		success: function(){
    		}
    	});
    });
    </script>
</head>
<body>
    <div class="topNavigate">
        <div style="margin-left: auto; margin-right: auto; width: 1000px; height: 50px;">
            <div style="float: left; width: 250px; height: 50px;">
                <img src="image/ulezu2_small.jpg" />
            </div>
            <div style="float: left; width: 500px; height: 50px; font-size: 30px;">
            </div>
            <div style="width: 250px; height: 50px; float: left; color: #444; font-size: 18px;"
                align="right">
                <a href="login.jsp">登陆</a>&nbsp;|&nbsp;<a href="register.jsp">注册</a>&nbsp;&nbsp;&nbsp;&nbsp;<a>帮助</a>
            </div>
        </div>
        <div style="margin-left: auto;margin-right:auto;width:1000px;">
        	<% MHouseInfo info = (MHouseInfo)request.getAttribute("houseBean");
    			String roomType = "";
    			String sexType = "";
    			String rentWay = "";
    			String decorationType = "";
    			String estateType = "";
    			String payType = "";
	        	if(info == null){
	        		response.sendRedirect("404.jsp");
	        		return;
	        	}else{
	        		switch(info.getRoomType()){
		        		case 0:
		        			roomType = "主卧";
		        			break;
		        		case 1:
		        			roomType = "次卧";
		        			break;
		        		case 2:
		        			roomType = "隔断";
		        			break;
	        			default:
		        			roomType = "主卧";
	        				break;
	        		}

	        		switch(info.getSexType()){
		        		case 0:
		        			sexType = "男女不限";
		        			break;
		        		case 1:
		        			sexType = "限男性";
		        			break;
		        		case 2:
		        			sexType = "限女性";
		        			break;
	        			default:
	        				sexType = "男女不限";
	        				break;
	        		}

	        		switch(info.getRentWay()){
		        		case 0:
		        			rentWay = "整套出租";
		        			break;
		        		case 1:
		        			rentWay = "单间出租";
		        			break;
		        		case 2:
		        			rentWay = "床位出租";
		        			break;
	        			default:
	        				rentWay = "整套出租";
	        				break;
	        		}
	        		switch(info.getDecorationType()){
		        		case 0:
		        			decorationType = "毛坯";
		        			break;
		        		case 1:
		        			decorationType = "简装";
		        			break;
		        		case 2:
		        			decorationType = "中等装修";
		        			break;
		        		case 3:
		        			decorationType = "精装";
		        			break;
		        		case 4:
		        			decorationType = "豪华装修";
		        			break;
	        			default:
	        				decorationType = "毛坯";
	        				break;
	        		}

	        		switch(info.getEstateType()){
		        		case 0:
		        			estateType = "公寓";
		        			break;
		        		case 1:
		        			estateType = "住宅";
		        			break;
		        		case 2:
		        			estateType = "商业";
		        			break;
		        		case 3:
		        			estateType = "安置房";
		        			break;
	        			default:
	        				estateType = "公寓";
	        				break;
        			}

	        		switch(info.getPayType()){
		        		case 0:
		        			payType = "押一付三";
		        			break;
		        		case 1:
		        			payType = "押一付一";
		        			break;
		        		case 2:
		        			payType = "押一付二";
		        			break;
		        		case 3:
		        			payType = "半年付";
		        			break;
		        		case 4:
		        			payType = "面议支付方式";
		        			break;
	        			default:
	        				payType = "押一付三";
	        				break;
		    		}
	        	}
        	%>
            <div style="width:1000px;margin-top:30px;">
                <div style="float:left;width:120px;font-size:20px;height:30px;line-height: 40px;color:#444;">【(<%= rentWay %>)</div>
                <div style="float:left;width:880px;font-size:20px;height:30px;line-height: 40px;color:#444;"><%= info.getEstateName() %>】</div>
                <div style="float:left;width:960px;font-size:20px;height:auto;line-height: 40px;color:#666;padding: 0px 20px 0px 50px;"><%= info.getHouseTitle() %> </div>
             <div style="float:left;width:1000px;font-size:10px;height:15px;line-height: 20px;color:#666;">
                <div class="small_time"><%= info.getModifyTime() %></div>
                <div class="small_people_num"><%= info.getA1() %></div>
             </div>
                <div style="float: left; width: 1000px; height: 500px;">
                    <div style="width: 240px; height: 310px; float: left; border: 1px solid #ccc; margin-top: 20px;">
                        <div style="width: 200px; height: 200px; float: left; border: 1px solid #ccc; margin: 20px 20px 20px 20px;">
                        </div>
                        <div style="width: 240px; height: 60px; float: left; margin-top: 5px;">
                            <div style="width: 228px; height: 50px; float: left; border: 1px solid #ccc; margin: 5px 5px 5px 5px;">
                            </div>
                        </div>
                    </div>
                    <div style="float:left;width:758px;">
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:50px;padding: 10px 10px 10px 30px;">价格</div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:648px;padding: 10px;">
                        <span style="color:#e22;font-size: 18px;"><%= info.getRentMoney() %> </span>元/月&nbsp;&nbsp;&nbsp; <span><%= payType %></span>
                        </div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:50px;padding: 10px 10px 10px 30px;">整体</div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:648px;padding: 10px;">
                            <span><%= info.getHouseRoomNum()%>室 <%= info.getHouseTingNum()%>厅 <%= info.getHouseToiletNum()%>卫</span>&nbsp;&nbsp;&nbsp; <span><%= decorationType %></span>
                        </div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:50px;padding: 10px 10px 10px 30px;">楼层</div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:648px;padding: 10px;">
                            <span><%= info.getLayerNum() %></span>层/<span><%= info.getTotleLayerNum() %></span>层
                        </div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:50px;padding: 10px 10px 10px 30px;">出租</div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:648px;padding: 10px;">
                            <span><%= roomType %></span>&nbsp;&nbsp;&nbsp; <span><%= info.getSquareMeter() %>㎡</span>&nbsp;&nbsp;&nbsp; <span><%= estateType %></span>&nbsp;&nbsp;&nbsp; <span><%= sexType %></span>
                        </div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:50px;padding: 10px 10px 10px 30px;">区域</div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:648px;padding: 10px;">
                            <span><%= info.getAddressArea() %></span> - <span><%= info.getAddressCircle() %></span> -<span> <%= info.getAddressAttach() %></span>
                        </div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:50px;padding: 10px 10px 10px 30px;">地址</div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:648px;padding: 10px;">
                            <span><%= info.getAddress() %></span> （<a href="#">交通地图</a>）
                        </div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:50px;padding: 10px 10px 10px 30px;">联系</div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:648px;padding: 10px;">
                            <%= info.getUserName() %>
                        </div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:50px;padding: 10px 10px 10px 30px;">电话</div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:648px;padding: 10px;"><img src="houseInfo.do?action=image&callNum=<%= info.getLinkCallNumber() %>"/></div>
                    </div>
                    <div style="width: 1000px; float: left;">
                        <div style="width: 1000px; float: left;">
                            <div style="width: 120px; text-align:center;float: left; height: 50px; line-height: 60px; vertical-align: middle;
                                font-size: 24px; background-color: #72b088; color: #fff;border-radius:5px;">
                                房源描述</div>
                        </div>
                        <div style="width: 1000px;float:left;" >
                            <div style="color: #9a9a9a;font-size: 18px;line-height: 60px;">
                            房屋配置： 床 衣柜 冰箱 洗衣机 热水器 宽带(这里要加图片，不然不好看)</div>
                        </div>
                        <div style="width: 1000px;float:left;" >
                            <div style="color: #9a9a9a;font-size: 18px;line-height: 60px;">
                            <h4>房屋说明：</h4> 
                            	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃擦擦爱吃
                            </div>
                        </div>
                        <div style="width: 1000px;float:left;" >
                            <div style="color: #9a9a9a;font-size: 18px;float:left;width:1000px;line-height: 40px;">
                            房屋图片：
                            </div>
                            <div style="color: #9a9a9a;font-size: 18px;float:left;width:1000px;">
                            	<img src="image/testhouse.jpg"/><br/><br/>
                            	
                            	<img src="image/testhouse.jpg"/><br/><br/>
                            	<img src="image/testhouse.jpg"/><br/><br/>
                            	<img src="image/testhouse.jpg"/><br/><br/>
                            	<img src="image/testhouse.jpg"/>
                            </div>
                        </div>
                        <div style="width: 1000px;float:left;" >
                            <div style="color: #9a9a9a;font-size: 18px;float:left;width:1000px;line-height: 40px;">
                            <h4>交通地图：</h4>
                            </div>
                            <div style="color: #9a9a9a;font-size: 18px;float:left;width:1000px;border: 1px #ccc solid;height:400px;">
                            
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
