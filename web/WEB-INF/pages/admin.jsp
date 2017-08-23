<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: d.tarasov
  Date: 10.08.2017
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Admin Panel</h1>
<c:url var="addAction" value="/admin/add"/>

<form:form action="${addAction}" method="post">
<tr>
    <td>Skills:</td>
    <td><form:select path="${shedule}" items="${listDoctors}" itemLabel="surname" itemValue="id">
        <%--<form:option value="1">Select doctor</form:option>--%>
        <%--<form:options items="${listDoctors}"></form:options>--%>
        </form:select>
    </td>
    <td colspan="2">
    <input type="submit"
    value="<spring:message text="Add Shedule"/>"/>
    </td>
</tr>
</form:form>
</body>
</html>
