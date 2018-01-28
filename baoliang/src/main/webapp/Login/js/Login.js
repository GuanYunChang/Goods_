//异步提交表单
$('#submitbtn').click(function() {
		
                    var userName = $('#Username').val();
                    var pass = $('#Password').val();
                    var character = $('#character').val();        
                    if (userName == "" || pass == ""||character=="") {
                        alert("内容不能为空");
                            return false;
                    }
                    var parm = $("#userdata").serialize();
                    var c1=document.getElementById('character1');
                    var c2=document.getElementById('character2');
                    var c3=document.getElementById('character3');
                $.ajax({ 
                    type : "post",
                    url : "Login",
                    data : parm,
                    dataType:"json",
            
                    success : function(data) {
                        if(data.flag==1)
                        	{
                        		var tag;
                        		if(c1.checked==true)
                        			tag=1;
                        		else
                        			if(c2.checked==true)
                        				tag=2;
                        			else if(c3.checked==true)	
                        			 tag=3;
                        		switch(tag)
                        		{
                        		case 1:window.location.href="http://"+window.location.hostname+":"+window.location.port+"/baoliang/Logforward?username="+userName;
                        			break;
                        		case 2:window.location.href="http://"+window.location.hostname+":"+window.location.port+"/baoliang/Logforward1?username="+userName;
                        			break;
                        		case 3: window.location.href="http://"+window.location.hostname+":"+window.location.port+"/baoliang/rootforward?username="+userName;
                        		
                        		break;
                        		}
                        		
                        	}
                        else 
                        	 alert("登录失败");
                    },

                    error : function() {
                        alert("登录失败");
                    }
                });
            });


function randomNum(n){ 
	 var t=''; 
	 for(var i=0;i<n;i++){ 
	 t+=Math.floor(Math.random()*10); 
	 } 
	 return t; 
	} 
var verifycode;
var code=0;
var backtime=30;
var flag1=0;//验证码
var flag2=0;
var flag3=0;
var flag4=0;
function timedCount()
{
	document.getElementById('sendverifycode').value=backtime;
	document.getElementById('sendverifycode').disabled="disabled";
	backtime=backtime-1;
	
	if(backtime!=0)
	{
	setTimeout("timedCount()",1000);
	}else{
		document.getElementById('sendverifycode').disabled=false;
	document.getElementById('sendverifycode').value="send verify code";
	backtime=30;
	}
	
}


function sendmessage(parm,phonenum)
{
	if(verifyphone())
	console.log(parm+","+phonenum);
	
	   $.ajax({ 
           type : "post",
           url : "${pageContext.request.contextPath}/Sendmessage",
           data : "vcode="+parm+"&phone="+phonenum,
           dataType:"json",
   
           success : function(data) {
               
        	   console.log("发送短信成功");
           },

           error : function() {
               alert("发送短信失败");
           }
       });
	
}

$('#sendverifycode').click(function(){
	if(verifyphone())
	{
	var phone=$('#phone').val();
	verifycode=randomNum(4);
	timedCount();
	sendmessage(verifycode,phone);
	console.log("验证码"+verifycode);
	}
	
	
})

/**
 * 注册
 * @returns
 */
function register(phone,pass,name)
{
	
	 $.ajax({ 
         type : "post",
         url : "${pageContext.request.contextPath}/Register",
         data : "phone="+phone+"&password="+pass+"&name="+name,
         dataType:"json",
 
         success : function(data) {
             
      	   console.log("注册成功");
         },

         error : function() {
             alert("注册失败");
         }
     });
}

function closeandverify()
{
	var willverify=$('#verifycode').val();
	if(willverify!=verifycode||willverify=="")
		{
			alert("验证码不正确");
			flag1=0;
			return ;
		
		}
	flag1=1;
	verifyname();
	verifyphone();
	verifypass();
	var phone=$('#phone').val();
	var pass=$('#password').val();
	var name=$('#registername').val();
	if(flag1==1&&flag2==1&&flag3==1&&flag4==1)
		{
			alert("success");
			register(phone,pass,name);
			$('#registerwindow').modal("hide");
			
		}
}


function verifyname(){
	var willname=$('#registername').val();
	var alertname=document.getElementById("alertname");
	if(willname.length==0)
		{
		  
		alertname.innerHTML="名字不能为空";
		flag2=0;
		}else
			{
			alertname.innerHTML="";
			flag2=1;
			}
	
}
function verifyphone(){
	var willphone=$('#phone').val();
	var alertphone=document.getElementById("alertphone");
	if(willphone.length!=11)
		{
		  flag3=0;
		alertphone.innerHTML="手机号码格式不正确";
		return false;
		}else
			{
			alertphone.innerHTML="";
			flag3=1;
			}
	return true;
	
}

function verifypass()
{
	var pass=$('#password').val();
	var repass=$('#repassword').val();
	var alertpass=document.getElementById("alertpass");
	if(pass.length==0||repass==0)
		{
			flag4=0;
			alertpass.innerHTML="密码不能为空";
		}else if(pass!=repass)
			{
			flag4=0;
			alertpass.innerHTML="密码不一致";
			}
	else
		{
		alertpass.innerHTML="";
		flag4=1;
		}
}