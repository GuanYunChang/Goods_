var count=1;
/**
 * 图表的隐藏与展现
 */
$(document).ready(function(){
$(".hidenorshow").click(function(){
    $("#canvasDiv").slideToggle("slow");
    count++;
    if(count%2)
    		document.getElementById("hidenorshow").innerHTML="隐藏";
    	else
    		document.getElementById("hidenorshow").innerHTML="展示";
  });
});

/**
 * 按钮选择table
 * @returns
 */
$(function(){
	
	$("#table1").show();
	$("#table2").hide();
})
function Selecttable(tablecount){
	
	
	if(tablecount==1)
		{
			$("#table1").show();
			$("#table2").hide();
		}else
			{
				$("#table1").hide();
				$("#table2").show();
			
			}
	
}

