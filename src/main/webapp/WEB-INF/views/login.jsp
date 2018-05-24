<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 12/12/2016
  Time: 02:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div class="container">
    ${loginError}
    <div class="form-group form">
        <form action='login' method="post">
            <div>
                <label>User name:</label>
                <input type="text" id="userId" name="userId" placeholder="user name" class="form-control"/>
            </div>
            <div>
                <label>Password:</label>
                <input type="password" id="password" name="password" placeholder="password" class="form-control"/>
            </div>
            <button id="loginButton" class="form-control">Login</button>
        </form>
    </div>
</div>
</body>
</html>
