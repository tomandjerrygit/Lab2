<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>book</title>
</head>
<body>
<h4>books    <s:property value="title"/></h4>


<s:form action="updateAction.action" method="post">
	<!s:hidden name="isbn" value="%{thebook.isbn}"/>
	<s:textfield name="isbn" label="isbn" value="%{thebook.isbn}" readonly="true"/>
	<s:textfield name="title" label="title" value="%{thebook.title}"/>
	<!s:textfield name="authorid" label="authorid" value="%{thebook.authorid}"/>
	<s:textfield name="publisher" label="publisher" value="%{thebook.publisher}"/>
	<s:textfield name="publishdata" label="publishdata" value="%{thebook.publishdata}"/>
	<s:textfield name="price" label="price" value="%{thebook.price}"/>
	<!s:textfield name="name" label="name" value="%{thebook.name}"/>
	<!s:textfield name="age" label="age" value="%{thebook.age}"/>
	<!s:textfield name="country" label="country" value="%{thebook.country}"/>	
	<s:submit value="submit to updata"/>
</s:form>
   
     author id:  <s:property value="%{thebook.authorid}"/><br></br>
	 author name:<s:property value="%{thebook.name}"/><br></br>
	 age:        <s:property value="%{thebook.age}"/><br></br>
	 country:    <s:property value="%{thebook.country}"/><br></br>
</body>
</html>