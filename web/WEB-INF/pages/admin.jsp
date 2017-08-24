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
    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }

        .tg .tg-4eph {
            background-color: #f9f9f9
        }
    </style>
</head>
<body>
<h1>Admin Panel</h1>
<h2>Add a Shedule</h2>
<%--<c:url var="addAction" value="/admin/add"/>--%>

<form:form action="/admin/addShedule" method="post" modelAttribute="shedule">
    <table>
<tr>
    <td>Доктор:</td>
    <td><form:select path="doctor.doctor_id" items="${listDoctors}" itemLabel="surname" itemValue="doctor_id"/>
        <%--<form:option value="1">Select doctor</form:option>--%>
        <%--<form:options items="${listDoctors}" itemLabel="surname"/>--%>
        <%--</form:select>--%>
    </td>

    <td>Пациент:</td>
    <td><form:select path="patient.patient_id" items="${listPatients}" itemLabel="surname" itemValue="patient_id"/>
        <%--<form:option value="1">Select doctor</form:option>--%>
        <%--<form:options items="${listPatients}" itemLabel="surname"/>--%>
    <%--</form:select>/--%>
    </td>
</tr>
    <td colspan="2">
    <input type="submit"
    value="<spring:message text="Add Shedule"/>"/>
    </td>
    </table>
</form:form>

<h2>Add a Doctor</h2>
<c:url var="addAction" value="/admin/addDoctor"/>

<form:form action="${addAction}" commandName="doctor">
    <table>
        <tr>
            <td>
                <form:label path="surname">
                    <spring:message text="Фамилия"/>
                </form:label>
            </td>
            <td>
                <form:input path="surname"/>
            </td>
            <td>
                <form:label path="position">
                    <spring:message text="Должность"/>
                </form:label>
            </td>
            <td>
                <form:input path="position"/>
            </td>
        </tr>
        <td colspan="2">
            <input type="submit"
                   value="<spring:message text="Add Doctor"/>"/>
        </td>
    </table>
</form:form>

<h2>Add a Patient</h2>
<c:url var="addAction" value="/admin/addPatient"/>

<form:form action="${addAction}" commandName="paient">
    <table>
        <tr>
            <td>
                <form:label path="surname">
                    <spring:message text="Фамилия"/>
                </form:label>
            </td>
            <td>
                <form:input path="surname"/>
            </td>
            <td>
                <form:label path="name">
                    <spring:message text="Имя"/>
                </form:label>
            </td>
            <td>
                <form:input path="name"/>
            </td>
        </tr>
        <td colspan="2">
            <input type="submit"
                   value="<spring:message text="Add Patient"/>"/>
        </td>
        </tr>
    </table>
</form:form>

<h2>Doctor List</h2>

<c:if test="${!empty listDoctors}">
    <table class="tg">
        <tr>
            <th width="80">ID</th>
            <th width="120">ФИО</th>
            <th width="120">Должность</th>
                <%--<th width="120">Patronymic</th>--%>
        </tr>
        <c:forEach items="${listDoctors}" var="doctor">
            <tr>
                <td>${doctor.doctor_id}</td>
                <td><a href="/shedule/${doctor.doctor_id}">${doctor.surname} ${doctor.name} ${doctor.patronymic}</a></td>
                <td>${doctor.position}</td>
                    <%--<td>${doctor.patronymic}</td>--%>
            </tr>
        </c:forEach>
    </table>
</c:if>

<h2>Patient List</h2>

<%--<c:if test="${!empty listPatients}">--%>
    <table class="tg">
        <tr>
            <th width="80">ID</th>
            <th width="120">ФИО</th>
                <%--<th width="120">Patronymic</th>--%>
        </tr>
        <c:forEach items="${listPatients}" var="patient">
            <tr>
                <td>${patient.patient_id}</td>
                <td>${patient.surname}</td>
            </tr>
        </c:forEach>
    </table>
<%--</c:if>--%>
</body>
</html>