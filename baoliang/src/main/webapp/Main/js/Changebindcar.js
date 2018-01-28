var tabledown=1;
var checked;
var setv;
$(function(){
	//setv=setInterval("refreshdown()",2000);
	refreshdown();
})
function refreshdown()
{
	
	$.ajax({
		type:"post",
		url:"refreshtabledown",
		data:"indexdown="+tabledown+"&pagesum=5",
		dataType:"json",
		async:true,
		timeout:5000,
		success:function(data)
		{
			
			 
			 var str='<tr>'
				+'<td>司机编号</td>'
				+'<td>姓名</td>'
				+'<td>电话</td>'
				+'<td>车号</td>'
				+'<td>装载量</td>'
				+'<td>选择</td>'
				+'</tr>';
			 
			var mydata = eval('(' + data.datadown + ')');
			if(data.flag=="true")
				{
					
				}else
					{
					
					document.getElementById('downpage').innerHTML="第"+tabledown+"页";
					}
			var i;
			for(i=0;i<mydata.length;i++)
				{
			 str=str+'<tr >'
			 +'<td>'+mydata[i].drivernums+'</td>'
			 +'<td>'+mydata[i].name+'</td>'
			 +'<td>'+mydata[i].phone+'</td>'
			 +'<td>'+mydata[i].carnum+'</td>'
			 +'<td>'+mydata[i].cargo+'</td>'
			 +'<td><input id="selectcar"  name="selectcar" type="radio" value="'+mydata[i].drivernums+'" onclick="valuedata(\''+mydata[i].carnum+'\',\''+mydata[i].drivernums+'\',\''+document.getElementById('acnum').innerHTML+'\')"/></td>'
			 +'</tr>';
			 }
			document.getElementById('apcar').innerHTML=str;
			
		},
		
	
		error:function(XMLHttpRequest, textStatus, errorThrown){
			alert("网络请求失败");
			clearInterval(setv);
		}
		
	});
	
}
var carnum;
var drivernum;
var acnumK;
function valuedata(car,driver,acnums)
{
	carnum=car;
	drivernum=driver;
	acnumK=acnums;
	alert()
}

function seclectdriver()
{
	
	var acnum=$('#acnum').val();
	alert("data:"+acnum+","+carnum+","+drivernum);
	window.location.href="http://"+window.location.hostname+":"+window.location.port+"/baoliang/selectdriver?drivernum="+drivernum+"&carnum="+carnum+"&acnum="+acnumK;
}

function next()
{
	tabledown++;
	console.log(tabledown);
	refreshdown();
	//clearInterval(setv);
	//setv=setInterval("refreshdown()",2000);
}
function preview()
{
	tabledown--;
	console.log(tabledown);
	refreshdown();
	//clearInterval(setv);
	//setv=setInterval("refreshdown()",2000);
}
