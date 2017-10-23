<!--<!DOCTYPE html>-->
<!--<html lang="en">-->
<!--<head>-->

<!--<title>1</title>-->
<!--</head>-->
<!--<body>-->

<!--</body>-->
<!--</html>-->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header.jsp"/>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../../resources/css/style.css">
    <link rel="stylesheet" href="../../resources/jquery-ui/jquery-ui.min.css">
    <link rel="stylesheet" href="../../resources/fc/fullcalendar.css">
    <link rel="stylesheet" href="../../resources/air-datepicker/datepicker.css">
    <link rel="stylesheet" href="../../resources/fc/fullcalendar.print.css" media="print">
    <link href="../../resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div id="calendar"></div>

<div id="dialog-form" title="Событие">
    <%--<form id="formAddEvent">--%>
    <form:form id="formAddEvent" action="/admin/addShedule" method="post" modelAttribute="shedule">
            <input id="text_title" name="title" type="hidden">
        <p><label for="dateStart">Дата начала</label>
            <input id="dateStart" type="text">

            <p><label for="eventStart_hours">Время начала</label>
            <p><select id="eventStart_hours">
            <option>08</option>
            <option>09</option>
            <option>10</option>
            <option>11</option>
            <option>12</option>
            <option>13</option>
            <option>14</option>
            <option>15</option>
            <option>16</option>
            <option>17</option>
            <option>18</option>
            <option>19</option>
            </select>

            <select id="eventStart_minutes">
            <option>00</option>
            <option>05</option>
            <option>10</option>
            <option>15</option>
            <option>20</option>
            <option>25</option>
            <option>30</option>
            <option>35</option>
            <option>40</option>
            <option>45</option>
            <option>50</option>
            <option>55</option>
            </select></p>


        <p><label for="dateEnd">Дата конца</label>
            <input id="dateEnd" type="text">

        <p><label for="eventEnd_hours">Время окончания</label>
        <p><select id="eventEnd_hours">
            <option>08</option>
            <option>09</option>
            <option>10</option>
            <option>11</option>
            <option>12</option>
            <option>13</option>
            <option>14</option>
            <option>15</option>
            <option>16</option>
            <option>17</option>
            <option>18</option>
            <option>19</option>
        </select>

            <select id="eventEnd_minutes">
                <option>00</option>
                <option>05</option>
                <option>10</option>
                <option>15</option>
                <option>20</option>
                <option>25</option>
                <option>30</option>
                <option>35</option>
                <option>40</option>
                <option>45</option>
                <option>50</option>
                <option>55</option>
            </select></p>

        <input id="hide_dateStart" name="start" type="hidden">
        <input id="hide_dateEnd" name="end" type="hidden">

        <p><label for="doctor">Доктор:</label></p>
            <p><form:select id="doctor" path="doctor.doctor_id" items="${listDoctors}" itemLabel="surname" itemValue="doctor_id"/>
            </p>

        <p><label for="patient">Пациент:</label></p>
        <p><form:select id="patient" path="patient.patient_id" items="${listPatients}" itemLabel="surname" itemValue="patient_id"/>
        </p>

        <td colspan="2">
            <input type="submit" onclick="event3()"
                   value="<spring:message text="Add Shedule"/>" class="ui-button"/>
            <%--class="btn btn-success button"--%>
        </td>
        <%--</form>--%>
    </form:form>
</div>





<script src="../../resources/js/jquery-3.2.1.min.js"></script>
<script src="../../resources/jquery-ui/jquery-ui.min.js"></script>
<script src="../../resources/fc/lib/moment.min.js"></script>
<script src="../../resources/fc/locale/ru.js"></script>
<script src="../../resources/js/main.js"></script>
<script src="../../resources/air-datepicker/datepicker.js"></script>
<script src="../../resources/fc/fullcalendar.js"></script>
</body>
</html>


<%--<div id="dialog-form" title="Событие">--%>
<%--&lt;%&ndash;<form id="formAddEvent">&ndash;%&gt;--%>
<%--<form:form id="formAddEvent" action="/admin/addShedule" method="post" modelAttribute="shedule">--%>
<%--<p><label for="text_title">Дата начала</label>--%>
<%--<textarea id="text_title"></textarea>--%>
<%--<p><label for="text_dateStart">Дата начала</label>--%>
<%--<textarea id="text_dateStart"></textarea>--%>
<%--<p><label for="eventStart_hour">Время начала</label>--%>
<%--<p><select id="eventStart_hour" name="eventStart_hour">--%>
<%--<option>08</option>--%>
<%--<option>09</option>--%>
<%--<option>10</option>--%>
<%--<option>11</option>--%>
<%--<option>12</option>--%>
<%--<option>13</option>--%>
<%--<option>14</option>--%>
<%--<option>15</option>--%>
<%--<option>16</option>--%>
<%--<option>17</option>--%>
<%--<option>18</option>--%>
<%--<option>19</option>--%>
<%--</select>--%>
<%--<select id="eventStart_minute" name="eventStart_minute">--%>
<%--<option>00</option>--%>
<%--<option>05</option>--%>
<%--<option>10</option>--%>
<%--<option>15</option>--%>
<%--<option>20</option>--%>
<%--<option>25</option>--%>
<%--<option>30</option>--%>
<%--<option>35</option>--%>
<%--<option>40</option>--%>
<%--<option>45</option>--%>
<%--<option>50</option>--%>
<%--<option>55</option>--%>
<%--</select></p>--%>
<%--<p><label for="text_dateEnd">Дата окончания</label>--%>
<%--<textarea id="text_dateEnd"></textarea>--%>
<%--<p><label for="eventEnd_hour">Время окончания</label>--%>
<%--<p><select id="eventEnd_hour" name="eventEnd_hour">--%>
<%--<option>08</option>--%>
<%--<option>09</option>--%>
<%--<option>10</option>--%>
<%--<option>11</option>--%>
<%--<option>12</option>--%>
<%--<option>13</option>--%>
<%--<option>14</option>--%>
<%--<option>15</option>--%>
<%--<option>16</option>--%>
<%--<option>17</option>--%>
<%--<option>18</option>--%>
<%--<option>19</option>--%>
<%--</select>--%>
<%--<select id="eventEnd_minute" name="eventEnd_minute">--%>
<%--<option>00</option>--%>
<%--<option>05</option>--%>
<%--<option>10</option>--%>
<%--<option>15</option>--%>
<%--<option>20</option>--%>
<%--<option>25</option>--%>
<%--<option>30</option>--%>
<%--<option>35</option>--%>
<%--<option>40</option>--%>
<%--<option>45</option>--%>
<%--<option>50</option>--%>
<%--<option>55</option>--%>
<%--</select></p>--%>
<%--<p><input type="button" onclick="event1()" value="Получить результат!"/></p>--%>
<%--<textarea id="text_test"></textarea>--%>

<%--<tr>--%>
<%--<td>Доктор:</td>--%>
<%--<td><form:select id="doctor" path="doctor.doctor_id" items="${listDoctors}" itemLabel="surname" itemValue="doctor_id"/>--%>
<%--</td>--%>
<%--</tr>--%>
<%--&lt;%&ndash;</form>&ndash;%&gt;--%>
<%--</form:form>--%>
<%--</div>--%>