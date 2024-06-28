<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trainee Management System</title>
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

  .container {
    text-align: center;
    margin-top: 20px;
  }

  .button {
    background-color: #4CAF50;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
    text-decoration: none;
  }

  .button:hover {
    background-color: #45a049;
  }

  form {
    margin: 20px auto;
    width: 300px;
    background-color: #fff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  }

  input[type="text"],
  input[type="password"],
  input[type="submit"] {
    width: 100%;
    padding: 10px;
    margin: 5px 0;
    box-sizing: border-box;
    border: 1px solid #ccc;
    border-radius: 5px;
  }

  input[type="submit"] {
    background-color: #4CAF50;
    color: white;
    border: none;
    cursor: pointer;
    font-size: 16px;
  }

  input[type="submit"]:hover {
    background-color: #45a049;
  }
</style>
</head>
<body>

<!-- Failed to Add Trainee Details -->
<div class="container">
  <h1>Failed to Add Trainee Details</h1>
  <a href="Trainee.html" class="button">Back</a>
</div>

<!-- Login Details -->
<div class="container">
  <h1>Login Details</h1>
  <form action="TDBServlet">
    Username <input type="text" name="username"/>
    <br/><br/>
    Password <input type="password" name="pwd"/>
    <br/><br/>
    <input type="submit" value="Login" name="action"/>
  </form>
</div>

</body>
</html>
