var alldata;
function selectboss(counts)
{
	window.location.href="http://"+window.location.hostname+":"+window.location.port+"/baoliang/shenheget?"+counts
	
}

/**
 * 获取全部的未审核的人
 */
$.ajax({
		type:"get",
		url:"getshenhe",
		data:" ",
		dataType:"json",
		success:function(data)
		{
			
			 var str='<tr>'
				+'<td>用户id</td><td>操作</td>'
				+'</tr>';
			 var mydata = eval('(' + data.shenhe + ')');
			 alldata=mydata;
			 var i;
				for(i=0;i<mydata.length;i++)
					{
						str=str
						+'<tr>'
						+'<td>'+mydata[i].bossphone+'</td>'
						+'<td>'+'<button onclick="selectboss('+i+')">选择</button>'+'</td>'
						+'</tr>'
					
					}
				
				document.getElementById('allshenhe').innerHTML=str;
		},
		error:function(){
			
			alert("请求审核信息错误");
		}
		
	});
	

	