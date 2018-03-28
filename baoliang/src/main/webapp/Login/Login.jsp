<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type"     content="text/html; charset=UTF-8">
<link href="Lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="Lib/jquery.min.js"></script>
 <script src="Lib/bootstrap/js/bootstrap.min.js"></script>
 <link href="Login/css/Login.css" rel="stylesheet">
 <link rel="shortcut icon" href="Login/pic/login.ico" >
 
<title>登录</title>
</head>
<body>
	<h3 class="maintitle">欢迎使用本系统 <small>enjoying</small></h3>
	<form id="userdata" class="form-horizontal logininput" role="form" action="Login" method="post">
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">昵称</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="Username" name="name"
				   placeholder="Please input your Name">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label" >密码</label>
		<div class="col-sm-10">
			<input type="password" class="form-control" id="Password" name="password"
				   placeholder="Password">
		</div>
	</div>
	<div class="form-group">
	
		<label class="check"><input id="character1" name="character" type="radio" value="1" />管理员</label>
		<label class="check"><input id="character2" name="character" type="radio" value="2" />用户</label>
		<label class="check"><input id="character3" name="character" type="radio" value="3" />超级管理</label>
	
  </button>
	</div>
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<input type="button" id="submitbtn" class="btn btn-success subbtn" value="Login" />
			<button type="button" class="btn btn-primary subbtn" data-toggle="modal" data-target="#registerwindow" data-whatever="Register">注册</button>
		</div>
	</div>
</form>
		
<!-- 注册框 -->
<div class="modal fade" id="registerwindow" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" >新注册</h4>
      </div>
      <div class="modal-body">
        <form id="registerform">
          <div class="form-group">
            <label  class="control-label">用户</label>
            <input type="text" class="form-control" id="registername" onblur="verifyname()" value=""/>
            <p id="alertname" class="alerttext"></p>
          </div>
          <div class="form-group">
          	<label class="control-label">电话</label>
          	<input type="text" class="form-control" id="phone" onblur="verifyphone()"/> <input type="button" id="sendverifycode" value="发送短信"/> 
          	<input type="text" id="verifycode"/ value="">
          	<p id="alertphone" class="alerttext"></p>
          </div>
          <div class="form-group">
            <label  class="control-label">密码</label>
            <input type="password" class="form-control" id="password" onblur="verifypass()"></input>
             <label  class="control-label">重复密码</label>
              <p id="alertphone"></p>
            <input type="password" class="form-control" id="repassword" onblur="verifypass()"></input>
            <p id="alertpass" class="alerttext"></p>
          </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        <button type="button" class="btn btn-primary" onclick="closeandverify()">注册</button>
      </div>
    </div>
  </div>
</div>
<div class="copyrights">
	<h3 class="textinfo">&copy Copyright by zhubaoliang</h3>
</div>
</body>
<script type="text/javascript" src="Login/js/Login.js"></script>
</html>