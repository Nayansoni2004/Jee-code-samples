<%@ page isErrorPage="true" %> <!-- "true" to get the jsp implicit object exception: to convey the error message -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1 style="color: red; text-align: center;">Error Page</h1>

    <h2 style="color: blue;">*******************************************************************************************************************************</h2>

    <p>
        Due To Some Problem We Are Unable To Render The Page You Want----

        <br>

        Please Try Again Later...
    </p>

    <% if(exception instanceof ArithmeticException) { %>
        <h3 style="color: red;">Some Problem With The Input: <%= exception.getMessage() %></h3>
    <% } else if(exception instanceof NumberFormatException) { %>
        <h3 style="color: chartreuse;">Some Problem With The Input: <%= exception.getMessage() %></h3>
    <% } else if(exception instanceof ArrayIndexOutOfBoundsException) { %>
        <h3 style="color: darksalmon;">Some Problem Occured With The Input: <%= exception.getMessage() %></h3>
    <% } %>
</body>
</html>