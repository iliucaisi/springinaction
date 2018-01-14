<%--
  Created by IntelliJ IDEA.
  User: liucaisi
  Date: 2017/12/4
  Time: 下午6:56
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ page session="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css"/>"/>
</head>
<body>
<h1>Register</h1>

<%-- 方式一 --%>
<%--<form method="post">
    First Name: <input type="text" name="firstName"/><br/>
    Last Name: <input type="text" name="lastName"/><br/>
    Email: <input type="text" name="email"/><br/>
    User Name: <input type="text" name="username"/><br/>
    Password: <input type="password" name="password"/><br/>
    <input type="submit" value="Register">
</form>
--%>

<%-- 方式二 --%>
<sf:form method="post" modelAttribute="spitter">
    <sf:errors path="*" element="div" cssClass="errors"/>
    <sf:label path="firstName" cssErrorClass="error">First Name</sf:label>:
    <sf:input path="firstName" cssErrorClass="error"/><br/>
    <sf:label path="lastName" cssErrorClass="error">Last Name</sf:label>:
    <sf:input path="lastName" cssErrorClass="error"/><br/>
    <sf:label path="email" cssErrorClass="error">Email</sf:label>:
    <sf:input path="email" cssErrorClass="error"/><br/>
    <sf:label path="username" cssErrorClass="error">Username</sf:label>:
    <sf:input path="username" cssErrorClass="error"/><br/>
    <sf:label path="password" cssErrorClass="error">Password</sf:label>:
    <sf:input path="password" cssErrorClass="error"/><br/>
    <input type="submit" value="Register">
</sf:form>


</body>
</html>
