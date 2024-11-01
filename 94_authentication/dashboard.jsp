<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>!! Authentication !! Dashboard</title>

    <style>
        #main_container {
            height: 1000px;
        }

        #main_body {
            text-align: center;
            padding-top: 50px;
        }

        a {
            text-decoration: none;
        }

        .thumbnails {
            margin: 20px auto;
            border: 1px solid #ccc;
            padding: 20px;
            padding-bottom: 10px;
            border-radius: 7px;
            display: inline-block;
            width: 220px;
            margin-right: 70px;
            background-color: rgb(162, 238, 238);
            color: rgb(86, 10, 10);
            cursor: pointer;
        }

        #message {
            border: 2px solid rgb(226, 248, 78);
            color: rgb(239, 5, 32);
            background-color: rgb(236, 236, 159);
            border-radius: 30px;
            width: 65%;
            margin-top: -15px;
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
            <a href="products.do">
                <div id="products" class="thumbnails">
                    <img src="static/media/images/products.png" height="200">
                    <h2>Products</h2>
                </div>
            </a>

            <a href="orders.do">
                <div id="orders" class="thumbnails">
                    <img src="static/media/images/orders.jpg" height="200">
                    <h2>Orders</h2>
                </div>
            </a>
        </div>

        <!-- <div id="footer">
            <span>&copy; Authenticate App, since 1965</span>
        </div> -->
        <%@ include file="footer.jsp" %>
    </div>    
</body>
</html>