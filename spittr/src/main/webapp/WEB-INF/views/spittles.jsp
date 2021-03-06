<%--
  Created by IntelliJ IDEA.
  User: liucaisi
  Date: 2017/12/4
  Time: 下午7:05
  To change this templates use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/static" href="<c:url value="/css/style.css"/>"/>
</head>
<body>
<div class="spittleForm">
    <h1>Spit it out...</h1>
    <form method="post" name="spittleForm">
        <input type="hidden" name="longitude"/>
        <input type="hidden" name="latitude"/>
        <textarea name="message" cols="80" rows="5"></textarea><br/>
        <input type="submit" value="Add"/>
    </form>
</div>

<div class="listTitle">
    <h1>Recent Spittles</h1>
    <ul class="spittleList">
        <c:forEach items="${spittleList}" var="spittle">
            <li id="spittle_<c:out value="${spittle.id}"/>">
                <div class="spittleMessage"><c:out value="${spittle.message}"/></div>
                <div>
                    <span class="spittleTime"><c:out value="${spittle.time}"/></span>
                    <span class="spittleLocation">(<c:out value="${spittle.longitude}"/>, <c:out
                            value="${spittle.latitude}"/>)</span>
                </div>
            </li>
        </c:forEach>
    </ul>
    <c:if test="${fn:length(spittleList) gt 20}">
        <hr/>
        <s:url value="/spittles?count=${nextCount}" var="more_url"/>
        <a href="${more_url}">Show more</a>
    </c:if>
</div>
</body>
</html>
