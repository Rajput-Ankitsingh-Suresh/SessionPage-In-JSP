<%-- 
    Document   : index
    Created on : Apr 9, 2023, 7:18:06 PM
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
<meta charset="ISO-8859-1">
<title>Logout Page</title>
</head>
<body>
	<form action="LogoutAction" method="POST">
		<h2>
			Hello
			<%= request.getParameter("uname") %>
		</h2>
		<input type="submit" value="logout" name="logout" >
	</form>
	
</body>
</html>