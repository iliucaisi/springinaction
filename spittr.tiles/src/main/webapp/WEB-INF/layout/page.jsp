<%--
  Created by IntelliJ IDEA.
  User: caisil
  Date: 2018/1/14
  Time: 上午10:16
  To change this templates use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/static" href="<s:url
    value="/resources/static/style.static"/>"/>
</head>
<body>
<div id="header">
    <t:insertAttribute name="header"/>
</div>
<div id="content">
    <t:insertAttribute name="body"/>
</div>
<div id="footer">
    <t:insertAttribute name="footer"/>
</div>

</body>
</html>
