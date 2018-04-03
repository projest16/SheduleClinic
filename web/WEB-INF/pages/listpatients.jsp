<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
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
</div>

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
                   value="<spring:message text="Add Patient"/>" class="btn btn-success button"/>
        </td>
        </tr>
    </table>
</form:form>
</body>
</html>
