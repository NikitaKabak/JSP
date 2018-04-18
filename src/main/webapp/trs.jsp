<%--
  Created by IntelliJ IDEA.
  User: zhech
  Date: 11.04.2018
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>inf</title>
</head>

<body>

<c:out value="Авторизация"/><br><br>

<jsp:useBean id="count" class="methods.Counter"/>


<Form action="test" method="post">Введите номер телефона  <input name="number"><br><br>
    Введите имя  <input name="name"><br><br>
    Введите e-mail  <input name="email"><br><br>
    <input type="submit">
</Form>

<h4
    Количество посещений: <jsp:getProperty name="count" property="count"/>

</h4>

</body>
</html>
