<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta charset="utf-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="Lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="Lib/jquery.min.js"></script>
 <script src="Lib/bootstrap/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<h6 id="acnum"><s:property value="acnum" /></h6>
<h3>可分配的车辆</h3>
<table id="apcar" class="table table-hover apcar">
	<tr>
		<td>司机编号</td>
		<td>姓名</td>
		<td>电话</td>
		<td>车号</td>
		<td>装载量</td>
		<td>选择</td>
		
	</tr>
</table>
<input type="button" value="上一页" onclick="preview()">
<input type="button" value="下一页" onclick="next()">
<h5  id="downpage">第1页</h5>
<input type="button" value="提交" onclick="seclectdriver()">
<script type="text/javascript" src="Main/js/Changebindcar.js"></script>
</body>
</html>