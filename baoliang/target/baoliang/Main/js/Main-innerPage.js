var count=1;
/**
 * 图表的隐藏与展现
 */
$(document).ready(function(){
$(".hidenorshow").click(function(){
    $("#canvasDiv").slideToggle("slow");
    count++;
    if(count%2)
    	{
    		document.getElementById("hidenorshow").innerHTML="隐藏";
    	}
    	else
    		{
    		document.getElementById("hidenorshow").innerHTML="展示";
    		}
  });
});

/**
 * 按钮选择table
 * @returns
 */
$(function(){
	
	$("#table1").show();
	$("#table2").hide();
	$("#table3").hide();
	getapplicationdata(1,1);
	getcountoftable();
	//document.getElementById("pageshow").innerHTML=table1count;
})
var pagesum=10;
var table1count=1;
var table2count=1;
var table3count=1;
var currenttable=1;
function Selecttable(tablecount){
	currenttable=tablecount;
	
	
	
	
	if(tablecount==1)
		{
			$("#table1").show();
			$("#table2").hide();
			$("#table3").hide();
			getapplicationdata(1,1);
			table1count=1;
		}else if(tablecount==2)
			{
				$("#table1").hide();
				$("#table2").show();
				$("#table3").hide();
				getapplicationdata(2,1);
				table2count=1;
			}else if(tablecount==3)
				{
				
				$("#table1").hide();
				$("#table2").hide();
				$("#table3").show();
				getapplicationdata(3,1);
				table3count=1;
				}
	
}
/**
 * 数据的获取
 * 
 * */
function getapplicationdata(index,initpage)
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



/**
 * 填充表格
 * */
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
		case 2:
			table2count
			break;
		case 3:
			table3count
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
        			+'<td>始发地</td><td>目的地</td></tr>';
		
		for(i=start;i<end;i++)
			{
			
				str=str+'<tr><td>'+dataarray[i].acnum+'</td>'
				+'<td>'+dataarray[i].boss+'</td>'
				+'<td>'+dataarray[i].phone+'</td>'
				+'<td>'+dataarray[i].goods+'</td>'
				+'<td>'+dataarray[i].weight+'</td>'
				+'<td>'+dataarray[i].start+'</td>'
				+'<td>'+dataarray[i].destination+'</td></tr>';
				
			}
		document.getElementById("pageshow").innerHTML=table1count;
		document.getElementById("table1").innerHTML=str;
		break;
	case 2:
		str='<tr><td>司机编号</td>'
			+'<td>姓名</td>'
			+'<td>电话</td>'
			+'<td>车号</td>'
			+'<td>装载量</td>'
			+'</tr>';
		for(i=start;i<end;i++)
		{
		
			str=str+'<tr><td>'+dataarray[i].drivernums+'</td>'
			+'<td>'+dataarray[i].name+'</td>'
			+'<td>'+dataarray[i].phone+'</td>'
			+'<td>'+dataarray[i].carnum+'</td>'
			+'<td>'+dataarray[i].cargo+'</td>'
			+'</td></tr>';
			
		}
		document.getElementById("pageshow").innerHTML=table2count;
	document.getElementById("table2").innerHTML=str;
		break;
	case 3:
		 str='<tr>'
 			+'<td>货运单号</td>'
 			+'<td>订单人</td>'
 			+'<td>订单人电话</td>'
 			+'<td>货物</td>'
 			+'<td>重量</td>'
 			+'<td>始发地</td><td>目的地</td></tr>';
		 for(i=start;i<end;i++)
		{
		
			str=str+'<tr><td>'+dataarray[i].acnum+'</td>'
			+'<td>'+dataarray[i].boss+'</td>'
			+'<td>'+dataarray[i].phone+'</td>'
			+'<td>'+dataarray[i].goods+'</td>'
			+'<td>'+dataarray[i].weight+'</td>'
			+'<td>'+dataarray[i].start+'</td>'
			+'<td>'+dataarray[i].destination+'</td>'
			+'<td>'+dataarray[i].drivernum+'</td>'
			+'<td>'+dataarray[i].car+'</td>'
			+'</tr>';
			
		}
		 document.getElementById("pageshow").innerHTML=table3count;
	document.getElementById("table3").innerHTML=str;
	break;
	
	}
}

function next()
{
	switch(currenttable)
	{
	case 1:
		getapplicationdata(1,++table1count);
		//document.getElementById("pageshow").innerHTML=table1count;
		break;
	case 2:
		getapplicationdata(2,++table2count);
		//document.getElementById("pageshow").innerHTML=table2count;
		break;
	case 3:
		getapplicationdata(3,++table3count);
		//document.getElementById("pageshow").innerHTML=table3count;
		break;
	
	}
}

function preview()
{
	switch(currenttable)
	{
	case 1:
		getapplicationdata(1,--table1count);
		//document.getElementById("pageshow").innerHTML=table1count;
		break;
	case 2:
		getapplicationdata(2,--table2count);
		//document.getElementById("pageshow").innerHTML=table2count;
		break;
	case 3:
		getapplicationdata(3,--table3count);
		//document.getElementById("pageshow").innerHTML=table3count;
		break;
	
	}
}



/**
 * 画图形
 * @returns
 */
function getcountoftable()
{
	$.ajax({
		type:"get",
		url:"getcountofmaintable",
		dataType:"json",
		success:function(data)
		{
			
			
			var pers = new Array();
			var one=data.taketable1;
			var two=data.taketable2;
			var three=data.taketable3;
			var sum=one+two+three;
			var data = [
	        	{name : '待配货',value: one/sum,color:'#9d4a4a'},
	        	{name : '车辆修整',value : two/sum,color:'#5d7f97'},
	        	{name : '运送中',value : three/sum,color:'#97b3bc'},
	        	
	    	];

	new iChart.Pie2D({
		render : 'canvasDiv',
		data: data,
		title : '出车率比例',
		legend : {
			enable : true
		},
		showpercent:true,
		decimalsnum:2,
		width : 800,
		height : 400,
		radius:140
	}).draw();
		
			
		},
		error:function(){
			
			
		}
		
	});

}