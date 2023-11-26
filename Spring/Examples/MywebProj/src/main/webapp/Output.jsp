<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1>The response to your input is : </h1>
	<p>
		Thank you
		<%=request.getAttribute("name") %> <!-- scriplets -->
	</p>
	<p>
		your phone number is 
		<%=request.getAttribute("phone") %>
		The notification will be sent shortly to the email id: 
		<%=request.getAttribute("email") %>
	</p>

</body>
</html>