<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1 style="color:darkcyan">Next Page</h1>

    <hr>

    <% String str = request.getParameter("golu"); %>

    <% try{ %>
        <h3 style="color:goldenrod"><%= str.length() %></h3>
    <% } catch(NullPointerException e) { %>
        <h3 style="color:red">SOme Problem</h3>
    <% } %>    

</body>
</html>