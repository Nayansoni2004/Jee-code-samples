<%@ page import="models.User" %>

<link rel="stylesheet" href="static/css/common.css">
<link rel="stylesheet" href="static/css/header.css">

<% User user=(User)session.getAttribute("user"); %>

<div id="header">
    <img src="static/media/images/logo.png" id="logo">
    <span id="compnam">Authenticate App Welcome Page</span>
    <ul id="control">
        <% if(user==null) { %>
            <li>
                <a href="signin.do">SignIn</a>
            </li>
            <li>
                <a href="signup.do">SignUp</a>
            </li>
        <% } else { %>
            <li>
                <img src="static/media/images/user.png" height="25" style="vertical-align: middle; background-color: none;">
                <span><%= user.getFullName() %></span> <a href="signout.do">SignOut</a>
            </li>
        <% } %>
    </ul>
</div>