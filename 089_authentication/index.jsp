<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <link rel="stylesheet" href="header.css">
    <link rel="stylesheet" href="footer.css">
    <link rel="stylesheet" href="common.css">

    <style>
        #main_body {
            /* border: 3px solid red; */
        }

        #empty_box {
            width: 75%;
            height: 250px;
            border-radius: 12px;
            background-color: #f2bd4a;
            margin: 30px auto;
            text-align: center;
            padding-top: 50px;
            font-family: "comic sans ms";
            font-size: 24px;
            /* color: #333; */
            color: white;
            /* animation: changeBackground 10s infinite; */
        }
        /* @keyframes changeBackground {
            0% { background-color: red; }
            25% { background-color: blue; }
            50% { background-color: green; }
            75% { background-color: yellow; }
            100% { background-color: gray; }
        } */
    </style>
</head>
<body>
    <div id="main_container">
        <div id="header">
            <img src="logo.png" id="logo">
            <span id="compnam">Authenticate App Welcome Page</span>
            <ul id="control">
                <li>
                    <a href="signin.do">SignIn</a>
                </li>
                <li>
                    <a href="signup.do">SignUp</a>
                </li>
            </ul>
        </div>

        <div id="main_body">
            <div id="empty_box">
                No Content Planned So Far!
            </div>
        </div>

        <div id="footer">
            <span>&copy; Authenticate App, since 1965</span>
        </div>
    </div>

</body>
</html>