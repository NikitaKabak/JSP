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

<c:out value="Сайт"/>

<jsp:useBean id="count" class="methods.Counter"/>

<h1>
    Number of views: <jsp:getProperty name="count" property="count"/>

</h1>

<Form action="test" method="post">Введите имя<input name="name"><input type="submit"></Form>

</body>
</html>
