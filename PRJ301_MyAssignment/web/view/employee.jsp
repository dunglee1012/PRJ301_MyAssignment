<%-- 
    Document   : employee
    Created on : Aug 18, 2022, 10:47:24 AM
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
        <span>Employee</span>
        <table border="1px">
            <tr>
                <th>Employee Id</th>
                <th>Fullname</th>
                <th>Date of Birth</th>
                <th>Age</th>
                <th>Telephone</th>
                <th>Title</th>
                <th>Assign</th>
                <th>Company</th>
            </tr>
            <c:forEach items="${requestScope.employee}" var="e">
                <c:set var="id" value="${e.id}"/>
                <tr>
                    <td>${e.id}</td>
                    <td>${e.fullname}</td>
                    <td>${e.age}</td>
                    <td>${e.dob}</td>
                    <td>${e.telephone}</td>
                    <td>${e.title}</td>
                    <td>${e.assign}</td>
                    <td>${e.company}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
