<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Index Page</h1>

    <hr>

    <% pageContext.setAttribute("aaa", 123); %>
    <% request.setAttribute("aaa", 234); %>
    <% session.setAttribute("aaa", 345); %>
    <% application.setAttribute("aaa", 456); %>

    <p>Attribute Saved in Page Scope: ${pageScope.aaa}</p>
    <p>Attribute Saved in Request Scope: ${requestScope.aaa}</p>
    <p>Attribute Saved in Session Scope: ${sessionScope.aaa}</p>
    <p>Attribute Saved in Application Scope: ${applicationScope.aaa}</p>
</body>
</html>