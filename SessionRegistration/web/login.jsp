<%-- 
    Document   : index
    Created on : Apr 9, 2023, 9:30:01 AM
    Author     : trail
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <style>
            body{
                background-color: grey;
            }
        </style>
    </head>
    <body>
        <h3>Login Page</h3>
		<form action="LoginControllerServlet" method="GET">
			
			<table>
				<tbody>
					<tr>
						<td><label>Enter Username:</label></td>
						<td><input type="text" name="uname"></td>
					</tr>
					<tr>
						<td><label>Enter password:</label></td>
						<td><input type="text" name="pwd"></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Submit" ></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><a href="registration.jsp">Create new account</a></td>
					</tr>
				</tbody>
			</table>
		</form>
    </body>
</html>
