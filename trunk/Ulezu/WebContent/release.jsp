<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link href="bootstrap-3.1.1-dist/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<link rel="stylesheet" type="text/css"
	href="bootstrap-select/bootstrap-select.min.css">
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

.step1,.step2,.step3 {
	color: #978679;
	height: 30px;
	width: 330px;
	float: left;
}

.step1_desc,.step2_desc {
	width: 300px;
	height: 30px;
	float: left;
	text-align: center;
	vertical-align: middle;
	font-size: 20px;
}

.step3_desc {
	width: 270px;
	height: 30px;
	float: left;
	text-align: center;
	vertical-align: middle;
	font-size: 20px;
}

.step1_img,.step2_img,.step3_img {
	float: left;
}

.common_desc ul li {
	list-style: none;
	float: left;
	margin-right: 5px;
}

.txt_xiaoqu {
	margin-left: 45px;
	width: 300px;
	height: 30px;
	border: 1px solid #ccc;
}

.txt_address {
	width: 300px;
	height: 30px;
	border: 1px solid #ccc;
}

.txt_num {
	width: 50px;
	height: 30px;
	margin: 0px 3px 0px 3px;
	border: 1px solid #ccc;
}

.selectPlug-text {
	background: #FFF url(image/arrow-down.gif) right center no-repeat;
	outline: none;
	display: inline-block;
	border: 1px solid #ccc;
	padding-right: 13px;
	padding-left: 5px;
	vertical-align: top;
	cursor: default;
}

.txt_pangfang {
	width: 100px;
	height: 30px;
	border: 1px solid #ccc;
}

.btn_fabu {
	width: 300px;
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
	margin-top: 30px;
}

.txt_ok_email {
	width: 300px;
	height: 40px;
	border: 1px solid #ccc;
	margin: 20px auto 20px auto;
	color: #777;
	font-size: 18px;
	vertical-align: middle;
}

.btn_fabu_end {
	width: 150px;
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
	margin-top: 30px;
	margin-right: 5px;
}
</style>
<script type="text/javascript" src="js/common/jquery-1.7.1.min.js"></script>
<script type="text/javascript"
	src="bootstrap-select/bootstrap-select.min.js"></script>
<script src="bootstrap-3.1.1-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
		$(function() {
			$(".common_desc input").each(function(index,element) {
				element.onblur = function() {
					
				};
			});
		});

		//确认并发布
        function confirmAndSubmit() {
        	if(!checkInput()) {
        		return;
        	}
            $(".step1_img img").attr("src", "image/next_b.png");
            $(".step2_img img").attr("src", "image/next.png");
            $("#div_info").css("display", "none");
            $("#div_email").css("display", "block");
        }

		//提交信息事件
        function commerSubmit() {
        	if(!submitMessage()) {
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
        
      	//检测输入值，成功返回true,否则还回false
        function checkInput() {
        	$("#inputContent");
        	alert("TODO check input value!");
        	return true;
        }
      
     	//提交信息到服务器方法,保存成功返回true,否则返回false
     	function submitMessage() {
     		var message = {};   //房屋信息
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
     		message.addressArea = $("#addressArea  option:selected").val();;
     		message.addressCircle = $("#addressCircle  option:selected").val();;
     		message.addressAttach = $("#addressAttach").val();
     		
     		var jsonData = JSON.stringify(message);
     		email = $("#email").val();
     		userPassword = $("#password").val();
     		$.ajax({
     			type:'post',
     			dataType:'json',
     			contentType: "application/json",
     			data: jsonData,
     			async:false,
     			url: "houseInfo.do?action=release&email=" + email + "&userPassword=" + userPassword,
     	    	success: function(result){
     	    		if(result.data == "0") {
     	    			alert("用户名或密码出错！");
     	    		} else if(result.data == "1") {
     	    			alert("保存出错！");
     	    		} else {
     	    			alert("");
     	    		}
     	    	}
     	    });
     	}
        
        function returnHome(){
        	window.location.href = "home.jsp";
        }
        window.onload=function(){  
            $('.selectpicker').selectpicker();   
        };  
        
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
        <div  style="margin-left: auto; margin-right: auto; width: 1000px; height: 30px; margin-top: 5px;"
            class="step">
            <div class="step1">
                <div class="step1_img">
                    <img src="image/next.png" />
                </div>
                <div class="step1_desc" style="background-color: #F6F3F3;">
                    1.填写信息
                </div>
            </div>
            <div class="step2">
                <div class="step2_img">
                    <img src="image/next_b.png" />
                </div>
                <div class="step2_desc" style="background-color: #F6F3F3;">
                    2.确认用户
                </div>
            </div>
            <div class="step3">
                <div class="step3_img">
                    <img src="image/next_b.png"/>
                </div>
                <div class="step3_desc" style="background-color: #F6F3F3;">
                    3.发布成功
                </div>
                <div class="step3_img1">
                    <img  src="image/success.png" style="display: none;" />
                </div>
            </div>
        </div>
        <div id="inputContent" style="margin-left: auto; margin-right: auto; width: 1000px;display:block;" id="div_info">
            <div style="float: left; width: 1000px; height: 30px; line-height: 40px; font-size: 14px;
                color: #978679;">
                备注: <span style="margin: 5px 5px 0px 5px; height: 25px; color: #72b088; font-weight: bold;
                    font-size: 18px; vertical-align: middle;">*</span>为必填项
            </div>
            <div style="float: left; width: 1000px; height: 54px; line-height: 40px; font-size: 14px;
                color: #978679;">
                <div style="margin: 0px 5px 0px 5px; height: 39px; padding-top: 15px; color: #72b088;
                    font-weight: bold; font-size: 14px; vertical-align: middle; float: left;">
                    *</div>
                <div>
                    <div style="float: left; width: 60px; height: 39px; padding-top: 15px; text-align: right;">
                        出租方式</div>
                    <div class="common_desc" style="float: left;">
                        <ul>
                            <li>
                                <input value="0" type="radio" checked="checked" name="rentWay" />整套出租</li>
                            <li>
                                <input value="1" type="radio" name="rentWay" />单间出租</li>
                            <li>
                                <input value="2" type="radio" name="rentWay" />床位出租</li>
                        </ul>
                    </div>
                </div>
            </div>
            <div style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px;
                color: #978679;">
                <div style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold;
                    font-size: 14px; vertical-align: middle; float: left;">
                    *</div>
                <div>
                    <div style="float: left; width: 60px; height: 50px; text-align: right;">
                        小区名称</div>
                    <div class="common_desc" style="float: left; width: 800px; height: 50px; vertical-align: middle;">
                        <input id="estateName" type="text" class="txt_xiaoqu" />
                    </div>
                </div>
            </div>
            <div style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px;
                color: #978679;">
                <div style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold;
                    font-size: 14px; vertical-align: middle; float: left;">
                    *</div>
                <div>
                    <div style="float: left; width: 60px; height: 50px; text-align: right;">
                        位置</div>
                    <div class="common_desc" style="float: left; width: 800px; height: 50px; vertical-align: middle;">
                        <span style="padding-right: 45px;"></span> 
                            <select id="addressArea" class="selectpicker" data-width="auto" onchange="size=1;">
                            <option>--区域--</option>
                            <option value="">--新都区--</option>
                        </select>
                        <select id="addressCircle" class="selectpicker" data-width="auto">
                            <option>--商圈--</option>
                            <option value="">--万达广场--</option>
                        </select>
                        <input id="addressAttach" type="text" class="txt_address" />
                    </div>
                </div>
            </div>
            <div style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px;
                color: #978679;">
                <div style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold;
                    font-size: 14px; vertical-align: middle; float: left;">
                    *</div>
                <div>
                    <div style="float: left; width: 60px; height: 50px; text-align: right;">
                        房屋户型</div>
                    <div class="common_desc" style="float: left; width: 800px; height: 50px; vertical-align: middle;">
                        <input id="houseRoomNum" type="text" class="txt_num" style="margin-left: 42px;" />室
                        <input id="houseTingNum" type="text" class="txt_num" />厅
                        <input id="houseToiletNum" type="text" class="txt_num" />卫
                    </div>
                </div>
            </div>
            <div style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px;
                color: #978679;">
                <div style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold;
                    font-size: 14px; vertical-align: middle; float: left;">
                    *</div>
                <div>
                    <div style="float: left; width: 60px; height: 50px; text-align: right;">
                        楼层</div>
                    <div class="common_desc" style="float: left; width: 800px; height: 50px; vertical-align: middle;">
                        <span style="margin-left: 45px;">
                        第</span><input id="layerNum" type="text" class="txt_num" />层&nbsp;&nbsp;&nbsp;
                        共<input id="totleLayerNum" type="text" class="txt_num" />楼
                    </div>
                </div>
            </div>
            <div style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px;
                color: #978679;">
                <div style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold;
                    font-size: 14px; vertical-align: middle; float: left;">
                    *</div>
                <div>
                    <div style="float: left; width: 60px; height: 50px; text-align: right;">
                        出租间</div>
                    <div class="common_desc" style="float: left; width: 800px; height: 50px; vertical-align: middle;">
                        <span style="margin-left: 45px;"></span>
                        <input id="squareMeter" type="text" class="txt_pangfang" />㎡&nbsp;&nbsp;
                        <select id="roomType" class="selectpicker" data-width="auto">
                        	<option value="房间类型">房间类型</option>
                            <option value="0">主卧</option>
                            <option value="1">次卧</option>
                            <option value="2">隔断</option>
                        </select>
                        <select id="sexType" class="selectpicker" data-width="auto">
                            <option value="n">性别要求</option>
                            <option value="0">男女不限</option>
                            <option value="1">限男生</option>
                            <option value="2">限女生</option>
                        </select>                       
                        <select id="houseDirection" class="selectpicker" data-width="auto">
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
                        </select>
                        <select id="decorationType" class="selectpicker" data-width="auto">
                            <option selected="selected" value="n">装修情况</option>
                            <option value="0">毛坯</option>
                            <option value="1">简单装修</option>
                            <option value="2">中等装修</option>
                            <option value="3">精装修</option>
                            <option value="4">豪华装修</option>
                        </select>
                        <select id="estateType" class="selectpicker" data-width="auto">
                            <option value="0" selected="">普通住宅</option>
                            <option value="1">商住两用</option>
                            <option value="2">公寓</option>
                            <option value="3">平房</option>
                            <option value="4">别墅</option>
                            <option value="5">其他</option>
                        </select>
                    </div>
                </div>
            </div>
            <div style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px;
                color: #978679;">
                <div style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold;
                    font-size: 14px; vertical-align: middle; float: left;">
                    *</div>
                <div>
                    <div style="float: left; width: 60px; height: 50px; text-align: right;">
                        租金</div>
                    <div class="common_desc" style="float: left; width: 800px; height: 50px; vertical-align: middle;">
                        <span style="margin-left: 45px;"></span>
                        <input id="rentMoney" type="text" class="txt_pangfang" />元/月&nbsp;&nbsp;&nbsp;
                        <select id="payType" class="selectpicker" data-width="auto">
                            <option selected="selected" value="n">押金方式</option>
                            <!-- 押一付三 -->
                            <option value="0">押一付一</option>
                            <option value="1">押一付二</option>
                            <option value="2">押一付三</option>
                            <option value="3">押二付一</option>
                            <option value="4">押二付二</option>
                            <option value="5">押二付三</option>
                            <option value="6">半年付</option>
                            <option value="7">年付</option>
                            <option value="8">面议</option>
                        </select>
                    </div>
                </div>
            </div>
             <div style="float: left; width: 1000px; height: 400px; line-height: 40px; font-size: 14px;
                color: #978679;">
                <div style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold;
                    font-size: 14px; vertical-align: middle; float: left;">
                    *</div>
                <div>
                    <div style="float: left; width: 60px; height: 50px; text-align: right;">
                        房源描述</div>
                    <div class="common_desc" style="float: left; width: 800px; height: 50px; vertical-align: middle;">
                        <span style="margin-left: 45px;"></span>
                        <textarea id="houseDescrible" style="width: 560px; height: 400px; border: 1px solid #ccc;">这里要用一个编辑框组件</textarea>
                    </div>
                </div>
            </div>
            <div style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px;
                color: #978679;">
                <div style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold;
                    font-size: 14px; vertical-align: middle; float: left;">
                    *</div>
                <div>
                    <div style="float: left; width: 60px; height: 50px; text-align: right;">
                        上传图片</div>
                    <div class="common_desc" style="float: left; width: 800px; height: 50px; vertical-align: middle;">
                        <span style="margin-left: 45px;"></span>
                    </div>
                </div>
            </div>
            <div style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px;
                color: #978679;">
                <div style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold;
                    font-size: 14px; vertical-align: middle; float: left;">
                    *</div>
                <div>
                    <div style="float: left; width: 60px; height: 50px; text-align: right;">
                        联系人</div>
                    <div class="common_desc" style="float: left; width: 800px; height: 50px; vertical-align: middle;">
                        <span style="margin-left: 45px;"></span>
                        <input id="linkMan" type="text" class="txt_address" />
                    </div>
                </div>
            </div>
            <div style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px;
                color: #978679;">
                <div style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold;
                    font-size: 14px; vertical-align: middle; float: left;">
                    *</div>
                <div>
                    <div style="float: left; width: 60px; height: 50px; text-align: right;">
                        联系电话</div>
                    <div class="common_desc" style="float: left; width: 800px; height: 50px; vertical-align: middle;">
                        <span style="margin-left: 45px;"></span>
                        <input id="linkCallNumber" type="text" class="txt_address" />
                    </div>
                </div>
            </div>
            <div style="float: left; width: 1000px; height: 50px; line-height: 40px; font-size: 14px;
                color: #978679;">
                <div style="margin: 0px 5px 0px 5px; height: 50px; color: #72b088; font-weight: bold;
                    font-size: 14px; vertical-align: middle; float: left;">
                    </div>
                <div>
                    <div style="float: left; width: 60px; height: 50px; text-align: right;">
                        </div>
                    <div class="common_desc" style="float: left; width: 800px; height: 50px; vertical-align: middle;">
                        <span style="margin-left: 45px;"></span>
                        <input type="button" value="确认并发布" class="btn_fabu"  onclick="confirmAndSubmit();"/>
                    </div>
                </div>
            </div>
            
            
        </div>
        <div style="margin-left: auto; margin-right: auto; width: 1000px; display: none;"
            id="div_email">
            <div style="margin-left: auto; margin-right: auto; width: 500px; height: 500px; text-align: center;">
                <div style="margin-left: auto; margin-right: auto; width: 500px; height: 50px; float: left;
                    margin-top: 30px;">
                    <input id="email" type="text" value="邮箱/手机号/用户名" class="txt_ok_email" />
                </div>
                <div style="margin-left: auto; margin-right: auto; width: 500px; height: 50px; float: left;
                    margin-top: 20px;">
                    <input id="password" type="password" value="密码" class="txt_ok_email" />
                </div>
                <div style="margin-left: auto; margin-right: auto; width: 500px; height: 50px; float: left;
                    margin-top: 20px;">
                    <input type="button" value="立即发布" class="btn_fabu" onclick="commerSubmit();"/>
                </div>
            </div>
        </div>
        <div style="margin-left: auto; margin-right: auto; width: 1000px; display: none;"
            id="div_success">
            <div style="margin-left: auto; margin-right: auto; width: 500px; height: 500px; text-align: center;">
                <div style="margin-left: auto; margin-right: auto; width: 500px; height: 250px; float: left;
                    margin-top: 30px;text-align:center;">
                    <img src="image/ok_fabu.jpg"/>
                </div>
                 <div style="margin-left: auto; margin-right: auto; width: 500px; height: 50px; float: left;
                    margin-top: 20px;color:#777;font-size:20px;">
                    恭喜你，信息发布成功~~
                </div>
                <div style="margin-left: auto; margin-right: auto; width: 500px; height: 50px; float: left;
                    margin-top: 20px;">
                    <input type="button" value="查看信息" class="btn_fabu_end" />
                    <input type="button" value="返回首页" class="btn_fabu_end" onclick="returnHome();"/>
                </div>
            </div>
        </div>
        
        
        
    </div>
</body>
</html>
