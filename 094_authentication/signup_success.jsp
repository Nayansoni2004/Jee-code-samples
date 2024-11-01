<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>!! Authenticate !! Signup Success</title>

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

        <div id="main_body">
            <div id="message">
                Congrats! your account is successfully created... <br><br>
                
                YOU ARE NOW A MEMBER OF OUR Authenticate App!
            </div>
        </div>

        <%@ include file="footer.jsp" %>
    </div>
</body>
</html>