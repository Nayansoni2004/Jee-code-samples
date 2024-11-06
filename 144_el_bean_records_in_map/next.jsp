<%@ page import="java.util.Map" %>
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

    <% Map<String, User> map = (Map)request.getAttribute("pqr"); %>

    <% User user = map.get("PaJi1"); %>

    <p>AAM ZINDAGI: <%= user.getName() %> ~ <%= user.getAge() %> </p>

    <p>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</p>

    <p>MENTOS ZINDAGI: ${pqr.PaJi2.name} - ${pqr.PaJi2.age} </p>

    <p>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</p>
    
    <p>MENTOS ZINDAGI: ${pqr.PaJi3.name} - ${pqr.PaJi3.age} </p>

</body>
</html>