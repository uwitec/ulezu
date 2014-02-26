<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>优乐租-成都最大的在线租房交易平台</title>
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
        .registerDiv
        {
            position: fixed;
            top: 0;
            left: 0;
            bottom: 0;
            right: 0;
            z-index: -1;
        }
        .registerDiv > img
        {
            height: 100%;
            width: 100%;
            border: 0;
        }
        .register
        {
            position: absolute;
            background-color: #fff;
            width: 450px;
            height: 350px;
            left: 50%;
            top: 50%;
            margin-left: -225px;
            margin-top: -100px;
        }
        .existAccount
        {
            position: relative;
            width: 410px;
            height: 70px;
            float: left;
            margin: 20px 20px 0px 20px;
        }
        .huo
        {
            position: relative;
            float: left;
            width: 410px;
            margin: 0px 20px 0px 20px;
            text-align: center;
            height: 40px;
        }
        .weibo_btn
        {
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
        .qq_btn
        {
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
        .otherLogin
        {
            position: relative;
            float: left;
            width: 390px;
            margin: 10px 20px 0px 0px;
            text-align: center;
        }
        .input_email
        {
            width: 370px;
            height: 30px;
            vertical-align: middle;
            font-size: 16px;
            color: #ccc;
            border: 1px solid #ccc;
        }
        .btn_register
        {
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
            font-family: "Hiragino Sans GB" , "Microsoft YaHei" ,\9ED1\4F53,\5b8b\4f53,sans-serif;
            text-align: center;
            cursor: pointer;
        }
        .btn_login_email
        {
            display: inline-block;
            height: 36px;
            padding: 0 25px;
            border: none;
            border-radius: 3px;
            overflow: visible;
            font-size: 18px;
            line-height: 36px;
            font-family: "Hiragino Sans GB" , "Microsoft YaHei" ,\9ED1\4F53,\5b8b\4f53,sans-serif;
            color: #fff;
            text-align: center;
            cursor: pointer;
            background-color: #3f9f5f;
            width: 250px;
        }
        
        .confirm {
    		margin: 30px 0px 100px;
    		padding: 50px 50px 0px;
		}
		
		.confirm .send {
    		padding: 15px 0px 15px 75px;
    		background: url("image/ico_mailsend.gif") no-repeat scroll left top transparent;
		}
		
		.cue {
    		color: rgb(255, 60, 0);
		}
		
		.confirm .ques {
    		background: url("image/ico_ques.gif") no-repeat scroll left top transparent;
		}
		
		
    </style>
    <link rel="stylesheet" type="text/css" href="css/easyui.css">
	<script type="text/javascript" src="js/common/jquery-1.7.1.min.js"></script>
	<script type="text/javascript" src="js/common/jquery.easyui.min.js"></script>
	<script type="text/javascript">		
		function register(){
			var registerVal = $("#register_value").val();
			if(!checkInput(registerVal)) {
				$("#register_value").html("输入信息格式不正确");
				return;
			}
			$.ajax({
				type: "GET",
				dataType: "json",
				url: "./userMapping",
				data:{type:1,loginType:0,registerVal:registerVal},
				success: function(v){
					if(v["data"] == "true"){
						$('#w').window('open');
					}else{
						$("#register_value").html(v["data"]);
					}	
				}
			});
		}

	</script>
</head>
<body>
 <div class="topNavigate">
        <div style="margin-left: auto; margin-right: auto; width: 1000px; height: 50px;">
            <div style="float: left; width: 250px; height: 50px;">
                <img src="image/ulezu2_small.jpg" />
            </div>
            <div style="float: left; width: 500px; height: 50px; font-size: 45px;">
                菜单菜单菜单菜单
            </div>
            <div style="width: 250px; height: 350px; float: left; color: #444; font-size: 18px;"
                align="right">
                <a>登陆</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a>帮助</a>
            </div>
        </div>
    </div>
    <div class="registerDiv">
        <div class="register" style="display: block;">
            <div class="existAccount">
                <div style="color: #636363; font-weight: bold;">
                    使用以下账号登陆
                </div>
                <div class="otherLogin">
                    <a class="weibo_btn"></a><a class="qq_btn"></a>
                </div>
            </div>
            <div class="huo">
                <img src="image/huo_icon.png" />
            </div>
            <div>
                <div style="margin: 0px 20px 0px 20px; width: 410px; color: #636363; line-height: 40px;">
                    <div style="float: left; width: 210px; font-weight: bold;">
                        注册优乐租帐号</div>
                    <div style="float: left; width: 200px; text-align: right; font-size: 12px;">
                        已有账号？<a href="#">登陆</a></div>
                </div>
                <div style="margin: 10px 20px 0px 20px; width: 410px; color: #636363; font-size: 12px;
                    text-align: right; line-height: 20px; color: #fff;">
                    优乐租
                </div>
                <div style="margin: 10px 20px 0px 10px; width: 430px; color: #636363; text-align: center;
                    line-height: 40px;">
                    <input id="register_value" type="text" value="输入邮箱，用于登陆和找回密码" class="input_email" onfocus="if (this.value =='输入邮箱，用于登陆和找回密码'){this.value =''; this.style.color='black'}" onblur="if (this.value ==''){this.value='输入邮箱，用于登陆和找回密码';this.style.color='#ccc'}"/>
                    <br/>
                    <div id="errorMsg" style="color=red"></div>
                </div>
                <div style="margin: 10px 20px 0px 20px; width: 410px; color: #636363; font-size: 12px;
                    line-height: 40px;">
                    <input type="checkbox" checked="checked" />我同意接受优乐租<a href="#">会员条款</a>和<a href="#">免责声明</a>
                </div>
                <div style="margin: 10px 20px 0px 20px; width: 410px; color: #636363; text-align: center;">
                    <input type="button" value="立即注册" class="btn_register" onclick="register();" />
                </div>
            </div>
        </div>
        <div class="register" style="display:none;">
            <div style="background-color: #ccc;">
                <div style="width: 410px; float: left; margin: 20px 20px 0px 20px; font-size: 14px;
                    color: #636363;">
                    <div style="width: 190px; float: left; font-size: 14px; color: #636363; line-height: 20px;">
                        验证邮件已发送到您的邮箱：</div>
                    <div style="width: 220px; font-size: 16px; float: left; color: #636363; line-height: 20px;">
                        123131@qq.com</div>
                    <div style="width: 100%; font-size: 14px; float: left; color: #636363; line-height: 20px;
                        margin-bottom: 40px;">
                        请点击邮件中的确认链接完成验证</div>
                    <div style="width: 100%; font-size: 14px; float: left; color: #636363;
                        text-align: center; line-height: 100px;">
                        <input type="button" class="btn_login_email" value="前往邮箱" /></div>
                    <div style="border-top: 2px solid #d7d7d7; height: 30px; width: 410px; float: left;
                        margin-top: 20px;">
                    </div>
                    <div style="font-size: 12px;">
                        <h4>
                            没有收到验证邮件</h4>
                        1. 电子邮件偶尔会有延时状况，请耐心等待<br />
                        2. 尝试到垃圾邮件里找找看<br />
                        3. 如果仍然没有邮件：<a href="#">重新发送验证邮件</a><br />
                        4. 邮件地址写错了？<a href="#">重新注册</a>
                    </div>
                </div>
            </div>
        </div>
        <img src="image/123.jpg" />
    </div>
</body>
</html>

<div id="w" minimizable="false" collapsible="false" class="easyui-window" title="编辑" data-options="modal:true,closed:true" style="width:740px;height:420px;padding:10px;font-size:15px">
	<ul class="confirm">
		<li class="send">确认信已经成功发送到你的邮箱<span class="cue" id="window_emailAddress"></span>了<br>查看收件箱...点击确认信中的链接地址，就可以完成注册了！</li>
		<li class="ques">如果你很长时间还没有收到ITeye的确认信，请... <br>确认邮件是否被你提供的邮箱系统自动拦截，或被误认为垃圾邮件放到垃圾箱了<br>如果你确认邮箱地址正确，可以请求<a
			href="" id="window_resend_Address">再次发送确认信</a><br>如果还不能解决你的问题，可以发邮件给ITeye管理员寻求帮助：webmaster<img
			src="image/email.gif" alt="Email">iteye.com</li>
	</ul>
</div>
