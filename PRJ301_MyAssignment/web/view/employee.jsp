<%-- 
    Document   : employee
    Created on : Aug 22, 2022, 2:23:54 AM
    Author     : leeng
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Employee List</h1>
        <table>
            <tr>
                <td>Fullname</td>
                <td>Age</td>
                <td>Shift</td>
                <td>Telephone</td>
                <td>Username</td>
            </tr>
            <c:forEach items="${employee}" var="e">
                <tr>
                    <td>${e.}</td>
                    <td>${e.}</td>
                    <td>${e.}</td>
                    <td>${e.}</td>
                    <td>${e.}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
