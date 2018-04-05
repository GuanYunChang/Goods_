<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../Lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="../Lib/jquery.min.js"></script>
 <script src="../Lib/bootstrap/js/bootstrap.min.js"></script>
 <link href="css/applicationmanager.css" rel="stylesheet">
<title>订单管理页面</title>
</head>
<body>
	<div class="buttongroups">
	
		<div class="btn-group btn-group-justified" role="group">
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-default" onclick="selectbtn(1)">未完成订单</button>
  </div>
 
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-default" onclick="selectbtn(2)">已完成订单</button>
  </div>
  
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-default" onclick="selectbtn(3)">添加订单</button>
  </div>
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-default" onclick="selectbtn(4)">查找订单</button>
  </div>
</div>
	</div>
	<table id="aptableno" class="table table-hover aptableno">
		
	</table>
	<table  id="aptableyes"class="table table-hover aptableyes">
		
	</table>
	
	<form class="formtable" id="formtable">
  		<div class="form-group" >
   	 		<label >订单编号</label>
    		<input name="acnum"  type="text" class="form-control" id="" placeholder="系统自动生成" readonly="readonly">
  		</div>
  		
  		<div class="form-group">
    		<label >订单人</label>
   			 <input name="boss"  type="text" class="form-control" id="" placeholder="订单人" >
  		</div>
  		
  		<div class="form-group">
    		<label >订单人电话</label>
   			 <input name="phone"  type="text" class="form-control" id="" placeholder="订单人电话" >
  		</div>
  		
  		<div class="form-group">
    		<label >货物</label>
   			 <input name="goods"  type="text" class="form-control" id="" placeholder="货物" >
  		</div>
  		
  		<div class="form-group">
    		<label >接货人</label>
   			 <input name="receiver"  type="text" class="form-control" id="" placeholder="接货人" >
  		</div>
  		
  		<div class="form-group">
    		<label >接货人电话</label>
   			 <input name="recephone"  type="text" class="form-control" id="" placeholder="接货人电话" >
  		</div>
  		
  		<div class="form-group">
    		<label >始发地</label>
   			 <input name="start"  id="start" type="text" class="form-control" id="" placeholder="始发地" readonly="readonly">
   			 经度:<span id="longitudestart"></span>纬度:<span id="latitudestart"></span>
   			 <input type="button" onclick="openwin(1)" value="打开地图"/>
  		</div>
  		
  		<div class="form-group">
    		<label >目的地</label>
   			 <input name="destination" id="destination" type="text" class="form-control" id="" placeholder="目的地" readonly="readonly">
   			  经度:<span id="longitudedestination"></span>纬度:<span id="latitudedestination"></span>
   			 <input type="button" onclick="openwin(2)" value="打开地图"/>
  		</div>
  		<div class="form-group">
    		<label >重量</label>
   			 <input name="weight"  type="text" class="form-control" id="" placeholder="重量">
  		</div>
  		<center>
  		<button type="button" class="btn btn-info subbtn" onclick="commitapplication()">提交订单</button>
  		</center>
	</form>

	
	
	<div id="searchap" class="searchap">
		<div class="input-group">
      		<input id="searchinput" type="text" class="form-control" placeholder="Search for...">
     		 <span class="input-group-btn">
        		<button class="btn btn-default" type="button" onclick="searchbyacnum('1')">按订单号查找</button>
     		</span>
     		</div>
     <table class="table table-hover searchform" id="searchform">
  		<tr>
			<td>货运单号</td>
			<td>订单人</td>
			<td>订单人电话</td>
			<td>货物</td>
			<td>重量</td>
			<td>始发地</td><td>目的地</td><td>接货人</td><td>接货人电话</td>
			<td>司机</td>
			<td>车牌</td>
			<td>状态</td>
			<td>操作</td>
			</tr>
	</table>
	</div>
	
	<div class="pagebtn" id="pagebtn">
	<button type="button" class="btn btn-default" onclick="preview()">上一页</button>
	<button type="button" class="btn btn-default" onclick="next()">下一页</button>
	<span class="label label-default" id="pageshow"></span>
</div>
	<script type="text/javascript" src="js/applicationmanager.js"></script>
</body>
	
</html>