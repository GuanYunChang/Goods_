function shenheres(flag,phone)
{
	
	
	$.ajax({
		type:"post",
		url:"shenheres",
		data:"phone="+phone+"&flag="+flag+"&description="+document.getElementById("description").value,
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