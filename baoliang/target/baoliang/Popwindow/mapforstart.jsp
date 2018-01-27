<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no, width=device-width">
    <title>鼠标拾取地图坐标</title>
    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main1119.css"/>
    <script type="text/javascript"
            src="http://webapi.amap.com/maps?v=1.4.3&key=78f77fe91c242528d1beac8dc6595782"></script>
    <script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script>
</head>
<body>
<div id="container"></div>
<div id="myPageTop">
    <table>
        <tr>
            <td>
                <label>按关键字搜索：</label>
            </td>
            <td class="column2">
                <label>左击获取经纬度：</label>
            </td>
        </tr>
        <tr>
            <td>
                <input type="text" placeholder="请输入关键字进行搜索" id="tipinput">
            </td>
            <td class="column2">
                <input type="text" readonly="true" id="lnglat">
            </td>
            <td>
            	 <span id="result"></span>
            </td>
        </tr>
    </table>
</div>
<script type="text/javascript">

AMap.plugin(['AMap.ToolBar', 'AMap.Scale', 'AMap.MapType','AMap.Geocoder','AMap.Autocomplete'], function() {
    toolBar = new AMap.ToolBar();  //工具条
    scale = new AMap.Scale();    //比例尺
    //mapType = new AMap.MapType();   //地图种类
    map.addControl(toolBar);
    map.addControl(scale);
   // map.addControl(mapType);
})
    var map = new AMap.Map("container", {
        resizeEnable: true
    });
    var xylocation;
    //为地图注册click事件获取鼠标点击出的经纬度坐标
    var clickEventListener = map.on('click', function(e) {
        document.getElementById("lnglat").value = e.lnglat.getLng() + ',' + e.lnglat.getLat()
    	xylocation=[e.lnglat.getLng(),e.lnglat.getLat()];
        //alert(xylocation);
        regeocoder();
    });
    var auto = new AMap.Autocomplete({
        input: "tipinput"
    });
    AMap.event.addListener(auto, "select", select);//注册监听，当选中某条记录时会触发
    function select(e) {
        if (e.poi && e.poi.location) {
            map.setZoom(15);
            map.setCenter(e.poi.location);
        }

    }
    var flag=false;
    var counts=1;
    var marker;
 //逆地理编码
  function regeocoder() {  //逆地理编码
	 
        var geocoder = new AMap.Geocoder({
            radius: 10000000,
            extensions: "all"
        });        
        geocoder.getAddress(xylocation, function(status, result) {
        	//alert(result);
            if (status === 'complete' && result.info === 'OK') {
                geocoder_CallBack(result);
            }
        });
        if(counts==1)
        	{
        		 marker = new AMap.Marker({  //加点
         	 	  map: map,
           	 	position: xylocation
       			 });counts++;
        	}else 
        		{
        			map.remove(marker);
        			marker = new AMap.Marker({  //加点
               	 	  map: map,
                 	 	position: xylocation
             			 });counts++;
        		}
      
        //map.setFitView();
    }
    function geocoder_CallBack(data) {
        var address = data.regeocode.formattedAddress; //返回地址描述
     
        document.getElementById("result").innerHTML = address;
        window.opener.document.getElementById("start").value=address;
    }
</script>
</body>
</html>