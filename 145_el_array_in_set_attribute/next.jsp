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

    <% String[] ar = (String[])request.getAttribute("pqr"); %>

    <h1>AAM ZINDAGI:</h1>
    <h1><%= ar[0] %></h1>
    <h1><%= ar[1] %></h1>
    <h1><%= ar[2] %></h1>

    <p>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</p>

    <h1>MENTOS ZINDAGI:</h1>
    <h1>${pqr[0]}*</h1>
    <h1>${pqr['1']}*</h1>
    <h1>${pqr["2"]}*</h1>
    <h1>${pqr[3]}~</h1>
</body>
</html>