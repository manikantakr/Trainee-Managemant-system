<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trainee Details</title>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
    margin: 0;
    padding: 0;
  }

  h1 {
    text-align: center;
    margin-top: 50px;
  }

  table {
    margin: 0 auto;
    border-collapse: collapse;
    width: 80%;
    max-width: 800px;
    background-color: #fff;
    border-radius: 5px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  }

  th, td {
    padding: 10px;
    border: 1px solid #ccc;
    text-align: left;
  }

  th {
    background-color: #4cAF50;
    color: white;
  }

  tr:nth-child(even) {
    background-color: #f2f2f2;
  }

  tr:hover {
    background-color: #ddd;
  }

  input[type="button"] {
    display: block;
    margin: 20px auto;
    padding: 10px 20px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
  }

  input[type="button"]:hover {
    background-color: #45a049;
  }
</style>
</head>
<body>

<a href="Trainee.html"><input type="button" value="Back"></a>

<h1>Trainee Details</h1>

<table border="1">
  <tr>
    <th>Trainee ID</th>
    <th>Trainee Name</th>
    <th>Trainee Location</th>
    <th>Trainee Domain</th>
  </tr>
  <c:forEach var="t" items="${tList}">
    <tr>
      <td>${t.tId}</td>
      <td>${t.tName}</td>
      <td>${t.tLocation}</td>
      <td>${t.tDomain}</td>
    </tr>
  </c:forEach>
</table>

</body>
</html>
