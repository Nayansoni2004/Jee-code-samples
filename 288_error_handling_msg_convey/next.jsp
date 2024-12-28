<%@ page errorPage="error.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1 style="text-align: center;">This Is Next Page</h1>

    <hr>

    <% int i = Integer.parseInt(request.getParameter("num")); %>

    <% int[] x = {2,0,3,4,6}; %>

    <h3 style="color: burlywood"><%= 12/x[i] %></h3>
</body>
</html>