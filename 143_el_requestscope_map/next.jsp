<%@ page import="java.util.Map" %>

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

    <% Map recs = (Map)request.getAttribute("pqr"); %>
    <h1>AAM ZINDAGI: <%= recs.get("bbb") %> </h1>

    <p>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</p>

    <h1>MENTOS ZINDAGI: ${pqr.bbb}</h1>

    <p>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</p>

    <h1>MENTOS ZINDAGI: ${requestScope.pqr.aaa}</h1>

    <p>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</p>

    <h1>MENTOS ZINDAGI: ${requestScope.pqr.bbb}</h1>

    <p>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</p>

    <h1>MENTOS ZINDAGI: ${requestScope.pqr.ccc}</h1>
</body>
</html>