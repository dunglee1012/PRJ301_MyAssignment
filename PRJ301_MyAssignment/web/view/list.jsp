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
        <jsp:include page="welcome.jsp"/>
    <center>
        <table>
            <tr>
                <th>ID</th>
                <th>Content</th>
                <th>From</th>
                <th>To</th>
                <th>CreatedBy</th>
            </tr>
            <c:forEach items="${requestScope.requests}" var="r">
                <td>${r.id}</td>
                <td>${r.content}</td>
                <td>${r.from}</td>
                <td>${r.to}</td>
                <td>${r.createdby.username}</td>
            </c:forEach>
        </table>
    </center>


</body>
</html>
