<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>优乐租-成都最大的在线租房交易平台</title>
<style type="text/css">
a {
	text-decoration: none;
}

.body {
	width: 100%;
	height: auto;
	background-color: #EEEEEF;
}

.mainBody {
	width: 1000px;
	margin-left: auto;
	margin-right: auto;
	height: auto;
	z-index: 2;
}

.top {
	margin-left: auto;
	margin-right: auto;
	width: 100%;
	height: 80px;
	background-color: #fff;
}

.area {
	margin-left: auto;
	margin-right: auto;
	height: 300px;
	width: 100%;
}

.main {
	margin-left: auto;
	margin-right: auto;
	width: 100%;
	height: auto;
	background-color: #EEEEEF;
}

.bottom {
	margin-left: auto;
	margin-right: auto;
	width: 100%;
	border-top: 3px green solid;
	height: 200px;
	background-color: #EEEEEF;
	margin-top: 20px;
}

.mainCenter {
	margin-left: auto;
	margin-right: auto;
	width: 81%;
	min-width: 810px;
	background-color: #ffffff;
}

.mainCenterArea {
	margin-left: auto;
	margin-right: auto;
	width: 100%;
	min-width: 810px;
	border-top: 1px green dotted;
	height: 300px;
	margin-top: 10px;
}

.areaSearch {
	float: left;
	width: 40%;
	min-width: 400px;
	height: 100%;
}

.areaImg {
	float: left;
	width: 599px;
	height: 100%;
}

.mainCenterAreaImg {
	width: 300px;
	height: 300px;
	float: left;
	margin-right: 10px;
}

.mainCenterAreaDesc {
	width: 500px;
	float: left;
	height: 300px;
}

.cityArea {
	width: 100%;
	min-height: 25px;
	height: auto;
	border-top: 3px solid green;
	background-color: #EEEEEF;
	font-size: 23px;
	font-family: 隶书;
	vertical-align: middle;
	color: #636363;
	padding-top: 15px;
}

.topNavigate {
	margin-left: auto;
	margin-right: auto;
	width: 100%;
	height: 50px;
	background-color: #3CAC7E;
}

.backgroundBody {
	z-index: 1;
	height: 130px;
	width: 100%;
}

.btnSearch {
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

.txtAddress {
	width: 350px;
	height: 30px;
	border-radius: 2px;
	border: 1px solid #777;
	padding: 5px auto 5px auto;
	margin: 15px 24px 15px 24px;
	color: #777;
	font-size: 15px;
	vertical-align: middle;
	background-color: #ffffff;
}

.state {
	width: 100%;
	font-size: 33px;
	color: #636363;
	line-height: 45px;
	margin: 25px auto 0px auto;
	font-family: 隶书;
	font-weight: bold;
}

.houseNum {
	width: 100%;
	font-size: 13px;
	color: #0f8b67;
	margin: 0px auto 0px auto;
}

.address {
	display: block;
	float: left;
	padding: 0 5px;
	line-height: 24px;
	color: #999;
	font-size: 14px;
}

.topTitle {
	width: 1000px;
	height: 80px;
	margin-left: auto;
	margin-right: auto;
}

.bottom div ul li {
	color: #777;
	list-style: none;
	line-height: 25px;
	font-size: 13px;
}

.liHeader {
	font-size: 18px !important;
	font-weight: bold;
}

.detail-btn {
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

.detail-btn1 {
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
<script type="text/javascript" src="js/common/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/common/jquery.cookie.js"></script>
<script type="text/javascript">
	function search(){
		var args = "v=" + encodeURIComponent($("#txtAddress").val()) + "&h=" + encodeURIComponent($("#hidAdd").val());
		alert(args);
		$.ajax({
    		type: "get",
    		dataType: "json",
    		url: "s.do?" + args,
    		success: function(v){
    			
    		}
    	});
	}
	
	function clearAddress(){
		$("#txtAddress").val('');
	}
	
	window.onload = function() {
		var userName = $.cookie('u0.ulezu.com');
		if(userName != null){
			$("#linkUserName").html(userName).css("background-color", "#ccc");
			$("#loginandregister").hide();
		}
	};
</script>
</head>
<body>
	<div class="body">
		<div class="backgroundBody">
			<div class="top">
				<div class="topTitle">
					<div style="width: 400px; height: 80px; float: left;">
						<img src="image/ulezu2.jpg" />
					</div>
					<div style="width: 600px; height: 80px; float: left;">
						<div
							style="width: 200px; height: 30px; float: left; padding-top: 50px; color: #444; font-size: 14px;">
							成都最大的在线租房交易平台</div>
						<div style="width: 150px; height: 80px; float: left;padding-top: 30px;">
									<a class="detail-btn" href="release.jsp" target="_blank" >发布房源</a>
						</div>
						<div
							style="width: 250px; height: 30px; float: left; padding-top: 50px; color: #444; font-size: 18px;"
							align="right">
							<span id="userName"><a id="linkUserName"></a></span><span id="loginandregister"><a href="login.jsp" id="linkLogin">登陆</a>&nbsp;|&nbsp;<a href="register.jsp" id="linkRegister">注册</a></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a>帮助</a>
						</div>
					</div>
				</div>
			</div>
			<div class="topNavigate"></div>
		</div>
		<div class="mainBody">
			<div class="area">
				<div class="areaSearch">
					<div class="state" align="center">寻找优乐中的家</div>
					<div class="houseNum" align="center">
						<span>123</span>座城市 <span>3213</span>个房东 <span>2313</span>套优乐房屋
					</div>
					<input type="text" id="txtAddress" class="txtAddress"
						value="请输入商圈，学校，医院，小区，景点"  onmousedown="clearAddress();"/><br />
					<div
						style="float: left; width: 89px; margin-right: 9px; margin-top: 5px; font-size: 15px; font-weight: bold; color: #037b00;"
						align="right">
						<label> 热门位置:</label>
					</div>
					<div style="float: left; width: 278px;" class="address">
						<a>环球广场</a>&nbsp;&nbsp;&nbsp;&nbsp;<a>环球广场</a>
						&nbsp;&nbsp;&nbsp;&nbsp;<a>环球广场</a><br /> <a>环球广场</a>&nbsp;&nbsp;&nbsp;&nbsp;
						<a>环球广场</a> &nbsp;&nbsp;&nbsp;&nbsp;<a>环球广场</a> <br /> <a>环球广场</a>&nbsp;&nbsp;&nbsp;&nbsp;
						<a>环球广场</a> &nbsp;&nbsp;&nbsp;&nbsp;<a>更多>></a>
					</div>
					<br /> <input type="hidden" id="hidAdd" value="none"/><input type="button" class="btnSearch" value="立即搜索" onclick="search();" />
				</div>
				<div class="areaImg">
					<img src="image/111.jpg" />
				</div>
			</div>
			<div class="cityArea">优乐房源</div>
			<div class="main">
				<div class="mainCenter">
        <!-- 信息显示开始 -->				
				<%for(int i = 0; i < 4; i++) {%>
					<div class="mainCenterArea">
						<div class="mainCenterAreaImg">
							<img src="image/fangwu.jpg" />
						</div>
						<div class="mainCenterAreaDesc">
							<div
								style="float: left; width: 385px; color: #333333; font-weight: bold; font-size: 20px; height: 50px; margin: 5px 0px 0px 15px; vertical-align: middle;">
								【新都】保利城</div>
							<div
								style="float: left; width: 85px; height: 50px; margin: 5px 0px 0px 15px; color: #47B689;">
								[<a
									style="color: #47B689; font-size: 12px; text-decoration: underline;">查看地图</a>]
							</div>
							<div
								style="float: left; width: 50px; height: 25px; font-weight: bold; color: #666; font-size: 14px;">
								地址：</div>
							<div
								style="float: left; width: 450px; height: 25px; color: #666;">
								大天路与北新大道交界处</div>
							<div
								style="float: left; width: 50px; height: 25px; font-weight: bold; color: #666; font-size: 14px;">
								房型：</div>
							<div
								style="float: left; width: 100px; height: 25px; color: #666;">
								3室2厅</div>
							<div
								style="float: left; width: 50px; height: 25px; font-weight: bold; color: #666; font-size: 14px;">
								面积：</div>
							<div
								style="float: left; width: 100px; height: 25px; color: #666;">
								105平米</div>
							<div style="float: right; width: 200px; height: 235px;">
								<div
									style="float: left; width: 70px; height: 35px; text-align: center; font-size: 14px;">发布时间：</div>
								<div
									style="float: left; width: 130px; height: 35px; text-align: center;">2014-01-01
									13:59</div>
								<div style="float: left; width: 200px; height: 140px;">
									<div
										style="float: left; width: 50px; height: 140px; text-align: right; line-height: 90px; vertical-align: text-top; font-size: 20px; font-style: italic; color: #444;">￥</div>
									<div
										style="float: left; width: 50px; height: 140px; text-align: center; line-height: 110px; font-size: 50px; color: #F60;">550</div>
									<div
										style="float: left; width: 100px; height: 140px; text-align: center; line-height: 130px; font-size: 25px; vertical-align: text-bottom; color: #444;">/月</div>
								</div>
								<div style="float: left; width: 200px; height: 60px;">
									<a class="detail-btn1" href="#" target="_blank">联系房东</a>
								</div>
							</div>
							<div
								style="float: left; width: 50px; height: 25px; font-weight: bold; color: #666; font-size: 14px;">
								楼层：</div>
							<div
								style="float: left; width: 100px; height: 25px; color: #666;">
								8/15层</div>
							<div
								style="float: left; width: 50px; height: 25px; font-weight: bold; color: #666; font-size: 14px;">
								装修：</div>
							<div
								style="float: left; width: 100px; height: 25px; color: #666;">
								精装修</div>
							<div
								style="float: left; width: 50px; height: 25px; font-weight: bold; color: #666; font-size: 14px;">
								卧室：</div>
							<div
								style="float: left; width: 100px; height: 25px; color: #666;">
								主卧</div>
							<div
								style="float: left; width: 50px; height: 25px; font-weight: bold; color: #666; font-size: 14px;">
								支付：</div>
							<div
								style="float: left; width: 100px; height: 25px; color: #666;">
								押一付三</div>
							<div
								style="float: left; width: 50px; height: 25px; font-weight: bold; color: #666; font-size: 14px;">
								设备：</div>
							<div
								style="float: left; width: 250px; height: 100px; color: #666;">
								冰箱 空调 洗衣机 宽带</div>
							<div style="float: left; width: 300px; height: 50px">
								<a class="detail-btn" href="#" target="_blank">加入收藏车</a> <a
									class="detail-btn" href="houseInfo.do?id=456456456&action=get" target="_blank">房屋详情</a>
							</div>
						</div>
					</div>
				<%}%>
			<!-- 信息显示结束 -->		
				</div>
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
				<div style="width: 250px; float: left; margin-top: 10px;"></div>
			</div>
		</div>
	</div>
</body>
</html>
