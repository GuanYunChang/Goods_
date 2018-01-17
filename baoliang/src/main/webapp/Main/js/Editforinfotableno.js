function saveappliaction()
{
	 var parm = $("#formtable").serialize();
	
	$.ajax({
		type:"post",
		url:"saveappliaction",
		data:parm,
		dataType:"json",
		success:function(data)
		{
			alert("修改成功");
		},
		error:function(){
			
			alert("修改数据失败");
		}
		
	});
}