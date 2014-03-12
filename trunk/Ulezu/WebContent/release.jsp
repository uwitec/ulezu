<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title></title>
	<link href="bootstrap-3.1.1-dist/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link rel="stylesheet" type="text/css" href="bootstrap-select/bootstrap-select.min.css">
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
        .step1, .step2, .step3
        {
            color: #978679;
            height: 30px;
            width: 330px;
            float: left;
        }
        .step1_desc, .step2_desc
        {
            width: 300px;
            height: 30px;
            float: left;
            text-align: center;
            vertical-align: middle;
            font-size: 20px;
        }
        .step3_desc
        {
            width: 270px;
            height: 30px;
            float: left;
            text-align: center;
            vertical-align: middle;
            font-size: 20px;
        }
        .step1_img, .step2_img, .step3_img
        {
            float: left;
        }
        .common_desc ul li
        {
            list-style: none;
            float: left;
            margin-right: 5px;
        }
        .txt_xiaoqu
        {
            margin-left: 45px;
            width: 300px;
            height: 30px;
            border: 1px solid #ccc;
        }
        .txt_address
        {
            width: 300px;
            height: 30px;
            border: 1px solid #ccc;
        }
        .txt_num
        {
            width: 50px;
            height: 30px;
            margin: 0px 3px 0px 3px;
            border: 1px solid #ccc;
        }
        .selectPlug-text
        {
            background: #FFF url(image/arrow-down.gif) right center no-repeat;
            outline: none;
            display: inline-block;
            border: 1px solid #ccc;
            padding-right: 13px;
            padding-left: 5px;
            vertical-align: top;
            cursor: default;
        }
        .txt_pangfang
        {
            width: 100px;
            height: 30px;
            border: 1px solid #ccc;
        }
        .btn_fabu
        {
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
            font-family: "Hiragino Sans GB" , "Microsoft YaHei" ,\9ED1\4F53,\5b8b\4f53,sans-serif;
            text-align: center;
            cursor: pointer;
            margin-top: 30px;
        }
        .txt_ok_email
        {
            width: 300px;
            height: 40px;
            border: 1px solid #ccc;
            margin: 20px auto 20px auto;
            color: #777;
            font-size: 18px;
            vertical-align: middle;
        }
        .btn_fabu_end
        {
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
            font-family: "Hiragino Sans GB" , "Microsoft YaHei" ,\9ED1\4F53,\5b8b\4f53,sans-serif;
            text-align: center;
            cursor: pointer;
            margin-top: 30px;
            margin-right: 5px;
        }
    </style>
    <script type="text/javascript" src="js/common/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="bootstrap-select/bootstrap-select.min.js"></script>
    <script src="bootstrap-3.1.1-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        function confirmAndSubmit() {
            $(".step1_img img").attr("src", "image/next_b.png");
            $(".step2_img img").attr("src", "image/next.png");
            $("#div_info").css("display", "none");
            $("#div_email").css("display", "block");
        }

        function commerSubmit() {
            $(".step2_img img").attr("src", "image/next_b.png");
            $(".step3_img img").attr("src", "image/success.png");
            $(".step3_img img").attr("src", "image/next.png");
            $(".step3_img1 img").attr("src", "image/success.png");
            $(".step3_img1 img").css("display", "block");
            $("#div_email").css("display", "none");
            $("#div_success").css("display", "block");
        }
        
        function returnHome(){
        	window.location.href = "home.jsp";
        }
        window.onload=function(){  
            $('.selectpicker').selectpicker();  
            prettyPrint();  
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
        <div style="margin-left: auto; margin-right: auto; width: 1000px; height: 30px; margin-top: 5px;"
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
                    <img src="image/success.png" style="display: none;" />
                </div>
            </div>
        </div>
        <div style="margin-left: auto; margin-right: auto; width: 1000px;display:block;" id="div_info">
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
                                <input type="radio" checked="checked" name="rd_rent" />整套出租</li>
                            <li>
                                <input type="radio" name="rd_rent" />单间出租</li>
                            <li>
                                <input type="radio" name="rd_rent" />床位出租</li>
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
                        <input type="text" class="txt_xiaoqu" />
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
                        <select id="localDiduan" class="selectpicker" data-width="auto">
                            <option>--区域--</option>
                            <option value="">--新都区--</option>
                        </select>
                        <select id="localDiduan" class="selectpicker" data-width="auto">
                            <option>--商圈--</option>
                            <option value="">--万达广场--</option>
                        </select>
                        <input type="text" class="txt_address" />
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
                        <input type="text" class="txt_num" style="margin-left: 42px;" />室<input type="text"
                            class="txt_num" />厅<input type="text" class="txt_num" />卫
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
                        <span style="margin-left: 45px;">第</span><input type="text" class="txt_num" />层&nbsp;&nbsp;&nbsp;共<input
                            type="text" class="txt_num" />楼
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
                        <input type="text" class="txt_pangfang" />㎡&nbsp;&nbsp;
                        <select id="localDiduan" class="selectpicker" data-width="auto">
                            <option value="1" selected="">主卧</option>
                            <option value="2">次卧</option>
                            <option value="3">隔断</option>
                        </select>
                        <select id="localDiduan" class="selectpicker" data-width="auto">
                            <option value="0">性别要求</option>
                            <option value="1" selected="">男女不限</option>
                            <option value="2">限女生</option>
                            <option value="3">限男生</option>
                        </select>                       
                        <select id="localDiduan" class="selectpicker" data-width="auto">
                            <option selected="selected" value="">出租间朝向</option>
                            <option value="1">东</option>
                            <option value="2">南</option>
                            <option value="3">西</option>
                            <option value="4">北</option>
                            <option value="10">南北</option>
                            <option value="9">东西</option>
                            <option value="5">东南</option>
                            <option value="6">西南</option>
                            <option value="11">东北</option>
                            <option value="12">西北</option>
                        </select>
                        <select id="localDiduan" class="selectpicker" data-width="auto">
                            <option selected="selected" value="">装修情况</option>
                            <option value="1">毛坯</option>
                            <option value="2">简单装修</option>
                            <option value="3">中等装修</option>
                            <option value="4">精装修</option>
                            <option value="5">豪华装修</option>
                        </select>
                        <select id="localDiduan" class="selectpicker" data-width="auto">
                            <option value="3" selected="">普通住宅</option>
                            <option value="7">商住两用</option>
                            <option value="4">公寓</option>
                            <option value="2">平房</option>
                            <option value="5">别墅</option>
                            <option value="6">其他</option>
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
                        <input type="text" class="txt_pangfang" />元/月&nbsp;&nbsp;&nbsp;
                        <select id="localDiduan" class="selectpicker" data-width="auto">
                            <option selected="selected" value="">押金方式</option>
                            <!-- 押一付三 -->
                            <option value="1">押一付一</option>
                            <option value="2">押一付二</option>
                            <option value="3" selected="">押一付三</option>
                            <option value="8">押二付一</option>
                            <option value="4">押二付二</option>
                            <option value="5">押二付三</option>
                            <option value="6">半年付</option>
                            <option value="7">年付</option>
                            <option value="0">面议</option>
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
                        <textarea style="width: 560px; height: 400px; border: 1px solid #ccc;">这里要用一个编辑框组件</textarea>
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
                        <input type="text" class="txt_address" />
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
                        <input type="text" class="txt_address" />
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
                    <input type="text" value="邮箱/手机号/用户名" class="txt_ok_email" />
                </div>
                <div style="margin-left: auto; margin-right: auto; width: 500px; height: 50px; float: left;
                    margin-top: 20px;">
                    <input type="text" value="密码" class="txt_ok_email" />
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
