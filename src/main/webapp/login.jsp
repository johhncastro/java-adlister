<%--
  Created by IntelliJ IDEA.
  User: johncastro
  Date: 4/26/22
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%

if(request.getMethod().equalsIgnoreCase("post")) {

    String password = request.getParameter("password");
    String username = request.getParameter("user");

    if (password.equals("password") && username.equals("admin")) {
        response.sendRedirect("/index.jsp");
    } else {
        response.sendRedirect("/login.jsp");
    }
}
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page :)</title>
    <jsp:include page="partials/head.jsp" />
    <link rel="stylesheet" href="style/login.css">
</head>
<body>
<h3 class="text-center mt-5 mb m-5">TOP SECRET</h3>
<div class="justify-content-center align-content-center d-flex">
    <form class="align-content-center w-50 align-content-center">
        <!-- Email input -->
        <div class="form-outline mb-4  align-content-center ">
            <label class="form-label" for="form2Example1">Username</label>
            <input type="text" name="user" id="form2Example1" class="form-control " />
        </div>

        <!-- Password input -->
        <div class="form-outline mb-4 align-content-center">
            <label class="form-label" for="form2Example2">Password</label>
            <input type="password" name="password" id="form2Example2" class="form-control" />
        </div>

        <!-- Submit button -->
        <button class="btn btn-primary btn-block mb-4 align-content-center w-100">Sign in</button>
    </form>
</div>


<jsp:include page="partials/script.jsp" />
</body>
</html>
