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
<script src="Lib/jquery.min.js"></script>
<link href="../Lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="Lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/wait.css" rel="stylesheet">
<link href="User/css/wait.css" rel="stylesheet">
<title>等待结果</title>
</head>
<body>
<div class="row navigator">
 <button type="button" class="btn btn-primary logout" onclick="logout()">退出</button>
<span id="username" class="label label-default usernamelabel"><%=session.getAttribute("username")%></span>
</div>

<div id="view1">
<center><h1>请耐心等待审核结果，如有疑问请联系************</h1></center>
</div>
<div id="view2">
<center><h1>审核未通过请重新填写审核信息！原因：</h1><p id="reason"></p></center>
<button onclick="readd()">重新填写</button>
</div>
<script type="text/javascript" src="js/wait.js"></script>
<script type="text/javascript" src="User/js/wait.js"></script>
</body>
</html>