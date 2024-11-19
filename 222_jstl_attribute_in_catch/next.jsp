<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

    <c:catch var="err">
        <%
            out.print("<h1>######################################</h1>");
            int num = Integer.parseInt(request.getParameter("num"));
            int y = 12/num;
        %>
        <h2>Total Marks: <%= y %></h2>
    </c:catch>

    <h1>**************************************************************</h1>
    <h1>****************~~~~~${err}~~~~*****************</h1>
    <h1>**************************************************************</h1>
</body>
</html>