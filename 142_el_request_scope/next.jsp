<%@ page import="models.User" %>

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

    <% User user = (User)request.getAttribute("pqr"); %>
    <h1>AAAM ZINDADI: <%= user.getName() %> </h1>

    <p>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</p>

    <h1>AAM ZINDAGI: <%= user.getAge() %></h1>

    <p>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</p>

    <h1>MENTOS ZINDAGI: ${pqr.name}</h1>

    <p>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</p>

    <h1>MENTOS ZINDAGI: ${requestScope.pqr.name}</h1>

    <p>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</p>

    <h1>MENTOS ZINDAGI: ${requestScope.pqr.age}</h1>
</body>
</html>