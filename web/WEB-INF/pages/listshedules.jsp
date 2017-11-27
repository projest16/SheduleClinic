<%--
  Created by IntelliJ IDEA.
  User: d.tarasov
  Date: 27.11.2017
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Shedule List</h2>

<%--<c:if test="${!empty listPatients}">--%>
<table class="tg">
    <tr>
        <th width="80">ID</th>
        <th width="120">ФИО Доктора</th>
        <th width="120">ФИО Пациента</th>
        <th width="120">Дата</th>
        <th width="120">Время</th>
        <%--<th width="120">Patronymic</th>--%>
    </tr>
    <c:forEach items="${listShedules}" var="shedule">
        <tr>
            <td>${shedule.id}</td>
            <td>${shedule.doctor.surname}</td>
            <td>${shedule.patient.surname}</td>
            <td>${shedule.start}</td>
                <%--<td>${shedule.time}</td>--%>
        </tr>
    </c:forEach>
</table>
</body>
</html>
