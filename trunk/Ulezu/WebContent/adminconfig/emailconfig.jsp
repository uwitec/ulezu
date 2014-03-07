<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../bootstrap-3.1.1-dist/css/bootstrap.min.css" rel="stylesheet" media="screen">
<style type="text/css">
.queryCondition{
	width: 800px;
	float: left;
	min-height:80px;
	margin-left: auto;
	margin-right: auto;
}
.table_data{
	width: 800px;
	float: left;
	margin-left: auto;
	margin-right: auto;	
	min-height: 300px;
}
.querybtn{
	text-align: center;
	border-bottom: 3px solid #1da811;
	padding-bottom: 10px;
}
</style>
</head>
<body>
	<script type="text/javascript" src="../js/common/jquery-1.7.1.min.js"></script>
    <script src="../bootstrap-3.1.1-dist/js/bootstrap.min.js"></script>
    <div style="width:800px;margin-left:auto;margin-right:auto;">
		<div class="queryCondition">
			<table style="width: 100%;">
				<tr>
					<td align="right" style="color: #888;">邮件服务器地址:</td>
					<td><input type="text" style="width: 200px;height:30px;margin: 15px 15px 15px 15px;"/></td>
					<td align="right" style="color: #888;">发送邮箱:</td>
					<td><input type="text" style="width: 200px;height:30px;margin: 15px 15px 15px 15px;"//></td>
				</tr>
				<tr>
					<td align="right" style="color: #888;">邮件端口:</td>
					<td><input type="text" style="width: 200px;height:30px;margin: 15px 15px 15px 15px;"//></td>
					<td align="right" style="color: #888;">邮件类型:</td>
					<td>
						<select style="width: 200px;height:30px;margin: 15px 15px 15px 15px;">
							<option> </option>  
				          	<option>qq</option>  
				         	<option>163</option>  
				         	<option>gmail</option>  
				      </select>
					</td>
				</tr>
			</table>
		</div>
		<div class="querybtn">
			<input type="button" class="btn btn-success" style="width:100px;margin-right: 10px;" value="查询"/>
			<input type="button" class="btn btn-success" style="width:100px;margin-right: 10px;"  value="清除条件"/>
			<input type="button"  class="btn btn-primary" style="width:100px;margin-right: 10px;" value="新增"/>
		</div>
		<div class="table_data">
			<table class="table table-striped">
				<tr>
					<td style="color: #999;">邮件服务器地址</td>
					<td style="color: #999;">邮件端口</td>
					<td style="color: #999;">发送邮箱</td>
					<td style="color: #999;">邮箱密码</td>
					<td style="color: #999;">邮件标题</td>
					<td style="color: #999;">邮件内容</td>
					<td style="color: #999;">操作</td>
				</tr>
				<tr>
					<td style="color: #444;">smtp.qq.com</td>
					<td style="color: #444;">25</td>
					<td style="color: #444;">123123@qq.com</td>
					<td style="color: #444;">*********************</td>
					<td style="color: #444;">亲爱的用户，哈哈......</td>
					<td style="color: #444;">亲爱的用户，htpp://www.baidu.com......</td>
					<td style="color: #444;"><a><img src="../image/delete.jpg"/></a><br/><a>编辑</a></td>
				</tr>
				
				<tr>
					<td style="color: #444;">smtp.qq.com</td>
					<td style="color: #444;">25</td>
					<td style="color: #444;">123123@qq.com</td>
					<td style="color: #444;">*********************</td>
					<td style="color: #444;">亲爱的用户，哈哈......</td>
					<td style="color: #444;">亲爱的用户，htpp://www.baidu.com......</td>
					<td style="color: #444;"><a><img src="../image/delete.jpg"/></a><br/><a>编辑</a></td>
				</tr>
				<tr>
					<td style="color: #444;">smtp.qq.com</td>
					<td style="color: #444;">25</td>
					<td style="color: #444;">123123@qq.com</td>
					<td style="color: #444;">*********************</td>
					<td style="color: #444;">亲爱的用户，哈哈......</td>
					<td style="color: #444;">亲爱的用户，htpp://www.baidu.com......</td>
					<td style="color: #444;"><a><img src="../image/delete.jpg"/></a><br/><a>编辑</a></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>
