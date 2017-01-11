<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: NESOY
  Date: 2017-01-10
  Time: 오후 3:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%-- JSP Expression Language --%>
<ul>
    <li> Id: ${customer.id} </li>
    <li> Name: ${customer.name} </li>
    <li> E-mail: ${customer.email} </li>
</ul>

<%-- JSTL --%>
<table style="border: 1px solid red; padding: 10px;">
<c:forEach var="customer" items="${customerList}">
<tr>
    <td>${customer.id}</td>
    <td>${customer.name}</td>
    <td>${customer.email}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
