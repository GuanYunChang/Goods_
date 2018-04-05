<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="../Lib/jquery.min.js"></script>
<link href="../Lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/verify.css" rel="stylesheet">
<title>身份验证</title>
</head>
<body>
<div class="row navigator">
 <button type="button" class="btn btn-primary logout" onclick="logout()">退出</button>
<span id="username" class="label label-default usernamelabel"><%=session.getAttribute("username")%></span>
</div>
<div class="verifyform">
 	<s:form action="../uploadcardfile" enctype="multipart/form-data" method="post">
    	<s:textfield name="title" label="标题"/>
    	<s:file name="upload" label="身份证正面"/><br/>
    	<s:file name="upload" label="身份证反面"/><br/>
   	 	<s:submit name="submit" value="上传文件"></s:submit>
    </s:form>
</div>
<script type="text/javascript" src="User/js/verify.js"></script>
</body>
</html>