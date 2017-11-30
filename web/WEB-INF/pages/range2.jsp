<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: d.tarasov
  Date: 29.09.2017
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../../resources/css/style.css">
    <link rel="stylesheet" href="../../resources/fc/fullcalendar.css">
    <link rel="stylesheet" href="../../resources/air-datepicker/datepicker.css">
    <link rel="stylesheet" href="../../resources/fc/fullcalendar.print.css" media="print">
</head>
<body>

<h1>${choosedDoctorId}</h1>

<%--<form:form id="formAddEvent1" action="/shedule" method="post" modelAttribute="chooseDoctorId">--%>
    <%--<p><label for="doctor">Доктор:</label>--%>
    <%--</p>--%>

    <%--<form:select id="doctor_choose" path="doctor_id" items="${listDoctors}" itemLabel="surname" itemValue="doctor_id"/>--%>
    <%--</p>--%>

    <%--<td colspan="2">--%>
        <%--<input type="submit" onclick="eventChooseDoctor()"--%>
               <%--value="<spring:message text="Сменить доктора"/>" class="ui-button"/>--%>
    <%--</td>--%>
<%--</form:form>--%>

<script src="../../resources/fc/lib/jquery.min.js"></script>
<script src="../../resources/jquery-ui/jquery-ui.min.js"></script>
<script src="../../resources/fc/lib/moment.min.js"></script>
<script src="../../resources/fc/fullcalendar.js"></script>
<script src="../../resources/fc/locale/ru.js"></script>
<script src="../../resources/js/mainrange.js"></script>
<script src="../../resources/air-datepicker/datepicker.js"></script>
</body>
</html>
