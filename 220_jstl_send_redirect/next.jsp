<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Next Page</h1>

    <hr>

    <%--<% response.sendRedirect("https://www.cartoonnetworkhq.com/"); %>--%>

    <s:choose>
        <s:when test="${param.num == 1}">
            <s:redirect url="http://amazon.in" />
        </s:when>
        <s:when test="${param.num == 2}">
            <s:redirect url="http://myntra.com" />
        </s:when>
        <s:when test="${param.num == 3}">
            <s:redirect url="http://www.rgpv.ac.in" />
        </s:when>
    </s:choose>
</body>
</html>