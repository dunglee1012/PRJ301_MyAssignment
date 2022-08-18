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
        <c:forEach items="${requestScope.requests}" var="r">
        <tr>
            <td>${r.rid}</td>
            <td>${r.content}</td>
            <td>${r.from}</td>
            <td>${r.to}</td>
            <td>${r.createdby.username}</td>
        <tr/>
        </c:forEach>
    </body>
</html>
