function update()
{
	
	var parm=$("#infoform").serialize();
	
	$.ajax({
		type:"post",
		url:"updateuserinfo",
		data:parm,
		dataType:"json",
		success:function(data)
		{
			alert("修改成功");
			
		},
		error:function(){
			
			alert("修改出错");
		}
		
	});
	
}