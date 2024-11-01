<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>!! Authentication !! Signin</title>

    <link rel="stylesheet" href="static/css/form.css">

    <style>
        
    </style>
</head>
<body>
    <div id="main_container">
        <%@ include file="header.jsp" %>

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

        <%@ include file="footer.jsp" %>
    </div>
</body>
</html>