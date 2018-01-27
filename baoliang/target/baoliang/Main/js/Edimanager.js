function editinfo()
{
	 var parm = $("#formtable").serialize();
	$.ajax({
		type:"post",
		url:"editemanager",
		data:parm,
		dataType:"json",
		success:function(data)
		{
			alert("修改成功");
		},
		error:function(){
			alert("修改失败");
			
		}
		
	});
}