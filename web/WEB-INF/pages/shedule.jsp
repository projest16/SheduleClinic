<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: d.tarasov
  Date: 04.08.2017
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Расписание</title>
</head>
<body>
<h1></h1>
<tr>
    <td>${doctor.surname} ${doctor.name} ${doctor.patronymic}</td>
</tr>

<%--<c:if test="${!empty listShedule}">--%>
    <table class="tg">
        <tr>
            <th width="80">ID</th>
            <th width="120">duration</th>
            <th width="200">time</th>
            <th width="120">doctor</th>
            <th width="120">patient</th>
                <%--<th width="120">Patronymic</th>--%>
        </tr>
        <c:forEach items="${listShedule}" var="shedule">
            <tr>
                <td>${shedule.id}</td>
                <td>${shedule.duration}</td>
                <td>${shedule.time}</td>
                <td>${shedule.doctor.surname}</td>
                <td>${shedule.patient.surname}</td>
                <%--<td>${shedule.doctor_id}</td>--%>
                    <%--<td>${doctor.patronymic}</td>--%>
            </tr>
        </c:forEach>
    </table>
<%--</c:if>--%>

</body>
</html>
