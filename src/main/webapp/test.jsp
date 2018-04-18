<%--
  Created by IntelliJ IDEA.
  User: zhech
  Date: 18.04.2018
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>inf</title>
</head>

<c:out value="help">
</c:out>
<c:set var="Paramlist" value ="${sessionScope.list}"></c:set>
<c:forEach var="Paramlist" items="${list}">
    <c:out value="${Paramlist}"> </c:out><br/>
</c:forEach>



</body>
</html>
