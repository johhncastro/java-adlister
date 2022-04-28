<%--
  Created by IntelliJ IDEA.
  User: johncastro
  Date: 4/27/22
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <label for="crust">Crust:</label>
    <select name="crust" id="crust">
        <option value="thin">Crispy Thin</option>
        <option value="pan">Pan</option>
        <option value="deep-dish">Deep Dish</option>
    </select>
    <label for="sauce">Sauce:</label>
    <select name="sauce" id="sauce">
        <option value="original">Original Red Sauce</option>
        <option value="pesto">Pesto Sauce</option>
        <option value="alfredo">Alfredo Sauce</option>
    </select>
    <label for="size">Pizza Size:</label>
    <select name="size" id="size">
        <option value="personal">Personal</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>
    <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni" /> <label for="pepperoni">Pepperoni</label>
    <input type="checkbox" id="sausage" name="toppings" value="sausage" /> <label for="sausage">Italian Sausage</label>
    <input type="checkbox" id="mushroom" name="toppings" value="mushroom" /> <label for="mushroom">Mushroom</label>
    <br />
    <label for="address">Deliver to:</label>
    <input type="text" id="address" name="address" />
    <input type="submit" value="Submit Order">
</form>
</body>
</html>
