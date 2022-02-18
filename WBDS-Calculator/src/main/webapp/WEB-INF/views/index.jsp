<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator Application</title>
</head>
<body>
<h1>Calculator</h1>
<form action="calculator" method="get">
    <input type="text" name="opr_1" value=""><input type="text" name="opr_2" value="">
    <input type="submit" name="operator" value="add"><input type="submit" name="operator" value="sub">
    <input type="submit" name="operator" value="mul"><input type="submit" name="operator" value="div">
</form>
<h2>Message:${message}</h2>
<h2>Result:${result}</h2>
</body>
</html>
