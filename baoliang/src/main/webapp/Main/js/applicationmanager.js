var btnindex=1;
$(function(){
	$('#aptableno').show();
	$('#aptableyes').hide();
	$('#formtable').hide();
	$('#pagebtn').show();
	adddata(1,1);
	
})

function selectbtn(index)
{
	
	btnindex=index;
	switch(index)
	{
	case 1:
		
		$('#aptableno').show();
		$('#aptableyes').hide();
		$('#formtable').hide();
		$('#pagebtn').show();
		adddata(1,1);
		//document.getElementById("pageshow").innerHTML=table1count;
		break;
	case 2:
		$('#aptableno').hide();
		$('#aptableyes').show();
		$('#formtable').hide();
		$('#pagebtn').show();
		adddata(4,1);
		break;
	case 3:
		$('#aptableno').hide();
		$('#aptableyes').hide();
		$('#formtable').show();
		$('#pagebtn').hide();
		break;
	
	}
}


var pagesum=10;
var table1count=1;
var table2count=1;

function adddata(index,initpage)
{
	var mydata;
	$.ajax({
		type:"get",
		url:"getapsdata",
		data:"index="+index,
		dataType:"json",
		success:function(data)
		{
			 mydata = eval('(' + data.jsonString + ')');
			 
			 addtabledata(mydata,index,initpage);
		},
		error:function(){
			
			alert("获取数据失败");
			
		}
		
	});
}

function addtabledata(dataarray,tableindex,page)
{
	var i;
	var str='';
	var sumcounts=dataarray.length;
	var intpagecount=Math.ceil(sumcounts/pagesum) ;
	if(page>intpagecount)
		{
		switch(tableindex){
		case 1:
			table1count--;
			break;
		case 4:
			table2count--;
			break;
		
		}
		alert("已经到最后了");
		return;
		}
	if(page>intpagecount)
		page=intpagecount;
	var start=(page-1)*pagesum;
	var end=start+pagesum;
	
	if(end>sumcounts)
		end=sumcounts;
	//alert(""+start+":"+end);
	switch(tableindex)
	{
	case 1:
		
		 str='<tr>'
        			+'<td>货运单号</td>'
        			+'<td>订单人</td>'
        			+'<td>订单人电话</td>'
        			+'<td>货物</td>'
        			+'<td>重量</td>'
        			+'<td>始发地</td><td>目的地</td>'
        			+'<td>操作</td>'
        			+'</tr>';
		
		for(i=start;i<end;i++)
			{
			
				str=str+'<tr><td class="tdw">'+dataarray[i].acnum+'</td>'
				+'<td class="tdw"> '+dataarray[i].boss+'</td>'
				+'<td class="tdw">'+dataarray[i].phone+'</td>'
				+'<td class="tdw">'+dataarray[i].goods+'</td>'
				+'<td class="tdw">'+dataarray[i].weight+'</td>'
				+'<td class="tdw">'+dataarray[i].start+'</td>'
				+'<td class="tdw">'+dataarray[i].destination+'</td>'
				+'<td class="tdw">'
				+'<input type="button" onclick="deleted(\''+dataarray[i].acnum+'\')" value="删除"/>'
				+'<input type="button" onclick="edit(\''+dataarray[i].acnum+'\',\''+dataarray[i].boss
				+'\',\''+dataarray[i].phone+'\',\''+dataarray[i].goods+'\',\''+dataarray[i].start+'\',\''+dataarray[i].destination
				+'\',\''+dataarray[i].weight+'\')" value="编辑"/>'
				+'</td></tr>';
				
				
			}
		document.getElementById("pageshow").innerHTML=table1count;
		document.getElementById("aptableno").innerHTML=str;
		break;
	case 4:
		//alert(dataarray);
		str='<tr>'
			+'<td>货运单号</td>'
			+'<td>订单人</td>'
			+'<td>订单人电话</td>'
			+'<td>货物</td>'
			+'<td>重量</td>'
			+'<td>始发地</td><td>目的地</td>'
			+'<td>司机</td>'
			+'<td>车牌</td>'
			+'<td>操作</td>'
			+'</tr>';

for(i=start;i<end;i++)
	{
	
		str=str+'<tr><td class="tdw">'+dataarray[i].acnum+'</td>'
		+'<td class="tdw"> '+dataarray[i].boss+'</td>'
		+'<td class="tdw">'+dataarray[i].phone+'</td>'
		+'<td class="tdw">'+dataarray[i].goods+'</td>'
		+'<td class="tdw">'+dataarray[i].weight+'</td>'
		+'<td class="tdw">'+dataarray[i].start+'</td>'
		+'<td class="tdw">'+dataarray[i].destination+'</td>'
		+'<td>'+dataarray[i].drivernum+'</td>'
		+'<td>'+dataarray[i].car+'</td>'	
		+'<td class="tdw">'
		+'<input type="button" onclick="deleted(\''+dataarray[i].acnum+'\')" value="删除"/>'
		+'<input type="button" onclick="editfortableyes(\''+dataarray[i].acnum+'\',\''+dataarray[i].boss
		+'\',\''+dataarray[i].phone+'\',\''+dataarray[i].goods+'\',\''+dataarray[i].start+'\',\''+dataarray[i].destination
		+'\',\''+dataarray[i].weight+'\',\''+dataarray[i].car+'\',\''+dataarray[i].drivernum+'\')" value="编辑"/>'
		+'</td></tr>';
		
		
	}
document.getElementById("pageshow").innerHTML=table2count;
document.getElementById("aptableyes").innerHTML=str;
break;
	}
}

function deleted(acnum)
{
	
	$.ajax({
		type:"post",
		url:"deletedforpalication",
		data:"acnum="+acnum,
		dataType:"json",
		success:function(data)
		{
			alert("删除成功");
			document.location.reload();
		},
		error:function(){
			
			alert("删除失败");
		}
		
	});
}

function edit(acnum,boss,phone,goods,start,destination,weight)
{
	
	window.location.href="http://"+window.location.hostname+":"+window.location.port+"/baoliang/editfortableno?"+"acnum="+acnum+"&boss="+boss+"&phone="+phone+"&goods="+goods+"&start="+start+"&destination="+destination+"&weight="+weight;
	alert("http://"+window.location.hostname+":"+window.location.port+"/baoliang/editfortableno?"+"acnum="+acnum+"&boss="+boss+"&phone="+phone+"&goods="+goods+"&start="+start+"&destination="+destination+"&weight="+weight);
}	

function editfortableyes(acnum,boss,phone,goods,start,destination,weight,car,drivernum)
{
	
	window.location.href="http://"+window.location.hostname+":"+window.location.port+"/baoliang/editforableyes?"+"acnum="+acnum+"&boss="+boss+"&phone="+phone+"&goods="+goods+"&start="+start+"&destination="+destination+"&weight="+weight+"&car="+car+"&drivernum="+drivernum;
}

function preview()
{
	switch(btnindex)
	{
	case 1:
		adddata(1,--table1count);
		//document.getElementById("pageshow").innerHTML=table1count;
		//document.location.reload();
		break;
	case 2:
		adddata(4,--table2count);
		//document.getElementById("pageshow").innerHTML=table2count;
		//document.location.reload();
		break;
	
	}
}

function next()
{
	switch(btnindex)
	{
	case 1:
		adddata(1,++table1count);
		break;
	case 2:
		adddata(4,++table2count);
		break;
	
	}
}

/**
 * 提交订单
 * @returns
 */
function commitapplication()
{
	var parm = $("#formtable").serialize();
	$.ajax({
		type:"post",
		url:"commitapplication",
		data:parm,
		dataType:"json",
		success:function(data)
		{
			alert("提交成功");
		},
		error:function(){
			
			alert("提交失败");
		}
		
	});
}