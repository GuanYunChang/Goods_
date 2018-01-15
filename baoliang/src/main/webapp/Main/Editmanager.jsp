<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="Lib/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<form class="formtable">
            <label >电话</label>
            <input type="text" value='<s:property value="phone"/>' readonly="readonly"/>
            <label  class="control-label">姓名</label>
            <input type="text" value='<s:property value="name"/>' />
   
	</form>
	<input type="button" value="提交" onclick="editinfo()"/>
</body>
</html>