function saveappliaction()
{
	 var parm = $("#formtable").serialize();
	 var longitudestart=document.getElementById("longitudestart").innerHTML;
		var latitudestart=document.getElementById("latitudestart").innerHTML;
		var longitudedestination=document.getElementById("longitudedestination").innerHTML;
		var latitudedestination=document.getElementById("latitudedestination").innerHTML;
		alert(longitudestart);
	$.ajax({
		type:"post",
		url:"saveappliaction",
		data:parm+"&longitudestart="+longitudestart+"&latitudestart="+latitudestart+"&longitudedestination="+longitudedestination+"&latitudedestination="+latitudedestination,
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

function openwin(index)
{
	switch(index)
	{
	case 1:
	var popup_url="http://"+window.location.hostname+":"+window.location.port+"/baoliang/Popwindow/mapforstart.jsp?flag=ori";
	window.open(popup_url,'newwindow','width='+500+',height='+350+',top='+100+',left='+300+',toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no,status=no');
	break;
	case 2:
		var popup_url="http://"+window.location.hostname+":"+window.location.port+"/baoliang/Popwindow/mapfordestination.jsp?flag=ori";
		window.open(popup_url,'newwindow','width='+500+',height='+350+',top='+100+',left='+300+',toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no,status=no');
		break;
	}
	}