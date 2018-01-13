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
	
})
function Selecttable(tablecount){
	
	
	if(tablecount==1)
		{
			$("#table1").show();
			$("#table2").hide();
			
			getapplicationdata(1);
		}else
			{
				$("#table1").hide();
				$("#table2").show();
			
			}
	
}
/**
 * 数据的获取
 * 
 * */
function getapplicationdata(index)
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
			 addtabledata(mydata,index);
		},
		error:function(){
			
			alert("获取数据失败");
			
		}
		
	});
}

/**
 * 填充表格
 * */
function addtabledata(dataarray,tableindex)
{
	switch(tableindex)
	{
	case 1:
		
		var str='<tr>'
        			+'<td>货运单号</td>'
        			+'<td>订单人</td>'
        			+'<td>订单人电话</td>'
        			+'<td>货物</td>'
        			+'<td>始发地</td><td>目的地</td></tr>';
		for(var i in dataarray)
			{
			
				str=str+'<tr><td>'+dataarray[i].acnum+'</td>'
				+'<td>'+dataarray[i].boss+'</td>'
				+'<td>'+dataarray[i].phone+'</td>'
				+'<td>'+dataarray[i].goods+'</td>'
				+'<td>'+dataarray[i].start+'</td>'
				+'<td>'+dataarray[i].destination+'</td></tr>';
				
			}
		document.getElementById("table1").innerHTML=str;
		break;
	case 2:break;
	
	}
}