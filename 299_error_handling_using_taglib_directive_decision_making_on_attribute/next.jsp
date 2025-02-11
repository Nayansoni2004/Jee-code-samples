<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

    <% String str = request.getParameter("golu"); %>

    <c:catch var="err">
        <h3 style="color:blue"><%= str.length() %></h3>
    </c:catch>
   
    <c:choose>
        <c:when test="${empty err}">
            <h2 style="color:burlywood">I am happy</h2>
        </c:when>
        <c:otherwise>
            <h2 style="color:cadetblue">I am thoda thoda happy</h2>
        </c:otherwise>
    </c:choose>
</body>
</html>