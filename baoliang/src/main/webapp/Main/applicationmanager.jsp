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
 <link href="css/applicationmanager.css" rel="stylesheet">
<title>订单管理页面</title>
</head>
<body>
	<div class="buttongroups">
	
		<div class="btn-group btn-group-justified" role="group">
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-default" onclick="selectbtn(1)">未完成订单</button>
  </div>
 
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-default" onclick="selectbtn(2)">已完成订单</button>
  </div>
</div>
	</div>
	<table id="aptableno" class="table table-hover aptableno">
		
	</table>
	<table  id="aptableyes"class="table table-hover aptableyes">
		
	</table>
	<script type="text/javascript" src="js/applicationmanager.js"></script>
</body>
	
</html>