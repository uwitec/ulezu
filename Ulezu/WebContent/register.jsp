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
	color: #ccc;
	border: 1px solid #ccc;
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
</style>
<link rel="stylesheet" type="text/css" href="css/easyui.css">
<script type="text/javascript" src="js/common/jquery-1.7.1.min.js"></script>
<script type="text/javascript">
	var email_address_set = ['http://webmail24.189.cn/',
			'http://www.126.com/',
			'http://www.2980.com/',
			'http://www.188.com/',
			'http://www.yeah.net/',
			'http://mail.wo.com.cn/',
			'http://www.263.net/'
		];
	var login_email_address = '';

	$(document).ready(function() {
		/*点击隐藏错误提示*/
		$('#email').focus(function() {
			if (this.value == '输入邮箱，用于登陆和找回密码') {
				this.value = '';
				this.style.color = 'black';
			}
			hideTooltips('email_input');
		});
	});

	function register() {
		var email = $("#email").val();
		if (email == '' || !isEmail(email)) {
			showTooltips('email_input', '请输入正确的邮箱格式');
			return;
		}
		$.ajax({
			type : "GET",
			dataType : "json",
			url : "./userMapping",
			data : {
				type : 1,
				loginType : 0,
				email : email
			},
			success : function(v) {
				if (v["data"] == "true") {
					$(".register:eq(0)").css("display", "none");
					$(".register:eq(1)").css("display", "block");
					$("#input_email_address").html(email);
					login_email_address = get_login_email_address(email);
					alert(login_email_address);
				} else {
					showTooltips('email_input', v.data);
				}
			}
		});
	}

	/**** 是否为合法Email地址 ****/
	function isEmail(value) {
		if (value.search(/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/) == -1)
			return false;
		else
			return true;
	}

	/*
	 *msgid:想让tooltips出现的地方的id
	 *msg:提示的内容
	 *time:自动消失的时间，如果不想让提示自动消失，则此参数不写
	 */
	function showTooltips(msgid, msg, time) {
		if (msgid == '') {
			return;
		}
		if (msg == '') {
			msg = 'Error!';
		}
		$('#' + msgid)
				.prepend(
						"<div class='for_fix_ie6_bug' style='position:relative;'><div class='tooltips_main'><div class='tooltips_box'><div class='tooltips'><div class='msg'>"
								+ msg
								+ "</div></div><div class='ov'></div></div></div></div>");
		$('#' + msgid + ' .tooltips_main').fadeIn("slow").animate({
			marginTop : "-23px"
		}, {
			queue : true,
			duration : 400
		});
		try {
			if (typeof time != "undefined") {
				setTimeout('hideTooltips("' + msgid + '")', time);
			}
		} catch (err) {
		}

	}

	function hideTooltips(msgid) {
		try {
			$('#' + msgid).find('.tooltips_main').fadeOut("slow");
			$('#' + msgid).find('.tooltips_main').remove();
		} catch (e) {
		}
	}
	
	/*前往邮箱点击事件*/
	function btn_login_email_onclick() {
		window.open(login_email_address,'_blanks');
	}
	
	/*得到邮箱登录地址*/
	function get_login_email_address(email) {
		var type = email.substring(email.indexOf("@") + 1, email.indexOf(".") + 1).toLowerCase();
		if(type == "gmail.") {
			return 'https://mail.google.com/';
		}
		for(var i = 0; i < email_address_set.length; i++) {
			if(email_address_set[i].search(type) != -1) {
				return email_address_set[i];
			}
		}
		return 'http://mail.' + email.substring(email.indexOf("@") + 1);
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
				<a>登陆</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a>帮助</a>
			</div>
		</div>
	</div>
	<div class="registerDiv">
		<div class="register" style="display: block;">
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
						注册优乐租帐号</div>
					<div
						style="float: left; width: 200px; text-align: right; font-size: 12px;">
						已有账号？<a href="#">登陆</a>
					</div>
				</div>
				<div
					style="margin: 10px 20px 0px 20px; width: 410px; color: #636363; font-size: 12px; text-align: right; line-height: 20px; color: #fff;">
					优乐租</div>
				<span class="control-group" id="email_input">
					<div
						style="margin: 10px 20px 0px 10px; width: 430px; color: #636363; text-align: center; line-height: 40px;">
						<input id="email" type="text" value="输入邮箱，用于登陆和找回密码"
							class="input_email" />
					</div> </span>
				<div
					style="margin: 10px 20px 0px 20px; width: 410px; color: #636363; font-size: 12px; line-height: 40px;">
					<input type="checkbox" checked="checked" />我同意接受优乐租<a href="#">会员条款</a>和<a
						href="#">免责声明</a>
				</div>
				<div
					style="margin: 10px 20px 0px 20px; width: 410px; color: #636363; text-align: center;">
					<input type="button" value="立即注册" class="btn_register"
						onclick="register();" />
				</div>
			</div>
		</div>
		<div class="register" style="display: none;">
			<div style="background-color: #ccc;">
				<div
					style="width: 410px; float: left; margin: 20px 20px 0px 20px; font-size: 14px; color: #636363;">
					<div
						style="width: 190px; float: left; font-size: 14px; color: #636363; line-height: 20px;">
						验证邮件已发送到您的邮箱：</div>
					<div id="input_email_address"
						style="width: 220px; font-size: 16px; float: left; color: #636363; line-height: 20px;">
					</div>
					<div
						style="width: 100%; font-size: 14px; float: left; color: #636363; line-height: 20px; margin-bottom: 40px;">
						请点击邮件中的确认链接完成验证</div>
					<div
						style="width: 100%; font-size: 14px; float: left; color: #636363; text-align: center; line-height: 100px;">
						<input id="btn_login_email" onclick="btn_login_email_onclick()" type="button" class="btn_login_email" value="前往邮箱"/>
					</div>
					<div
						style="border-top: 2px solid #d7d7d7; height: 30px; width: 410px; float: left; margin-top: 20px;">
					</div>
					<div style="font-size: 12px;">
						<h4>没有收到验证邮件</h4>
						1. 电子邮件偶尔会有延时状况，请耐心等待<br /> 2. 尝试到垃圾邮件里找找看<br /> 3. 如果仍然没有邮件：<a
							href="#">重新发送验证邮件</a><br /> 4. 邮件地址写错了？<a href="#">重新注册</a>
					</div>
				</div>
			</div>
		</div>
		<img src="image/123.jpg" />
	</div>
</body>
</html>
