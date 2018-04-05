<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="../Lib/jquery.min.js"></script>
<link href="../Lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/wait.css" rel="stylesheet">
<title>等待结果</title>
</head>
<body>
<div class="row navigator">
 <button type="button" class="btn btn-primary logout" onclick="logout()">退出</button>
<span id="username" class="label label-default usernamelabel"><%=session.getAttribute("username")%></span>
</div>
等待
<script type="text/javascript" src="js/wait.js"></script>
</body>
</html>