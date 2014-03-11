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
    		type: "GET",
    		dataType: "json",
    		url: "houseinfo.do?id=456456456&type=get",
    		success: function(v){
    			alert(v.userName);
    			
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
                <a>登陆</a>&nbsp;|&nbsp;<a>注册</a>&nbsp;&nbsp;&nbsp;&nbsp;<a>帮助</a>
            </div>
        </div>
        <div style="margin-left: auto;margin-right:auto;width:1000px;">
            <div style="width:1000px;margin-top:30px;">
                <div style="float:left;width:120px;font-size:20px;height:30px;line-height: 40px;color:#444;">【(单间出租)</div>
                <div style="float:left;width:880px;font-size:20px;height:30px;line-height: 40px;color:#444;">国际花园】</div>
                <div style="float:left;width:960px;font-size:20px;height:auto;line-height: 40px;color:#666;padding: 0px 20px 0px 50px;">红枫岭300-650单间都有SM广场音乐公园旁红枫岭300-650单间都有SM广场音乐公园旁红枫岭300-650单间都有SM广场音乐公园旁红枫岭300-650单间都有SM广场音乐公园旁红枫岭300-650单间都有SM广场音乐公园旁 </div>
             <div style="float:left;width:1000px;font-size:10px;height:15px;line-height: 20px;color:#666;">
                <div class="small_time">2014-02-27</div>
                <div class="small_people_num">253</div>
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
                    	<%-- <% MHouseInfo info = (MHouseInfo)request.getAttribute("houseBean");
                    	if(info == null){

                        	System.out.println("aa");
                    	}else{

                        	System.out.println("bb"+info.getUserName());
                    	}
                    	%> --%>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:50px;padding: 10px 10px 10px 30px;">价格</div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:648px;padding: 10px;">
                        <span style="color:#e22;font-size: 18px;">550 </span>元/月&nbsp;&nbsp;&nbsp; <span>押一付一</span>
                        </div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:50px;padding: 10px 10px 10px 30px;">整体</div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:648px;padding: 10px;">
                            <span>1室 0厅 1卫</span>&nbsp;&nbsp;&nbsp; <span>精装修</span>
                        </div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:50px;padding: 10px 10px 10px 30px;">楼层</div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:648px;padding: 10px;">
                            <span>12</span>层/<span>34</span>层
                        </div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:50px;padding: 10px 10px 10px 30px;">出租</div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:648px;padding: 10px;">
                            <span>主卧</span>&nbsp;&nbsp;&nbsp; <span>23㎡</span>&nbsp;&nbsp;&nbsp; <span>公寓</span>&nbsp;&nbsp;&nbsp; <span>男女不限</span>
                        </div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:50px;padding: 10px 10px 10px 30px;">区域</div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:648px;padding: 10px;">
                            <span>成华</span> - <span>建设路</span> -<span> 红枫岭三期</span>
                        </div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:50px;padding: 10px 10px 10px 30px;">地址</div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:648px;padding: 10px;">
                            <span>成都市建设南路SM广场音乐公园旁圣灯路111号</span> （<a href="#">交通地图</a>）
                        </div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:50px;padding: 10px 10px 10px 30px;">联系</div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:648px;padding: 10px;">
                            张先生
                        </div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:50px;padding: 10px 10px 10px 30px;">电话</div>
                        <div style="float:left;color: #9a9a9a;font-size:18px;width:648px;padding: 10px;"><img src="image/dianhua.gif"/></div>
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
