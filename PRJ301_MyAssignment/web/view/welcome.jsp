<%-- 
    Document   : welcome
    Created on : Aug 19, 2022, 2:33:27 AM
    Author     : leeng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome ${sessionScope.account.username}</h1>
    </body>
</html>
