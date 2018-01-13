<%--
  Created by IntelliJ IDEA.
  User: liucaisi
  Date: 2017/12/4
  Time: 下午5:53
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ page session="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css"/>"/>
</head>
<body>
<h1><s:message code="spitter.welcome" text="Welcome"/> </h1>

<%-- 方式一 --%>
<%--
<a href="<c:url value="/spittles"/>">Spittles</a>
<a href="<c:url value="/spitter/register"/>">Register</a>
--%>

<%-- 方式二 --%>
<s:url value="/spitter/register" var="registerUrl"/>
<a href="<s:url value="/spittles"/>">Spittles</a>
<a href="${registerUrl}">Register</a>
</body>
</html>
