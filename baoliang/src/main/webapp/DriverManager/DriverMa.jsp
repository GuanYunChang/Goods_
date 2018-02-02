<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../Lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="../Lib/jquery.min.js"></script>
 <script src="../Lib/bootstrap/js/bootstrap.min.js"></script>
 <link href="css/DriverMa.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

<div class="btn-group btntitle">
  <button type="button" class="btn btn-default driverlist">司机列表</button>
  <button type="button" class="btn btn-default adddriver">添加司机</button>
</div>
	<table class="table table-hover drivertable" id="drivertable">
		<tr>
		<td>司机编号</td>
		<td>姓名</td>
		<td>电话</td>
		<td>车牌号</td>
		<td>载重</td>
		<td>状态</td>
		<td>操作</td>
		</tr>
	</table>
	<script type="text/javascript" src="js/DriverMa.js"></script>
</body>
</html>