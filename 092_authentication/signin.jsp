<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>!! Authentication !! Signin</title>

    <link rel="stylesheet" href="static/css/header.css">
    <link rel="stylesheet" href="static/css/footer.css">
    <link rel="stylesheet" href="static/css/common.css">
    <link rel="stylesheet" href="static/css/form.css">

    <style>
        
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
            <form action="signin.do" method="post" id="form_box">
                <h2>SignIn</h2>
                <div>
                    <label for="email">Email:</label>
                    <input type="email" name="email" id="email">
                </div>
                <div>
                    <label for="password">Password:</label>
                    <input type="password" name="password" id="password">
                </div>
                <div style="text-align: center;">
                    <input type="submit" value="SignIn" id="btn">
                </div>
            </form>
        </div>

        <!-- <div id="footer">
            <span>&copy; Authenticate App, since 1965</span>
        </div> -->
        <%@ include file="footer.jsp" %>
    </div>
</body>
</html>