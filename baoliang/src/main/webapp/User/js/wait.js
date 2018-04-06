 function getUrlParam(name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
            var r = window.location.search.substr(1).match(reg);  //匹配目标参数
            if (r != null) return unescape(r[2]); return null; //返回参数值
        }
$.ajax({
		type:"get",
		url:"getuserstatue",
		data:"phone="+getUrlParam("username"),
		dataType:"json",
		success:function(data)
		{
			if(data.flag==4)
				{
				$('#view1').hide();
				$('#view2').show();
				document.getElementById("reason").innerHTML=data.description;
				}else {
					if(getUrlParam("username")==null)
						{
					$('#view1').show();
					$('#view2').hide();
						}else
							alert("获取信息失败");
				}
			
		},
		error:function(){
			$('#view1').show();
			$('#view2').hide();
			
		}
		
	});

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


function readd()
{
	window.location.href="http://"+window.location.hostname+":"+window.location.port+"/baoliang/User/verify.jsp"; 
}
