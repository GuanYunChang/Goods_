$(function(){
	
	$('#operate').show();
	$('#addmanager').hide();
})
function selectbtn(index)
{
	
	switch(index)
	{
		case 1:
			$('#operate').show();
			$('#addmanager').hide();
			document.location.reload()
			break;
		case 2:
			$('#operate').hide();
			$('#addmanager').show();
			break;
	}
}
/**
 * 获取管理员的列表
 * @returns
 */
$(function(){
	
	$.ajax({
		type:"post",
		url:"getmanagerlist",
		dataType:"json",
		success:function(data)
		{
			//alert(data.managers);
			var str="<tr><td>管理员电话</td><td>管理员名字</td><td>操作</td></tr>";
			var mydata = eval('(' + data.managers + ')');
			var i;
			for(i=0;i<mydata.length;i++)
			{
				str=str+"<tr><td>"+mydata[i].phone+"</td><td>"+mydata[i].name+"</td>"
				+"<td><input type=\"button\" value=\"删除\" onclick=\"deletemanager("+mydata[i].phone+")\"/>"
				+"<input type=\"button\" value=\"修改\" onclick=\"editemanager("+mydata[i].phone+",'"+mydata[i].name+"')\"/>";
				
				
			}
			document.getElementById("optable").innerHTML=str;
			
		},
		error:function(){
			alert("获取管理员列表失败");
			
		}
		
	});
})



/**
 * 删除管理员
 * @param phone
 * @returns
 */
function deletemanager(phone)
{
	$.ajax({
		type:"post",
		url:"deletemanager",
		data:"phone="+phone,
		dataType:"json",
		success:function(data)
		{
			alert(phone+"删除成功");
			document.location.reload()
		},
		error:function(){
			alert("删除失败");
			
		}
		
	});
}
/**
 * 编辑管理员信息
 * @param index
 * @returns
 */
function editemanager(phone,name)
{
	 window.location.href="http://"+window.location.hostname+":"+window.location.port+"/baoliang/editemanagerforward?phone="+phone+"&name="+name; 
}