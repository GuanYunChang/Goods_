<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="../Lib/jquery.min.js"></script>
<script src="../Lib/bootstrap/js/bootstrap.min.js"></script>
<link href="../Lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/RegisterManager.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

 <form id="registerform" class="registerform">
          <div class="form-group">
            <label  class="control-label">UserName</label>
            <input type="text" class="form-control" id="registername" onblur="verifyname()" value=""/>
            <p id="alertname" class="alerttext"></p>
          </div>
          <div class="form-group">
          	<label class="control-label">Phone</label>
          	<input type="text" class="form-control" id="phone" onblur="verifyphone()"/> <input type="button" id="sendverifycode" value="send verify code"/> 
          	<input type="text" id="verifycode"/ value="">
          	<p id="alertphone" class="alerttext"></p>
          </div>
          <div class="form-group">
            <label  class="control-label">password</label>
            <input type="password" class="form-control" id="password" onblur="verifypass()"></input>
             <label  class="control-label">Repeat your password</label>
              <p id="alertphone"></p>
            <input type="password" class="form-control" id="repassword" onblur="verifypass()"></input>
            <p id="alertpass" class="alerttext"></p>
          </div>
        </form>
<div class="modal-footer">
        <button type="button" class="btn btn-primary" onclick="closeandverify()">Register</button>
      </div>
</body>
<script type="text/javascript" src="js/RegistrerManager.js"></script>
</html>