<%-- 
    Document   : login
    Created on : Aug 18, 2022, 8:17:57 AM
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
        <form action="login" method="POST">
            <table>
                <tr>
                    <td>Username: </td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><input type="text" name="password"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login"></td>
                    <td></td>
                </tr>
                <tr>
                    <td><a href="forget">Forget Password</a></td>
                    <td></td>
                </tr>
            </table>
        </form>
    </body>
</html>
