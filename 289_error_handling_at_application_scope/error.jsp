<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1 style="color:red">Error Page</h1>

    <h2 style="color:red">****************************************************************************************************************************</h2>

    <p>
        Due to technical issue at our end we are unable to render the page you want... 

        <br>

        Please try again later... 

        <br>
        
        <h3>Our team is working on the problem to resolve the issue...</h3>
    </p>

    <h3 style="color: red"><%= exception %></h3> <%-- getting the implicit object exception from app. scope --%>
</body>
</html>