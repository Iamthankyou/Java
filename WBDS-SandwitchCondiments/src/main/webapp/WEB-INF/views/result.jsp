<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Sandwitch Condiments Listing</title>
</head>
<body>
<h1>Sandwitch Condiments Listing</h1>
<ol>
    <c:forEach items="${condiments}" var="c">
        <li><c:out value="${c}"/></li>
    </c:forEach>
</ol>

</body>
</html>
