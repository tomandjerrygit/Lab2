<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>inputauthor</title>
</head>
<body>
<h3>input author</h3>
<hr/>
<s:fielderror/>
<form action="pageAction.action" method="post">
<table>
	<tr>
		<td>input author:</td>
		<td><input type="text" name="author" value="tom/peter/mary/lily/输入其他显示不存在"></td>
	</tr>
	<tr>
		<td>
			<input type="submit" value="input">
		</td>
	</tr>
</table>
</form>
</body>
</html>