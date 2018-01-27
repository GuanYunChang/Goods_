<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="../Lib/ichartjs/ichart.1.2.1.min.js"></script>
<link href="css/Main-innerPage.css" rel="stylesheet">
<link href="../Lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<script src="../Lib/jquery.min.js"></script>
<script src="../Lib/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/Main-innerPage.js" charset="utf-8"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="topchart">
        <div id="canvasDiv"></div>
	</div>
	
	
	
	<button id="hidenorshow" class="hidenorshow" style="border-width: 0px;background-color: white;" >隐藏</button>
<!-- 分割按钮 -->
	<div class="btn-group btn-group-justified" role="group" aria-label="...">
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-default" onclick="Selecttable(1)" >待分配</button>
  </div>
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-default" onclick="Selecttable(2)">车辆修整</button>
  </div>
  <div class="btn-group" role="group">
    <button type="button" class="btn btn-default" onclick="Selecttable(3)">运送中</button>
  </div>
  
	</div>


        	<table id="table1" class="table table-hover">
        		<tr>
        			<td>货运单号</td>
        			<td>订单人</td>
        			<td>订单人电话</td>
        			<td>货物</td>
        			<td>重量</td>
        			<td>始发地</td>
        			<td>目的地</td>
        		</tr>
			</table>
			<table id="table2" class="table table-hover">
        		<tr>
        			<td>司机编号</td>
        			<td>姓名</td>
        			<td>电话</td>
        			<td>车号</td>
        			<td>装载量</td>
        		</tr>
			</table>
		<table id="table3" class="table table-hover">
        		<tr>
        			<td>货运单号</td>
        			<td>订单人</td>
        			<td>订单人电话</td>
        			<td>货物</td>
        			<td>重量</td>
        			<td>始发地</td>
        			<td>目的地</td>
        			<td>司机</td>
        			<td>车牌</td>
        		</tr>
			</table>
	<div class="pagebtn">
	<button type="button" class="btn btn-default" onclick="preview()">上一页</button>
	<button type="button" class="btn btn-default" onclick="next()">下一页</button>
	<span class="label label-default" id="pageshow"></span>
</div>
	
	<script type="text/javascript" src="js/chart.js" charset="utf-8"></script>
</body>
</html>