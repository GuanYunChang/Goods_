function logout()
{
	var parm=$('usernamelabel').val();
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
