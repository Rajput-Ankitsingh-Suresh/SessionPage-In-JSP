<%-- 
    Document   : registration
    Created on : Apr 9, 2023, 9:30:24 AM
    Author     : trail
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
                background-color: grey;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h3>Registration page</h3>
		<form action="RegisterControllerServlet" method="POST">
			
			<table>
				<tbody>
					<tr>
						<td><label>Enter name:</label></td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td><label>Enter username:</label></td>
						<td><input type="text" name="uname"></td>
					</tr>
					<tr>
						<td><label>Enter email:</label></td>
						<td><input type="text" name="email"></td>
					</tr>
					<tr>
						<td><label>Enter password:</label></td>
						<td><input type="password" name="pwd" ></td>
					</tr>
					<tr>
						<td><label>Enter confirm password:</label></td>
						<td><input type="password" name="cfmpwd" ></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Register"></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><a href="login.jsp">Login</a></td>
					</tr>
				</tbody>
			</table>
		</form>
    </body>
</html>
