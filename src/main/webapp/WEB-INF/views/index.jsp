<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/26/2025
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency-converter</title>
</head>
<body>
<h2>Currency Converter</h2>
<form action="converter" method="post">
  <label>Rate: </label><br/>
  <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
  <label>USD: </label><br/>
  <input type="text" name="usd" placeholder="USD" value="0"/><br/>
  <input type="submit" id="submit" value="Convert"/>
</form>
</body>
</html>
