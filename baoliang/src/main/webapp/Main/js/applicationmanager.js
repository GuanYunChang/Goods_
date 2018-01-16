$(function(){
	$('#aptableno').show();
	$('#aptableyes').hide();
	adddata(1,1);
	
})

function selectbtn(index)
{
	switch(index)
	{
	case 1:
		$('#aptableno').show();
		$('#aptableyes').hide();
		adddata(1,1);
		break;
	case 2:
		$('#aptableno').hide();
		$('#aptableyes').show();
		adddata(4,1);
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
			table1count++;
			break;
		case 4:
			table2count++;
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
		end=sumcounts-start;
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
				+'<input type="button" onclick="deleted('+dataarray[i].acnum+')" value="删除"/>'
				+'<input type="button" onclick="edit('+dataarray[i].acnum+')" value="编辑"/>'
				+'</td></tr>';
				
				
			}
		//document.getElementById("pageshow").innerHTML=table1count;
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
		+'<td>'+dataarray[i].car+'</td>'
		+'<td>'+dataarray[i].drivernum+'</td>'
		+'<td class="tdw">'
		+'<input type="button" onclick="deleted('+dataarray[i].acnum+')" value="删除"/>'
		+'<input type="button" onclick="edit('+dataarray[i].acnum+')" value="编辑"/>'
		+'</td></tr>';
		
		
	}
//document.getElementById("pageshow").innerHTML=table1count;
document.getElementById("aptableyes").innerHTML=str;
break;
	}
}
