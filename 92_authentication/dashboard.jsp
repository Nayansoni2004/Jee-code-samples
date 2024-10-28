<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>!! Authentication !! Dashboard</title>

    <link rel="stylesheet" href="static/css/header.css">
    <link rel="stylesheet" href="static/css/footer.css">
    <link rel="stylesheet" href="static/css/common.css">

    <style>
        #message {
            border: 2px solid rgb(226, 248, 78);
            color: rgb(239, 5, 32);
            background-color: rgb(236, 236, 159);
            border-radius: 30px;
            width: 65%;
            margin-top: 30px;
            margin-left: 240px;
            padding-top: 10px;
            padding-bottom: 10px;
            text-align: center;
        }
    </style>
</head>
<body>
    <div id="main_container">
        <%@ include file="header.jsp" %>
        <!-- <div id="header">
            <img src="static/media/images/logo.png" id="logo">
            <span id="compnam">Authenticate App Welcome Page</span>
            <ul id="control">
                <li>
                    <a href="signin.do">SignIn</a>
                </li>
                <li>
                    <a href="signup.do">SignUp</a>
                </li>
            </ul>
        </div> -->

        <div id="main_body">
            <div id="message">YOUR DASHBOARD PAGE</div>
        </div>

        <!-- <div id="footer">
            <span>&copy; Authenticate App, since 1965</span>
        </div> -->
        <%@ include file="footer.jsp" %>
    </div>    
</body>
</html>