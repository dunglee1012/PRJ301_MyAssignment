<%-- 
    Document   : list
    Created on : Aug 19, 2022, 2:29:39 AM
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
    <center><jsp:include page="welcome.jsp"/></center>
        
    <center>
        <table border="1px">
            <tr>
                <th>ID</th>
                <th>Content</th>
                <th>From</th>
                <th>To</th>
                <th>CreatedBy</th>
            </tr>
            <c:forEach items="${requestScope.request}" var="r">
                <tr>
                    <td>${r.id}</td>
                    <td>${r.content}</td>
                    <td>${r.from}</td>
                    <td>${r.to}</td>
                    <td>${r.createdby.username}</td>
                </tr>
            </c:forEach>

        </table>
        <br>
        <a href="edit">EDIT</a>
        <a href="delete">DELETE</a>
    </center>



</body>
</html>
