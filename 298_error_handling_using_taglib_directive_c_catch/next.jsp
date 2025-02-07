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

    <c:catch>
        <h3 style="color:green"><%= str.length() %></h3>
    </c:catch>

    <h3 style="color:green">I am happy, because Page doesn't crash</h3>
</body>
</html>