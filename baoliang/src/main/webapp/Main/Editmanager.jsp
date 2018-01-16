<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="Lib/jquery.min.js"></script>
<link href="Main/css/Editmanager.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<form class="formtable" id="formtable">
            <label >电话</label>
            <input name="phone" type="text" value='<s:property value="phone"/>' readonly="readonly"/>
            <label  class="control-label">姓名</label>
            <input name="name" type="text" value='<s:property value="name"/>' />
   			<input id="subbtn" type="button" value="提交" onclick="editinfo()"/>
	</form>
	<script type="text/javascript" src="Main/js/Edimanager.js"></script>
</body>
</html>