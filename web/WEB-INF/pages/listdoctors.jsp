<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>listDoctor</title>

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
    <link href="/resources/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<h1>Doctor List</h1>

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


<h1>Add a Doctor</h1>
<c:url var="addAction" value="/listdoctors/add"/>

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
        </tr>
    </table>
</form:form>

</body>
</html>
