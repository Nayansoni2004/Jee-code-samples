<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="static/css/common.css">
    <link rel="stylesheet" href="static/css/header.css">
    <link rel="stylesheet" href="static/css/footer.css">

    <style>
        #main_container {
            /* border: 4px solid red; */
        }

        #message {
            padding: 100px 0px;
            background-color: rgb(175, 247, 239);
            border: 1px solid rgb(11, 77, 11);
            width: 50%;
            margin: 50px auto;
            text-align: center;
            border-radius: 12px;
            color: rgb(2, 43, 2);
            font-size: 1.2em;
            box-shadow: 4px 4px 20px rgba(29, 187, 4, 0.8);
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
            <div id="message">
                Congrats! your account is successfully created... <br><br>
                
                YOU ARE NOW A MEMBER OF OUR Authenticate App!
            </div>
        </div>

        <!-- <div id="footer">
            <span>&copy; Authenticate App, since 1965</span>
        </div> -->
        <%@ include file="footer.jsp" %>
    </div>
</body>
</html>