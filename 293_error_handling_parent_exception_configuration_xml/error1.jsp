<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1 style="color:red">This is Error One Page</h1>

    <h2 style="color:chartreuse">------------------------------------------------------------------------------------------------------------------------------------------</h2>

    <p>
        Due to Some Problem we are not able to render the desired page... 

        <br>

        Please try again later... 

        <br>

        <h3 style="color:chocolate">Our team is working on the problem to resolve the issue... </h3>
    </p>

    <h3 style="color:blueviolet"><%= exception %></h3>
</body>
</html>