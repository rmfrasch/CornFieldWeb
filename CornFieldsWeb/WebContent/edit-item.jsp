<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Selected Field</title>
</head>
<body>
	<form action="editItemServlet" method="post">
		Field Name: <input type="text" name="fieldName"
			value="${itemToEdit.fieldName}"><input type="submit"
			value="Save Edited Item">
	</form>

</body>
</html>