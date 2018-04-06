<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">    
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="Lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="Lib/jquery.min.js"></script>
 <script src="Lib/bootstrap/js/bootstrap.min.js"></script>
<link href="Main/css/Shenheshow.css" rel="stylesheet" >
<title>正在审核</title>
</head>
<body>
<table class="table table-bordered">
<tr><td>标题</td><td>信息</td></tr>
<tr><td>身份证正面</td><td class="pic"><img  src='<s:property value="bossdata.carda"/>' alt="身份证正面" class="img-thumbnail impic"></td></tr>
<tr><td>身份证反面</td><td class="pic"><img  src='<s:property value="bossdata.cardb"/>' alt="身份证反面" class="img-thumbnail impic"></td></tr>
<tr><td>用户的姓名</td><td ><s:property value="bossdata.bossname"/></td></tr>
<tr><td>用户的电话</td><td><s:property value="bossdata.bossphone"/></td></tr>
<tr><td>若审核不通过请填写原因（最多255字）</td><td><textarea id="description" style="width:400px;height:400px;"></textarea></td></tr>
<tr><td><button type="button" class="btn btn-success" onclick="shenheres(1,<s:property value="bossdata.bossphone"/>)">审核通过</button></td><td><button type="button" class="btn btn-danger" onclick="shenheres(4,<s:property value="bossdata.bossphone"/>)">审核有误</button></td></tr>
</table>
<script type="text/javascript" src="Main/js/Shenheshow.js"></script>
</body>
</html>