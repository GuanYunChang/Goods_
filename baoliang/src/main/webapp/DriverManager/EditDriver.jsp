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
 <link href="DriverManager/css/EditDriver.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<center>
<form class="infoform" id="infoform">
<div class="form-group">
<label class="formtitle">司机编号</label>
<input type="text" class="form-control" name="drivernums" readonly="readonly" value="<s:property value="drivernums"/>"/>
</div>
<div>
<label class="formtitle">姓名</label>
<input type="text" class="form-control" name="name" value="<s:property value="name"/>"/>
</div>
<div>
<label class="formtitle">电话</label>
<input type="text" class="form-control" name="phone" value="<s:property value="phone"/>"/>
</div>
<div>
<label class="formtitle">车牌号</label>
<input type="text" class="form-control" name="carnum" value="<s:property value="carnum"/>"/>
</div>
<div>
<label class="formtitle">载重量</label>
<input type="text" class="form-control" name="cargo" value="<s:property value="cargo"/>"/>
</div>
<div>
<label class="formtitle">状态</label>
<input type="text" class="form-control" name="statue" readonly="readonly" value="<s:property value="statue"/>"/>
</div>
<input type="button" class="btn btn-primary savebtn" value="保存" onclick="update()">
</form>
</center>
<script type="text/javascript" src="DriverManager/js/EditDriver.js"></script>
</body>
</html>