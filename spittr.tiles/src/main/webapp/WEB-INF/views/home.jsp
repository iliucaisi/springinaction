<%--
  Created by IntelliJ IDEA.
  User: liucaisi
  Date: 2017/12/4
  Time: 下午5:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page session="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" href="<c:url
    value="/resource/css/style.css"/>"/>
</head>
<body>
<h1>Welcome to Spitter</h1>

<a href="<c:url value="/spittles"/>">Spittles</a>
<a href="<c:url value="/spitter/register"/>">Register</a>

</body>
</html>
