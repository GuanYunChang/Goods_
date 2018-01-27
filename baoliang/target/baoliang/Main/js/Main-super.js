function selectFunc(index)
{
	switch(index)
	{
	case 0:
		document.getElementById("frameK").src="Main/Main-innerPage.jsp";
		break;
	case 1:
		document.getElementById("frameK").src="Main/RegisterManager.jsp";
		break;
	case 2:break;
	case 3:break;
	
	}
	
}

function logout()
{
	var parm=$('username').val();
	 $.ajax({ 
         type : "post",
         url : "Logout",
         data : "name="+parm,
         dataType:"json",
 
         success : function(data) {
        	 window.location.href="http://"+window.location.hostname+":"+window.location.port+"/baoliang"; 
      	   console.log("退出成功");
         },

         error : function() {
             alert("退出失败");
         }
     });

}
