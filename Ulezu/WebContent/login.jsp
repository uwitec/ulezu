<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>优乐租-成都最大的在线租房交易平台</title>
<style type="text/css">
.topNavigate {
	_position: static;
	left: 0;
	top: 0;
	width: 100%;
	min-width: 1000px;
	border-bottom: 2px solid #72b088;
	background: #ffffff;
	text-align: left;
	font: 12px/1.5 helvetica, arial, "hiragino sans gb", "\5b8b\4f53",
		sans-serif;
	color: #323232;
	clear: both;
	box-shadow: 0 2px 2px rgba(0, 0, 0, 0.2);
	height: 50px;
}

.registerDiv {
	position: fixed;
	top: 0;
	left: 0;
	bottom: 0;
	right: 0;
	z-index: -1;
}

.registerDiv>img {
	height: 100%;
	width: 100%;
	border: 0;
}

.register {
	position: absolute;
	background-color: #fff;
	width: 450px;
	height: 350px;
	left: 50%;
	top: 50%;
	margin-left: -225px;
	margin-top: -100px;
}

.existAccount {
	position: relative;
	width: 410px;
	height: 70px;
	float: left;
	margin: 20px 20px 0px 20px;
}

.huo {
	position: relative;
	float: left;
	width: 410px;
	margin: 0px 20px 0px 20px;
	text-align: center;
	height: 40px;
}

.weibo_btn {
	background: url(image/ks_login.png) no-repeat;
	width: 100px;
	height: 30px;
	overflow: hidden;
	cursor: pointer;
	border-radius: 3px;
	display: inline-block;
	margin: 0 8px;
	color: #fff;
	font-weight: bold;
}

.qq_btn {
	background: url(image/ks_login.png) no-repeat;
	width: 100px;
	height: 30px;
	padding-left: 4px;
	overflow: hidden;
	cursor: pointer;
	border-radius: 3px;
	display: inline-block;
	color: #fff;
	font-weight: bold;
	background-position: -110px 0;
}

.otherLogin {
	position: relative;
	float: left;
	width: 390px;
	margin: 10px 20px 0px 0px;
	text-align: center;
}

.input_email {
	width: 370px;
	height: 30px;
	vertical-align: middle;
	font-size: 16px;
	color: #777;
	border: 1px solid #ccc;
	font-style: italic;
}

.btn_register {
	width: 248px;
	height: 36px;
	font-weight: bold;
	vertical-align: middle;
	background-color: #5cad77;
	color: #fff;
	display: inline-block;
	padding: 0 25px;
	border: none;
	border-radius: 3px;
	overflow: visible;
	font-size: 18px;
	line-height: 36px;
	font-family: "Hiragino Sans GB", "Microsoft YaHei", \9ED1\4F53,
		\5b8b\4f53, sans-serif;
	text-align: center;
	cursor: pointer;
}

.btn_login_email {
	display: inline-block;
	height: 36px;
	padding: 0 25px;
	border: none;
	border-radius: 3px;
	overflow: visible;
	font-size: 18px;
	line-height: 36px;
	font-family: "Hiragino Sans GB", "Microsoft YaHei", \9ED1\4F53,
		\5b8b\4f53, sans-serif;
	color: #fff;
	text-align: center;
	cursor: pointer;
	background-color: #3f9f5f;
	width: 250px;
}

.control-group {
	float: left;
	width: 350px;
	margin: 0 10px;
}

/*Tooltips*/
.tooltips_main {
	position: absolute;
	left: 0;
	margin: -5px 0 0 2px;
	z-index: 999;
}

.tooltips_box,.tooltips,.msg {
	display: inline-block;
	*display: inline;
	*zoom: 1;
	position: relative;
	border-style: solid;
	border-color: #FF1F1F;
}

.tooltips,.msg {
	border-width: 0 1px;
	*left: -2px;
	background-color: #FFCFCF;
}

.tooltips_box {
	border-width: 1px;
	line-height: 1.5;
}

.tooltips {
	margin: 0 -2px;
}

.msg {
	margin: 1px -2px;
	padding: 0 6px;
	color: #2F2C2C;
	text-shadow: 0 1px 0 #FFFFFF;
	font-size: 12px;
}

.ov {
	background: url('image/tri.gif') no-repeat scroll 0 0 transparent;
	position: absolute;
	left: 30%;
	overflow: hidden;
	width: 15px;
	height: 15px;
	margin: 16px 0 0 0;
	display: inline;
}
/*end Tooltips*/
.txtRegistered{
	width:280px;
	height:30px;
	font-size: 18px;
	color: #777;
}
</style>
<link rel="stylesheet" type="text/css" href="css/easyui.css">
<script type="text/javascript" src="js/common/jquery-1.7.1.min.js"></script>
<script type="text/javascript">
	function login(){
    	$.ajax({
    		type: "post",
    		dataType: "json",
    		url: "userMapping?type=0&userName="+$("#txtEmail").val()+"&password="+$("#txtPass").val(),
    		success: function(v){
    		}
    	});    	
	}
</script>
</head>
<body>

	<div class="topNavigate">
		<div 
			style="margin-left: auto; margin-right: auto; width: 1000px; height: 50px;">
			<div style="float: left; width: 250px; height: 50px;">
				<img src="image/ulezu2_small.jpg" />
			</div>
			<div
				style="float: left; width: 500px; height: 50px; font-size: 45px;">
				菜单菜单菜单菜单</div>
			<div
				style="width: 250px; height: 350px; float: left; color: #444; font-size: 18px;"
				align="right">
				<a href="register.jsp">注册</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a>帮助</a>
			</div>
		</div>
	</div>
	<div class="registerDiv">
		<div class="register" style="display:block;">
			<div class="existAccount">
				<div style="color: #636363; font-weight: bold;">使用以下账号登陆</div>
				<div class="otherLogin">
					<a class="weibo_btn"></a><a class="qq_btn"></a>
				</div>
			</div>
			<div class="huo">
				<img src="image/huo_icon.png" />
			</div>
			<div>
				<div
					style="margin: 0px 20px 0px 20px; width: 410px; color: #636363; line-height: 40px;">
					<div style="float: left; width: 210px; font-weight: bold;">
						使用优乐租帐号</div>
					<div
						style="float: left; width: 200px; text-align: right; font-size: 12px;">
						没有账号？<a href="register.jsp">注册</a>
					</div>
				</div>
				<div
					style="margin: 10px 20px 0px 20px; width: 410px; color: #636363; font-size: 12px; text-align: right; line-height: 20px; color: #fff;">
					优乐租</div>
					<div style="float:left;margin: 10px 20px 0px 10px; width: 430px; color: #636363; text-align: center; line-height: 40px;">
						<span class="control-group" id="email_input">
							<input id="txtEmail" type="text" value="请输入邮箱/用户名/电话号码"
								class="input_email" />
						</span>
					</div> 
				<div
					style="float:left;margin: 10px 20px 0px 20px; width: 410px; color: #636363; font-size: 12px; line-height: 40px;">
					<input id="txtPass" type="password" value="请输入密码"
								class="input_email" />
				</div>
				<div
					style="margin: 10px 20px 0px 20px; width: 410px; color: #636363; text-align: center;">
					<input type="button" value="立即登陆" class="btn_register"
						onclick="login();" />
				</div>
			</div>
		</div>
		
		<img src="image/123.jpg" />
	</div>
</body>
</html>
