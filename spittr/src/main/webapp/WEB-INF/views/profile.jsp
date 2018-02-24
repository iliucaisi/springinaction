<%--
  Created by IntelliJ IDEA.
  User: liucaisi
  Date: 2017/12/4
  Time: 下午6:49
  To change this templates use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/static" href="<c:url value="/css/style.css"/>"/>
</head>
<body>
<h1>Your Profile</h1>
<c:out value="${spitter.username}"/><br/>
<c:out value="${spitter.firstName}"/><c:out value="${spitter.lastName}"/><br/>
<c:out value="${spitter.email}"/>
</body>
</html>
