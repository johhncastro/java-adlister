<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: johncastro
  Date: 5/3/22
  Time: 11:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authors</title>
</head>
<body>
<jsp:useBean id="authors" scope="request" type="java.util.List"/>
<c:forEach var="author" items="${authors}">
    <p>${author.authors_name}</p>
</c:forEach>
</body>
</html>
