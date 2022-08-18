<%-- 
    Document   : forget
    Created on : Aug 18, 2022, 10:01:11 AM
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
        <form action="forget" method="POST">
            Username: <input type="text" name="username"/> <br/>
            Question: 
            <select name="qid">
                <c:forEach items="${requestScope.questions}" var="q">
                    <option value="${q.qid}">${q.question}</option>
                </c:forEach>
            </select> <br/> 
            Answer: <input type="text" name="answer"/> <br/> 
            <input type="submit" value="Requst"/> <br/> 
        </form>
    </body>
</html>
