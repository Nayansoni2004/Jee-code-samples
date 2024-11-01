<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>!! Authenticate Welcome Page !!</title>

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
        <%@ include file="header.jsp" %>

        <div id="main_body">
            <div id="empty_box">
                No Content Planned So Far!
            </div>
        </div>

        <%@ include file="footer.jsp" %>
    </div>
</body>
</html>