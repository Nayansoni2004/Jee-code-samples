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

    <p>Map 2 record is: ${pqr[1]['A1'].name}</p>
    <p>Map 2 record is: ${pqr[1].A1.name}</p>
    <p>Map 2 record is: ${pqr[1].A1['name']}</p>
    <p>Map 2 record is: ${pqr[1]['A1']['name']}</p>

    <p>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</p>

    <p>Entire ArrayList object records are: ${pqr}</p>
    <p>Entire Map 2 records are: ${pqr[1]}</p>
    <p>Map 2 A2 key record is: ${pqr[1]['A2']}</p>
    <p>Map 2 record A2 name only is: ${pqr[1]['A2']['name']}</p>
</body>
</html>