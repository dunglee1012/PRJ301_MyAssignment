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
                <th>RequestID</th>
                <th>Content</th>
                <th>From</th>
                <th>To</th>
                <th>CreatedBy</th>
            </tr>
            <c:forEach items="${requestScope.requests}" var="r">
                <c:set var="id" value="${r.id}">
                    <tr>
                        <td>${id}</td>
                    </tr>
                </c:set>
                
            </c:forEach>
        </table>
    </center>


</body>
</html>
