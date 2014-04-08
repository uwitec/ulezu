<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link href="bootstrap-3.1.1-dist/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<link href="css/release.css" rel="stylesheet" media="screen"
	type="text/css">
<link href="bootstrap-select/bootstrap-select.min.css" rel="stylesheet"
	type="text/css">

<script type="text/javascript" src="js/common/jquery-1.7.1.min.js"></script>
<script type="text/javascript"
	src="bootstrap-3.1.1-dist/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="bootstrap-select/bootstrap-select.min.js"></script>
<script type="text/javascript">
    $(function() {
    	$('[name="releaseErrorMsg"]').parent().find("select").each(function(index,element) {
    		$(element).on("onblur", onInputOver(element));
    	});
    });
    
	//确认并发布
	function confirmAndSubmit() {
		if (!checkReleaseMsgInput()) {
			return;
		}
		$(".step1_img img").attr("src", "image/next_b.png");
		$(".step2_img img").attr("src", "image/next.png");
		$("#div_info").css("display", "none");
		$("#div_email").css("display", "block");
	}

	//提交信息事件
	function commerSubmit() {
		//检测用户名，密码
		if(!checkUserMessage()) {
			return;
		}
		
		$(".step2_img img").attr("src", "image/next_b.png");
		$(".step3_img img").attr("src", "image/success.png");
		$(".step3_img img").attr("src", "image/next.png");
		$(".step3_img1 img").attr("src", "image/success.png");
		$(".step3_img1 img").css("display", "block");
		$("#div_email").css("display", "none");
		$("#div_success").css("display", "block");
	}
	
	//输入鼠标离开时方法
	function onInputOver(element) {
		alert(1);
		//小数
		var floatNumberRe = /^[\d]+\.?[\d]*$/;
		//整数
		var intNumberRe = /^[0-9]*$/;
		//手机号
		var phoneNumberRe = /^(13[0-9]|15[0|3|6|7|8|9]|18[8|9])\d{8}$/;
		//是否检测到错误的输入
		var flag = false;
		switch ($(element).attr('validType')) {
		case 'string':
			if(element.value == null || element.value.length == 0) {
				flag = true;
			}
			break;
		case 'select':
			if($(element).val() == 'n') {
				flag = true;
			}
			break;
		case 'floatNumber':
			if(!($(element).val() && floatNumberRe.test($(element).val()))) {
				flag = true;
			}
			break;
		case 'intNumber':
			if(!($(element).val() && intNumberRe.test($(element).val()))) {
				flag = true;
			}
			break;
		case 'phone':
			if(!($(element).val() && phoneNumberRe.test($(element).val()))) {
				flag = true;
			}
		break;
		case 'richText':
			if(false) {
				flag = true;
			}
		break;
		default:
			alert(element.id + "未知的validType变量;");
			flag = true;
			break;
		}
		
		if(flag) {
			handInputError(element);
		} else {
			resetStyle(element);
		}
	}
	
	

	//检测输入值，是否有没有填写的项，成功返回true,否则还回false
	function checkReleaseMsgInput() {
		$('[name="releaseErrorMsg"]').parent().find("[required=true]").each(function(index,element) {
			if($(element).val() == null || $(element).val().length == 0) {//是输入框input
				$(element).parent().find('[name="releaseErrorMsg"]').css("display", "inline");
				$(element).attr("state", false);
				$(element).css("border-color","#F73809");
			} else if($(element).val() == "n") {//是下拉框
				$(element).parent().find('[name="releaseErrorMsg"]').css("display", "inline");
				$(element).attr("state", false);
				$(element).css("border","1px");
				$(element).css("border-color","#F73809");
			}
		});
		
		var flag = true;
		var validInputs = $('[name="releaseErrorMsg"]').parent().find("[required=true]");
		for (var i = 0; i < validInputs.length; i++) {
			if($(validInputs[i]).attr("state") == 'false') {
				$(validInputs[i]).focus();
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	
	function checkUserMessage() {
		$("#emailError").css("display", "none");
		$("#passwordError").css("display", "none");
		//邮箱
		var emailRe = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
		if(!emailRe.test($("#email").val())) {
			$("#emailError").css("display", "inline");
			return false;
		}
		
		if($("#password").val() == null || $("#password").val().length == 0) {
			$("#passwordError").css("display", "inline");
			return false;
		}
		return true;
	}

	//提交信息到服务器方法,保存成功返回true,否则返回false
	function submitMessage() {
		var message = {}; //房屋信息
		message.rentWay = $('input[name="rentWay"]:checked').val();
		message.estateName = $("#estateName").val();
		message.houseTingNum = $("#houseTingNum").val();
		message.houseRoomNum = $("#houseRoomNum").val();
		message.houseToiletNum = $("#houseToiletNum").val();
		message.layerNum = $("#layerNum").val();
		message.totleLayerNum = $("#totleLayerNum").val();
		message.squareMeter = $("#squareMeter").val();
		message.roomType = $("#roomType  option:selected").val();
		message.sexType = $("#sexType  option:selected").val();
		message.houseDirection = $("#houseDirection  option:selected").val();
		message.decorationType = $("#decorationType  option:selected").val();
		message.estateType = $("#estateType  option:selected").val();
		message.rentMoney = $("#rentMoney").val();
		message.payType = $("#payType  option:selected").val();
		message.houseDescrible = $("#houseDescrible").val();
		message.linkMan = $("#linkMan").val();
		message.linkCallNumber = $("#linkCallNumber").val();
		message.addressArea = $("#addressArea  option:selected").val();
		message.addressCircle = $("#addressCircle  option:selected").val();
		message.addressAttach = $("#addressAttach").val();

		var jsonData = JSON.stringify(message);
		email = $("#email").val();
		userPassword = $("#password").val();
		$.ajax({
			type : 'post',
			dataType : 'json',
			contentType : "application/json",
			data : jsonData,
			async : false,
			url : "houseInfo.do?action=release&email=" + email
					+ "&userPassword=" + userPassword,
			success : function(result) {
				if (result.data == "0") {
					alert("用户名或密码出错！");
				} else if (result.data == "1") {
					alert("保存出错！");
				} else {
					alert(result.data);
				}
			}
		});
	}
	
	//处理检测到错误输入
	function handInputError(element) {
		$(element).parent().find('[name="releaseErrorMsg"]').css("display", "inline");
		$(element).css("border-color","#F73809");
		$(element).attr("state", false);
	}
	
	//返回输入正确的样式
	function resetStyle(dom) {
		$(dom).css("border-color",  "#CCCCCC");
		$(dom).attr("state", true);
		if($(dom).parent().find('[state=false]').length == 0) {
			$(dom).parent().find('[name="releaseErrorMsg"]').css("display", "none");
		}
	}

	function returnHome() {
		window.location.href = "home.jsp";
	}
	window.onload = function() {
		$('.selectpicker').selectpicker();
	};
</script>
</head>
<body>
	<div class="topNavigate">
		<form id="form1" action="">
			<div
				style="margin-left: auto; margin-right: auto; width: 1000px; height: 50px;">
				<div style="float: left; width: 250px; height: 50px;">
					<img src="image/ulezu2_small.jpg" />
				</div>
				<div
					style="float: left; width: 500px; height: 50px; font-size: 30px;">
				</div>
				<div
					style="width: 250px; height: 50px; float: left; color: #444; font-size: 18px;"
					align="right">
					<a>登陆</a>&nbsp;|&nbsp;<a>注册</a>&nbsp;&nbsp;&nbsp;&nbsp;<a>帮助</a>
				</div>
			</div>
			<div
				style="margin-left: auto; margin-right: auto; width: 1000px; height: 30px; margin-top: 5px;"
				class="step">
				<div class="step1">
					<div class="step1_img">
						<img src="image/next.png" />
					</div>
					<div class="step1_desc" style="background-color: #F6F3F3;">
						1.填写信息</div>
				</div>
				<div class="step2">
					<div class="step2_img">
						<img src="image/next_b.png" />
					</div>
					<div class="step2_desc" style="background-color: #F6F3F3;">
						2.确认用户</div>
				</div>
				<div class="step3">
					<div class="step3_img">
						<img src="image/next_b.png" />
					</div>
					<div class="step3_desc" style="background-color: #F6F3F3;">
						3.发布成功</div>
					<div class="step3_img1">
						<img src="image/success.png" style="display: none;" />
					</div>
				</div>
			</div>
			<div
				style="margin-left: auto; margin-right: auto; width: 1000px; display: block;"
				id="div_info">
				<div
					style="float: left; width: 1000px; height: 30px; line-height: 40px; font-size: 14px; color: #978679;">
					备注: <span
						style="margin: 5px 5px 0px 5px; height: 25px; color: #72b088; font-weight: bold; font-size: 18px; vertical-align: middle;">*</span>为必填项
				</div>
				<div
					style="float: left; width: 1000px; height: 54px; line-height: 40px; font-size: 14px; color: #978679;">
					<div
						style="margin: 0px 5px 0px 5px; height: 39px; padding-top: 15px; color: #72b088; font-weight: bold; font-size: 14px; vertical-align: middle; float: left;">
						*</div>
					<div>
						<div
							style="float: left; width: 60px; height: 39px; padding-top: 15px; text-align: right;">
							出租方式</div>

						<div class="common_desc" style="float: left;">
							<ul>
								<li><input value="0" type="radio" checked="checked"
									name="rentWay" />整套出租</li>
								<li><input value="1" type="radio" name="rentWay" />单间出租</li>
								<li><input value="2" type="radio" name="rentWay" />床位出租</li>
							</ul>
						</div>
					</div>
				</div>
				<div
					style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px; color: #978679;">
					<div
						style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold; font-size: 14px; vertical-align: middle; float: left;">
						*</div>
					<div>
						<div
							style="float: left; width: 60px; height: 50px; text-align: right;">

							小区名称</div>
						<div class="common_desc"
							style="float: left; width: 800px; height: 50px; vertical-align: middle;">
							<input validType="string" required=true state=true onblur="onInputOver(this)"
								id="estateName" type="text" class="txt_xiaoqu" /> <span
								name="releaseErrorMsg" style="color: red; display: none;">*请填写小区名称*</span>
						</div>

					</div>

				</div>
				<div
					style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px; color: #978679;">
					<div
						style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold; font-size: 14px; vertical-align: middle; float: left;">
						*</div>
					<div>
						<div
							style="float: left; width: 60px; height: 50px; text-align: right;">
							位置</div>
						<div class="common_desc"
							style="float: left; width: 800px; height: 50px; vertical-align: middle;">
							<span style="padding-right: 45px;"></span> <select
								id="addressArea" class="selectpicker" data-width="auto"
								onchange="size=1;" validType="select" required=true state=true onblur="onInputOver(this)">
								<option value="n">--区域--</option>
								<option value="新都区">新都区</option>
							</select> <select id="addressCircle" class="selectpicker"
								data-width="auto" validType="select" required=true state=true onblur="onInputOver(this)" >
								<option value="n">--商圈--</option>
								<option value="万达广场">万达广场</option>
							</select> <input validType="string" required=true state=true onblur="onInputOver(this)" 
								id="addressAttach" type="text" class="txt_address" /> <span
								name="releaseErrorMsg" style="color: red; display: none;">
								*请完成地理信息*</span>
						</div>
					</div>
				</div>
				<div
					style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px; color: #978679;">
					<div
						style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold; font-size: 14px; vertical-align: middle; float: left;">
						*</div>
					<div>
						<div
							style="float: left; width: 60px; height: 50px; text-align: right;">
							房屋户型</div>
						<div class="common_desc"
							style="float: left; width: 800px; height: 50px; vertical-align: middle;">
							<input id="houseRoomNum" type="text" class="txt_num"
								style="margin-left: 42px;" validType="intNumber" required=true
								state=true onblur="onInputOver(this)"  />室 <input id="houseTingNum" type="text"
								class="txt_num" validType="intNumber" required=true state=true onblur="onInputOver(this)"  />厅
							<input id="houseToiletNum" type="text" class="txt_num"
								validType="intNumber" required=true state=true onblur="onInputOver(this)"  />卫 <span
								name="releaseErrorMsg" style="color: red; display: none;">
								*请完成户型信息*</span>
						</div>
					</div>
				</div>
				<div
					style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px; color: #978679;">
					<div
						style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold; font-size: 14px; vertical-align: middle; float: left;">
						*</div>
					<div>
						<div
							style="float: left; width: 60px; height: 50px; text-align: right;">
							楼层</div>
						<div class="common_desc"
							style="float: left; width: 800px; height: 50px; vertical-align: middle;">
							<span style="margin-left: 45px;"> 第</span> <input id="layerNum"
								type="text" class="txt_num" validType="intNumber" required=true
								state=true onblur="onInputOver(this)"  />层&nbsp;&nbsp;&nbsp; 共 <input id="totleLayerNum"
								type="text" class="txt_num" validType="intNumber" required=true
								state=true onblur="onInputOver(this)"  />楼 <span name="releaseErrorMsg"
								style="color: red; display: none;"> *请完成楼层息信*</span>
						</div>
					</div>
				</div>
				<div
					style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px; color: #978679;">
					<div
						style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold; font-size: 14px; vertical-align: middle; float: left;">
						*</div>
					<div>
						<div
							style="float: left; width: 60px; height: 50px; text-align: right;">
							出租间</div>
						<div class="common_desc"
							style="float: left; width: 800px; height: 50px; vertical-align: middle;">
							<span style="margin-left: 45px;"></span> <input id="squareMeter"
								type="text" class="txt_pangfang" validType="intNumber"
								required=true state=true onblur="onInputOver(this)"  />㎡&nbsp;&nbsp; <select id="roomType"
								class="selectpicker" data-width="auto" validType="select"
								required=true state=true onblur="onInputOver(this)" >
								<option value="n">房间类型</option>
								<option value="0">主卧</option>
								<option value="1">次卧</option>
								<option value="2">隔断</option>
							</select> <select id="sexType" class="selectpicker" data-width="auto"
								validType="select" required=true state=true onblur="onInputOver(this)" >
								<option value="n">性别要求</option>
								<option value="0">男女不限</option>
								<option value="1">限男生</option>
								<option value="2">限女生</option>
							</select> <select id="houseDirection" class="selectpicker"
								data-width="auto" validType="select" required=true state=true onblur="onInputOver(this)" >
								<option value="n">出租间朝向</option>
								<option value="0">东</option>
								<option value="1">南</option>
								<option value="2">西</option>
								<option value="3">北</option>
								<option value="13">南北</option>
								<option value="02">东西</option>
								<option value="01">东南</option>
								<option value="21">西南</option>
								<option value="03">东北</option>
								<option value="23">西北</option>
							</select> <select id="decorationType" class="selectpicker"
								data-width="auto" validType="select" required=true state=true onblur="onInputOver(this)" >
								<option value="n">装修情况</option>
								<option value="0">毛坯</option>
								<option value="1">简单装修</option>
								<option value="2">中等装修</option>
								<option value="3">精装修</option>
								<option value="4">豪华装修</option>
							</select> <select id="estateType" class="selectpicker" data-width="auto"
								validType="select" required=true state=true onblur="onInputOver(this)" >
								<option value="n">住宅情况</option>
								<option value="0">普通住宅</option>
								<option value="1">商住两用</option>
								<option value="2">公寓</option>
								<option value="3">平房</option>
								<option value="4">别墅</option>
								<option value="5">其他</option>
							</select> <span name="releaseErrorMsg" style="color: red; display: none;">
								*请完成出租信息*</span>
						</div>
					</div>
				</div>
				<div
					style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px; color: #978679;">
					<div
						style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold; font-size: 14px; vertical-align: middle; float: left;">
						*</div>
					<div>
						<div
							style="float: left; width: 60px; height: 50px; text-align: right;">
							租金</div>
						<div class="common_desc"
							style="float: left; width: 800px; height: 50px; vertical-align: middle;">
							<span style="margin-left: 45px;"></span> <input id="rentMoney"
								type="text" class="txt_pangfang" validType="intNumber"
								required=true state=true onblur="onInputOver(this)"  />元/月&nbsp;&nbsp;&nbsp; <select
								id="payType" class="selectpicker" data-width="auto"
								validType="select" required=true state=true onblur="onInputOver(this)" >
								<option selected="selected" value="n">押金方式</option>
								<option value="0">押一付一</option>
								<option value="1">押一付二</option>
								<option value="2">押一付三</option>
								<option value="3">押二付一</option>
								<option value="4">押二付二</option>
								<option value="5">押二付三</option>
								<option value="6">半年付</option>
								<option value="7">年付</option>
								<option value="8">面议</option>
							</select> <span name="releaseErrorMsg" style="color: red; display: none;">
								*请完成租金信息*</span>
						</div>
					</div>
				</div>
				<div
					style="float: left; width: 1000px; height: 400px; line-height: 40px; font-size: 14px; color: #978679;">
					<div
						style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold; font-size: 14px; vertical-align: middle; float: left;">
						*</div>
					<div>
						<div
							style="float: left; width: 60px; height: 50px; text-align: right;">
							房源描述</div>
						<div class="common_desc"
							style="float: left; width: 800px; height: 50px; vertical-align: middle;">
							<span style="margin-left: 45px;"></span>
							<textarea id="houseDescrible"
								style="width: 560px; height: 400px; border: 1px solid #ccc;"
								validType="richText" required=true state=true onblur="onInputOver(this)" >这里要用一个编辑框组件</textarea>
							<span name="releaseErrorMsg" style="color: red; display: none;">
								*请填写房源描述*</span>
						</div>
					</div>
				</div>
				<div
					style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px; color: #978679;">
					<div
						style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold; font-size: 14px; vertical-align: middle; float: left;">
						*</div>
					<div>
						<div
							style="float: left; width: 60px; height: 50px; text-align: right;">
							上传图片</div>
						<div class="common_desc"
							style="float: left; width: 800px; height: 50px; vertical-align: middle;">
							<span style="margin-left: 45px;"></span>
						</div>
					</div>
				</div>
				<div
					style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px; color: #978679;">
					<div
						style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold; font-size: 14px; vertical-align: middle; float: left;">
						*</div>
					<div>
						<div
							style="float: left; width: 60px; height: 50px; text-align: right;">
							联系人</div>
						<div class="common_desc"
							style="float: left; width: 800px; height: 50px; vertical-align: middle;">
							<span style="margin-left: 45px;"></span> <input
								validType="string" required=true state=true onblur="onInputOver(this)"  id="linkMan"
								type="text" class="txt_address" /> <span name="releaseErrorMsg"
								style="color: red; display: none;"> *请填写联系人*</span>
						</div>
					</div>
				</div>
				<div
					style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px; color: #978679;">
					<div
						style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold; font-size: 14px; vertical-align: middle; float: left;">
						*</div>
					<div>
						<div
							style="float: left; width: 60px; height: 50px; text-align: right;">
							联系电话</div>
						<div class="common_desc"
							style="float: left; width: 800px; height: 50px; vertical-align: middle;">
							<span style="margin-left: 45px;"></span> <input validType="phone"
								required=true state=true onblur="onInputOver(this)"  id="linkCallNumber" type="text"
								class="txt_address" /> <span name="releaseErrorMsg"
								style="color: red; display: none"> *请填写联系电话*</span>
						</div>
					</div>
				</div>
				<div
					style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px; color: #978679;">
					<div
						style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold; font-size: 14px; vertical-align: middle; float: left;">
					</div>
					<div>
						<div
							style="float: left; width: 60px; height: 50px; text-align: right;">
						</div>
						<div class="common_desc"
							style="float: left; width: 800px; height: 50px; vertical-align: middle;">
							<span style="margin-left: 45px;"></span> <input type="button"
								value="确认并发布" class="btn_fabu" onclick="confirmAndSubmit();" />
						</div>
					</div>
				</div>

			</div>
			<div
				style="margin-left: auto; margin-right: auto; width: 1000px; display: none;"
				id="div_email">
				<div
					style="margin-left: auto; margin-right: auto; width: 500px; height: 500px; text-align: center;">
					<div
						style="margin-left: auto; margin-right: auto; width: 500px; height: 50px; float: left; margin-top: 30px;">
						<input id="email" type="text" value="邮箱/手机号/用户名"
							class="txt_ok_email" validType="email" required=true state=true />
						<span name="userErrorMsg" id="emailError"
							style="color: red; display: none;"> *邮箱格式不正确*</span>
					</div>
					<div
						style="margin-left: auto; margin-right: auto; width: 500px; height: 50px; float: left; margin-top: 20px;">
						<input id="password" type="password" validType="password"
							required=true state=true value="密码" class="txt_ok_email" /> <span
							name="userErrorMsg" style="color: red; display: none;">
							*密码不能为空*</span>
					</div>
					<div
						style="margin-left: auto; margin-right: auto; width: 500px; height: 50px; float: left; margin-top: 20px;">
						<input type="button" value="立即发布" class="btn_fabu"
							onclick="commerSubmit();" />
					</div>
				</div>
			</div>
			<div
				style="margin-left: auto; margin-right: auto; width: 1000px; display: none;"
				id="div_success">
				<div
					style="margin-left: auto; margin-right: auto; width: 500px; height: 500px; text-align: center;">
					<div
						style="margin-left: auto; margin-right: auto; width: 500px; height: 250px; float: left; margin-top: 30px; text-align: center;">
						<img src="image/ok_fabu.jpg" />
					</div>
					<div
						style="margin-left: auto; margin-right: auto; width: 500px; height: 50px; float: left; margin-top: 20px; color: #777; font-size: 20px;">
						恭喜你，信息发布成功~~</div>
					<div
						style="margin-left: auto; margin-right: auto; width: 500px; height: 50px; float: left; margin-top: 20px;">
						<input type="button" value="查看信息" class="btn_fabu_end" /> <input
							type="button" value="返回首页" class="btn_fabu_end"
							onclick="returnHome();" />
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</html>
