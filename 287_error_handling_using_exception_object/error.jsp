<%@ page isErrorPage="true" %> 

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1 style="color:red ">Error Page</h1>

    <h2 style="color: blue;">******************************************</h2>

    <p>
        Due To Some Problem We Are Unable To Render The Page You Want---

        <br>

        Please Try Again Later---
    </p>

    <h3 style="color: green;"><%= exception %></h3> <!--jsp implicit object : exception, which is created in special cases... -->
</body>
</html>