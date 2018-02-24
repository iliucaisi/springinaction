<%--
  Created by IntelliJ IDEA.
  User: liucaisi
  Date: 2017/12/4
  Time: 下午7:02
  To change this templates use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/static" href="<c:url
    value="/resources/css/style.css"/>"/>
</head>
<body>
<div class="spittleView">
    <div class="spittleMessage"><c:out value="${spittle.message}"/></div>
    <div>
        <span class="spittleTime"><c:out value="${spittle.time}"/></span>
    </div>
</div>

</body>
</html>
