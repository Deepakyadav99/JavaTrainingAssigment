<!-- accountOpening.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Account Opening</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }

        form {
            max-width: 400px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 8px;
        }

        input, select {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="checkbox"] {
            margin-top: 8px;
        }

        input[type="submit"] {
            background-color: #4caf50;
            color: #fff;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <h1>Welcome to Account Opening!</h1>
     <form action="processAccount.jsp" method="post"> 
        <label for="id">ID:</label>
        <input type="text" id="id" name="id" required><br>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required><br>

        <label for="dob">Date of Birth:</label>
        <input type="date" id="dob" name="dob" required><br>

        <label for="salaryRange">Salary Range:</label>
        <select id="salaryRange" name="salaryRange">
            <option value="10,000-40,000">10,000-40,000</option>
            <option value="41,000-80,000">41,000-80,000</option>
            <option value="81,000-1,50,000">81,000-1,50,000</option>
        </select><br>

        <label for="accountType">Account Type:</label>
        <select id="accountType" name="accountType">
            <option value="savings account">Savings Account</option>
            <option value="current account">Current Account</option>
        </select><br>

        <label>Gender:</label>
        <input type="checkbox" id="male" name="gender" value="male">
        <label for="male">Male</label>
        <input type="checkbox" id="female" name="gender" value="female">
        <label for="female">Female</label><br>

        <input type="submit" value="Open Account">
    </form>
</body>
</html>
