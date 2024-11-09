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

    <h1>Host: ${header.host}</h1>
    <h1>Accept: ${header.accept}</h1>
    <h1>Accept Language: ${header['accept-language']}</h1>
    <h1>Accept Charset: ${header['accept-charset']}</h1>
    <h1>Accept Encoding: ${header['accept-encoding']}</h1>
    <h1>User Agent: ${header['user-agent']}</h1>
    
    <h1>Cookie: ${header.cookie}</h1>
    <h1>Connection: ${header.connection}</h1>
    <h1>Header: ${header}</h1>
</body>
</html>