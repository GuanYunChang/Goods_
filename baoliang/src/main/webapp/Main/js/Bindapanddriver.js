/*function poptest()
{
	var popup_url="http://"+window.location.hostname+":"+window.location.port+"/baoliang/Popwindow/poptest.jsp";
	window.open(popup_url,'newwindow','width='+500+',height='+350+',top='+100+',left='+300+',toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no,status=no');
}*/

var tableup=1;
var setv;
$(function(){
	
	
	refreshup();
	setv=setInterval("refreshup()",2000);
});
function refreshup()
{
	
	$.ajax({
		type:"post",
		url:"refreshtableup",
		data:"indexup="+tableup+"&pagesum=5",
		dataType:"json",
		async:true,
		timeout:5000,
		success:function(data)
		{
			
			 
			 var str='<tr>'
				 +'<td>订单编号</td>'
				 +'<td>订单人</td>'
				 +'<td>订单人电话</td>'
				 +'<td>货物</td>'
				 +'<td>始发地</td>'
				 +'<td>目的地</td>'
				 +'<td>司机编号</td>'
				 +'<td>车牌号</td>'
				 +'<td>重量</td>'
				 +'</tr>';
			 
			var mydata = eval('(' + data.dataup + ')');
			if(data.flag=="true")
				{
					
				}else
					{
					
					document.getElementById('uppage').innerHTML="第"+tableup+"页";
					}
			var i;
			for(i=0;i<mydata.length;i++)
				{
			 str=str+'<tr onclick="selectcar('+'\''+mydata[i].acnum+'\''+')" >'
			 +'<td>'+mydata[i].acnum+'</td>'
			 +'<td>'+mydata[i].boss+'</td>'
			 +'<td>'+mydata[i].phone+'</td>'
			 +'<td>'+mydata[i].goods+'</td>'
			 +'<td>'+mydata[i].start+'</td>'
			 +'<td>'+mydata[i].destination+'</td>'
			 +'<td>'+mydata[i].drivernum+'</td>'
			 +'<td>'+mydata[i].car+'</td>'
			 +'<td>'+mydata[i].weight+'</td>'
			 +'</tr>';
			 }
			document.getElementById('apdata').innerHTML=str;
			
		},
		
	
		error:function(XMLHttpRequest, textStatus, errorThrown){
			alert("网络请求失败");
			clearInterval(setv);
		}
		
	});
	
}

function selectcar(acnum)
{
	window.location.href="http://"+window.location.hostname+":"+window.location.port+"/baoliang/Changebind?acnum="+acnum;
}
function next()
{
	tableup++;
	console.log(tableup);
	clearInterval(setv);
	setv=setInterval("refreshup()",2000);
	//refreshup();
}
function preview()
{
	tableup--;
	console.log(tableup);
	clearInterval(setv);
	setv=setInterval("refreshup()",2000);
}
function addtableup()
{
	
}
function addtabledown()
{
	
}
