<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="Lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="Lib/jquery.min.js"></script>
 <script src="Lib/bootstrap/js/bootstrap.min.js"></script>
 <link href="Main/css/Editforinfotableno.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<form class="formtable" id="formtable">
  		<div class="form-group" >
   	 		<label >订单编号</label>
    		<input name="acnum" value='<s:property value="acnum"/>' type="text" class="form-control" id="" placeholder="订单编号" readonly="readonly">
  		</div>
  		
  		<div class="form-group">
    		<label >订单人</label>
   			 <input name="boss" value='<s:property value="boss"/>' type="text" class="form-control" id="" placeholder="订单人" readonly="readonly">
  		</div>
  		
  		<div class="form-group">
    		<label >订单人电话</label>
   			 <input name="phone" value='<s:property value="phone"/>' type="text" class="form-control" id="" placeholder="订单人电话" readonly="readonly">
  		</div>
  		
  		<div class="form-group">
    		<label >货物</label>
   			 <input name="goods" value='<s:property value="goods"/>' type="text" class="form-control" id="" placeholder="货物" >
  		</div>
  		
  		<div class="form-group">
    		<label >始发地</label>
   			 <input name="start" value='<s:property value="start"/>' type="text" class="form-control" id="start" placeholder="始发地">
  			 经度:<span id="longitudestart"><s:property value="longitudestart"/></span>纬度:<span id="latitudestart"><s:property value="latitudestart"/></span>
  			<input type="button" onclick="openwin(1)" value="打开地图"/>
  		</div>
  		
  		<div class="form-group">
    		<label >目的地</label>
   			 <input name="destination" value='<s:property value="destination"/>' type="text" class="form-control" id="destination" placeholder="目的地">
  			经度:<span id="longitudedestination"><s:property value="longitudedestination"/></span>纬度:<span id="latitudedestination"><s:property value="latitudedestination"/></span>
  			<input type="button" onclick="openwin(2)" value="打开地图"/>
  		</div>
  		
  		<div class="form-group">
    		<label >重量</label>
   			 <input name="weight" value='<s:property value="weight"/>' type="text" class="form-control" id="" placeholder="重量">
  		</div>
  		<center>
  		<button type="button" class="btn btn-info subbtn" onclick="saveappliaction()">保存</button>
  		</center>
	</form>
	<script type="text/javascript" src="Main/js/Editforinfotableno.js"></script>
</body>
</html>