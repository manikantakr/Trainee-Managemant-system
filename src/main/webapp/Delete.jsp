<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Operation</title>
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

  h2 {
    text-align: center;
    margin-top: 20px;
  }

  form {
    margin: 20px auto;
    width: 80%;
    max-width: 800px;
    background-color: #fff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  }

  table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 20px;
  }

  th, td {
    padding: 10px;
    text-align: left;
    border: 1px solid #ccc;
  }

  input[type="text"],
  input[type="submit"],
  input[type="button"] {
    padding: 10px;
    margin: 5px;
    border: 1px solid #ccc;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
  }

  input[type="submit"]:hover,
  input[type="button"]:hover {
    background-color: #4CAF50;
    color: white;
  }

  .button-container {
    text-align: center;
    margin-top: 20px;
  }
</style>
</head>
<body>

<form action="TDBServlet">
  <input type="hidden" name="formType" value="deleteForm">
  <table>
    <tr>
      <td colspan="3">
        <h1>Delete Operation</h1>
      </td>
    </tr>
    <tr>
      <td>Please Enter Trainee ID</td>
      <td><input type="text" name="trnid"></td>
      <td class="button-container">
        <input type="submit" value="Search" name="action">
        <a href="Trainee.html"><input type="button" value="Back"></a>
      </td>
    </tr>
  </table>
</form>

<h2>Trainee Info</h2>
<table border="1">
  <tr>
    <td>Trainee ID</td>
    <td>${trn.tId}</td>
  </tr>
  <tr>
    <td>Trainee Name</td>
    <td>${trn.tName}</td>
  </tr>
  <tr>
    <td>Trainee Location</td>
    <td>${trn.tLocation}</td>
  </tr>
  <tr>
  
    <td>Trainee Domain</td>
    <td>${trn.tDomain}</td>
  </tr>
</table>

<form action="TDBServlet">
  <input type="hidden" name="trnid" value="${trn.tId}">
  <input type="submit" value="Delete" name="action">

</form>






</body>
</html>
