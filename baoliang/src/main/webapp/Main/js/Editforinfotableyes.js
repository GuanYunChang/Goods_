function saveappliaction()
{
	 var parm = $("#formtable").serialize();
	alert(parm);
	$.ajax({
		type:"post",
		url:"saveappliactionyes",
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