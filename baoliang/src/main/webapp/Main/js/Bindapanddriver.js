function poptest()
{
	var popup_url="http://"+window.location.hostname+":"+window.location.port+"/baoliang/Popwindow/poptest.jsp";
	window.open(popup_url,'newwindow','width='+500+',height='+350+',top='+100+',left='+300+',toolbar=no,menubar=no,scrollbars=yes,resizable=no,location=no,status=no');
}