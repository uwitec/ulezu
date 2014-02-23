<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>优乐租-成都最大的在线租房交易平台</title>
	<script type="text/javascript" src="js/common/jquery-1.4.1.min.js"></script>
	<script type="text/javascript">		
		function register(){
			$.ajax({
				type: "GET",
				dataType: "json",
				url: "./userMapping?type=1&loginType=0&loginName=syc&password=syc",
				success: function(v){
					if(v["boolean"] == "true"){
						alert("注册成功!");
					}else{
						alert("注册失败!");
					}
						
				}
			});
		}
	</script>
    <style type="text/css"> 
    	 a
    	 {
    	 	text-decoration:none;    	 	
    	 }
        .body
        {
            width: 100%;
            height: auto;
            background-color: #EEEEEF;
        }
        .mainBody
        {
            width: 1000px;
            margin-left: auto;
            margin-right: auto;
            height: auto;
            z-index: 2;
        }
        .top
        {
            margin-left: auto;
            margin-right: auto;
            width: 100%;
            height: 80px;
            background-color: #fff;
        }
        .area
        {
            margin-left: auto;
            margin-right: auto;
            height: 300px;
            width: 100%;
        }
        .main
        {
            margin-left: auto;
            margin-right: auto;
            width: 100%;
            height: auto;
            background-color: #EEEEEF;
        }
        .bottom
        {
            margin-left: auto;
            margin-right: auto;
            width: 100%;
            border-top: 3px green solid;
            height: 200px;
            background-color: #EEEEEF;
            margin-top: 20px;
        }
       .btnRegister
        {
            background-color: #1da811;
            width: 350px;
            height: 40px;
            line-height: 40px;
            color: #fff;
            font-size: 18px;
            text-align: center;
            border: 1px solid #1da811;
            background-position: 0 -142px;
            background-repeat: repeat-x;
            border-radius: 2px;
            cursor: pointer;
            padding-bottom: 5px;
            margin: 15px 24px 15px 24px;
        }
        .topNavigate
        {
            margin-left: auto;
            margin-right: auto;
            width: 100%;
            height: 50px;
            background-color: #3CAC7E;
        }
        .backgroundBody
        {
            z-index: 1;
            height: 130px;
            width: 100%;
        }
        
        .state
        {
            width: 100%;
            font-size: 33px;
            color: #636363;
            line-height: 45px;
            margin: 25px auto 0px auto;
            font-family: 隶书;
            font-weight: bold;
        }
        .houseNum
        {
            width: 100%;
            font-size: 13px;
            color: #0f8b67;
            margin: 0px auto 0px auto;
        }
        .address
        {
            display: block;
            float: left;
            padding: 0 5px;
            line-height: 24px;
            color: #999;
            font-size: 14px;
        }
        .topTitle
        {
            width: 1000px;
            height: 80px;
            margin-left: auto;
            margin-right: auto;
        }
        .bottom div ul li
        {
            color: #777;
            list-style: none;
            line-height: 25px;
            font-size: 13px;
        }
        .liHeader
        {
            font-size: 18px !important;
            font-weight: bold;
        }
        .detail-btn
        {
            width: 100px;
            height: 40px;
            overflow: hidden;
            float: right;
            text-align: center;
            line-height: 40px;
            background-position: 0px -138px;
            font-size: 16px;
            color: #fff;
            font-weight: bold;
            background-image: url(image/buttonImg.jpg);
            margin: 0px 30px 0px 0px;
        }
        .detail-btn1
        {
        	width: 100px;
            height: 40px;
            overflow: hidden;
            float: right;
            text-align: center;
            line-height: 40px;
            background-position: 0px -138px;
            font-size: 16px;
            color: #fff;
            font-weight: bold;
            background-image: url(image/contact.jpg);
            margin: 0px 30px 0px 0px;
        }
    </style>
</head>
<body>
    <div class="body">
        <div class="backgroundBody">
            <div class="top">
                <div class="topTitle">
                    <div style="width: 400px; height: 80px; float: left;">
                        <a href="home.jsp"><img src="image/ulezu2.jpg" /></div></a>
                    <div style="width: 600px; height: 80px; float: left;">
                        <div style="width: 250px; height: 30px; float: left; padding-top: 50px; color: #444;
                            font-size: 14px;">
                            成都最大的在线租房交易平台
                        </div>
                        <div style="width: 350px; height: 30px; float: left; padding-top: 50px; color: #444;
                            font-size: 18px;" align="right">
                            <a>登陆</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a>帮助</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="topNavigate">
            </div>
        </div>
        <div class="mainBody">
        	<div class="main">
        		<div><input type="button" class="btnRegister" value="立即注册" id="btnRegister" onclick="register();"/></div>
        	</div>	
            <div class="bottom">
                <div style="width: 150px; float: left; margin-top: 10px;">
                    <ul>
                        <li class="liHeader">关于我们</li>
                        <li>优乐租简介</li>
                        <li>联系我们</li>
                        <li>合作伙伴</li>
                    </ul>
                </div>
                <div style="width: 150px; float: left; margin-top: 10px;">
                    <ul>
                        <li class="liHeader">加入我们</li>
                        <li>房源供应</li>
                        <li>共同开发</li>
                    </ul>
                </div>
                <div style="width: 150px; float: left; margin-top: 10px;">
                    <ul>
                        <li class="liHeader">网站条款</li>
                        <li>会员条款</li>
                        <li>社区指南</li>
                        <li>版权声明</li>
                        <li>免责声明</li>
                    </ul>
                </div>
                <div style="width: 150px; float: left; margin-top: 10px;">
                    <ul>
                        <li class="liHeader">帮助中心</li>
                        <li>新手上路</li>
                        <li>使用帮助</li>
                        <li>建议和投诉</li>
                        <li>网站地图</li>
                    </ul>
                </div>
                <div style="width: 150px; float: left; margin-top: 10px;">
                    <ul>
                        <li class="liHeader">关注我们</li>
                    </ul>
                </div>
                <div style="width: 250px; float: left; margin-top: 10px;">
                    
                </div>
            </div>
        </div>
    </div>
</body>
</html>
