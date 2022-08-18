<%-- 
    Document   : confirm_login
    Created on : Aug 18, 2022, 9:26:45 AM
    Author     : leeng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            var count = 3;
            function counting() {
                var span = document.getElementById("timer");
                count--;
                span.innerHTML = count;
                if (count <= 0) {
                    window.location.href = "list";  
                }
            }
            setInterval(counting, 1000)
        </script>
    </head>
    <body>
    </body>
    <div>Hello ${requestScope.acc.username}</div>
    <div>Redirect to List Request after <span id="timer">3</span> seconds</div>
</html>
