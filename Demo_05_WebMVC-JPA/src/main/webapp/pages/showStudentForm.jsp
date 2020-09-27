<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentForm</title>
</head>
<body>
<h2>Student Data</h2>
    <form action="addstudent" method="post">
        Id     :<input type="text" name="id"><br>
		Name   :<input type="text" name="name"><br>
		Email  :<input type="text" name="email"><br>
		Mobile :<input type="text" name="mobile"><br>
	<input type="submit" value="Insert">
</form>
</body>
</html>