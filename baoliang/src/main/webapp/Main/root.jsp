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
 <link href="Main/css/Main-super.css" rel="stylesheet">
<!--   <link rel="shortcut icon" href="Login/pic/login.ico" >-->
<title>SuperManager</title>
</head>
<body>
	<div class="container-fluid fluidcontain">
	
	<div class="row">
		<nav class="navbar navbar-inverse navigater">
 			 
 			 
 			 <div class="container-fluid">
 			 <row>
   		 		<div class="col-xs-2 "><a class="navbar-brand brand" href="#">物流配送系统</a></div>
   		 		<button class="btn btn-primary btnlog" type="submit" onclick="logout()">退出</button>
  				<span id="username" class="label label-info loginnames"><s:property value="username" /> </span>
  				</row>
  			</div>
  			
  			
		</nav>
	</div>
	
	
 	 <div class="row maincontain">
  	 		<div class="col-xs-2 left">
  	 			<ul class="nav nav-pills nav-stacked sta">
  					 <li role="presentation" onclick="selectFunc(0)" ><a class="links" href="#">主页</a></li>
 					 <li role="presentation" onclick="rootselectFunc(1)"><a  class="links" href="#">管理员管理</a></li>
  					 <li role="presentation" onclick="rootselectFunc(2)"><a  class="links" href="#">订单管理</a></li>
  					 <li role="presentation" onclick="rootselectFunc(3)"><a  class="links" href="#">分配订单</a></li>
  					 <li role="presentation" onclick="rootselectFunc(4)"><a  class="links" href="#">司机管理</a></li>
					<li role="presentation" onclick="rootselectFunc(5)"><a  class="links" href="#">用户审核</a></li>
				</ul>
  	 		</div>
  			<div class="col-xs-10  right">
				<iframe id="frameK" class="framedata" src="Main/Main-innerPage.jsp"></iframe>
			</div>
 	 </div>
</div>
	<script type="text/javascript" src="Main/js/Main-super.js" charset="gbk"></script>
	<script type="text/javascript" src="Main/js/root.js" charset="gbk"></script>
</body>
</html>