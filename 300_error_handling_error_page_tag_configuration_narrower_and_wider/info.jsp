<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%@ page errorPage="err1.jsp" %> --%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Info Page</h1>

    <hr>

    <% String str = request.getParameter("golu"); %>

    <h3 style="color:chartreuse"><%= str.length() %></h3>

    <h2 style="color:coral">I Am Happy</h2>
</body>
</html>