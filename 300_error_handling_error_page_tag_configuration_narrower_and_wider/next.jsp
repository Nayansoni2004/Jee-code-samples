<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage="err1.jsp" %>

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

    <c:catch>
        <h3 style="color:crimson"><%= str.length() %></h3>
    </c:catch>

    <h2 style="color:black">I Am Happy</h2>
</body>
</html>