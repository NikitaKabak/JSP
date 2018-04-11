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
<h20>body</h20>
<c:out value="texxxxxxxxxt"/>
<c:forEach var="mov" begin="0" end="3">
    <c:out value="${mov}"/>
</c:forEach>
<Form action="greding" method="post">Введите имя<input name="name"><input type="submit"></Form>
</body>
</html>
