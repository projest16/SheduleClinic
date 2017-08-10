<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    <link href="/resources/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<h1></h1>
<tr>
    <td><div class="h1">${doctor.surname} ${doctor.name} ${doctor.patronymic}</div></td>
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
                <td><div class="well">${shedule.id}</div></td>
                <td><div class="well">${shedule.duration}</div></td>
                <td><div class="well">${shedule.time}</div></td>
                <td><div class="well">${shedule.doctor.surname}</div></td>
                <td><div class="well">${shedule.patient.surname}</div></td>
                <%--<td>${shedule.doctor_id}</td>--%>
                    <%--<td>${doctor.patronymic}</td>--%>
            </tr>
        </c:forEach>
    </table>

<h1>Add a Shedule</h1>
<c:url var="addAction" value="/shedule/${doctor.id}/add"/>

<form action="/shedule/${doctor.id}/add" method="post">
    <table >
        <th><input type="text" name="duration" placeholder="Продолжительность" ></th>
        <th><input type="date"  name="time" ></th>
    </table>
    <input type="submit"  value="Создать">
    </div>
</form>

<%--<form:form action="${addAction}" commandName="shedule">--%>
    <%--<table>--%>
        <%--<tr>--%>
            <%--<td>--%>
                <%--<form:label path="duration">--%>
                    <%--<spring:message text="duration"/>--%>
                <%--</form:label>--%>
            <%--</td>--%>
            <%--<td>--%>
                <%--<form:input path="duration"/>--%>
            <%--</td>--%>
            <%--<td>--%>
                <%--&lt;%&ndash;<form:input type="data", path="time">&ndash;%&gt;--%>
                <%--&lt;%&ndash;<p>Выберите дату: <input type="date" name="calendar">&ndash;%&gt;--%>

                    <%--<fmt:formatDate var='formattedDate' value='${shedule.time}' type='both' timeStyle='long' dateStyle='long' />--%>
                    <%--<input type="text" value="${formattedDate}"/>--%>
            <%--&lt;%&ndash;</form:input>&ndash;%&gt;--%>
            <%--</td>--%>
            <%--&lt;%&ndash;<td>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<form:label path="time">&ndash;%&gt;--%>
                    <%--&lt;%&ndash;<spring:message text="time"/>&ndash;%&gt;--%>
                <%--&lt;%&ndash;</form:label>&ndash;%&gt;--%>
            <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td>&ndash;%&gt;--%>
                <%--&lt;%&ndash;<form:input path="time"/>&ndash;%&gt;--%>
            <%--&lt;%&ndash;</td>&ndash;%&gt;--%>
        <%--</tr>--%>
        <%--<td colspan="2">--%>
            <%--<input type="submit"--%>
                   <%--value="<spring:message text="Add Shedule"/>"/>--%>
        <%--</td>--%>
        <%--</tr>--%>
    <%--</table>--%>
<%--</form:form>--%>
<%--</c:if>--%>

</body>
</html>
