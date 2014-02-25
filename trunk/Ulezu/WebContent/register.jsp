<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/register.css" type="text/css" />
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
