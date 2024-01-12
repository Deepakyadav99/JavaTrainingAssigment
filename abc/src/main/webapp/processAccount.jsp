<!-- processAccount.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Account Processing</title>
</head>
<body>
    <h2>Account Processing</h2>
    <% 
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String dob = request.getParameter("dob");
        String salaryRange = request.getParameter("salaryRange");
        String accountType = request.getParameter("accountType");
        String[] gender = request.getParameterValues("gender");
        
       
    %>
    <p>Account opened successfully!</p>
    <p>ID: <%= id %></p>
    <p>Name: <%= name %></p>
    <p>Address: <%= address %></p>
    <p>Date of Birth: <%= dob %></p>
    <p>Salary Range: <%= salaryRange %></p>
    <p>Account Type: <%= accountType %></p>
    <p>Gender: <%= (gender != null && gender.length > 0) ? gender[0] : "Not specified" %></p>
</body>
</html>
