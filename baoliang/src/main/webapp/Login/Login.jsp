<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="Lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
 <script src="Lib/bootstrap/js/bootstrap.min.js"></script>
 <link href="Login/css/Login.css" rel="stylesheet">
 <link rel="shortcut icon" href="Login/pic/login.ico" >
<title>登录</title>
</head>
<body>
	<h3 class="maintitle">欢迎使用本系统 <small>enjoying</small></h3>
	<form class="form-horizontal logininput" role="form" action="Login" method="post">
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">Username</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="Username" name="name"
				   placeholder="Please input your Name">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label" >Password</label>
		<div class="col-sm-10">
			<input type="password" class="form-control" id="Password" name="password"
				   placeholder="Password">
		</div>
	</div>
	<div class="form-group">
	
		<label class="check"><input name="character" type="radio" value="1" />Super</label>
		<label class="check"><input name="character" type="radio" value="2" />Users</label>
	
  </button>
	</div>
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<input type="submit" class="btn btn-success subbtn" value="Login"/>
		</div>
	</div>
</form>
<div class="copyrights">
	<h3 class="textinfo">&copy Copyright by zhubaoliang</h3>
</div>
</body>
</html>