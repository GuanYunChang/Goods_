$(function(){
	
	$('#operate').show();
	$('#addmanager').hide();
})
function selectbtn(index)
{
	//var op=document.getElementById("operate");
	//var add=document.getElementById("addmanager");
	switch(index)
	{
		case 1:
			$('#operate').show();
			$('#addmanager').hide();
			break;
		case 2:
			$('#operate').hide();
			$('#addmanager').show();
			break;
	}
}