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
<div id="dialog-form" title="Событие">
    <form:form id="formAddEvent" action="/admin/addShedule" method="post" modelAttribute="shedule">
        <p><label for="text_dateStart">Дата начала</label>
            <input id="text_dateStart" name="start" type="datetime-local">
        <p><label for="text_dateEnd">Дата окончания</label>
            <input id="text_dateEnd" name="end" type="datetime-local">
        <td colspan="2">
            <input type="submit"
                   value="<spring:message text="Add Shedule"/>"/>
        </td>
        </table>
    </form:form>
</div>

<script src="../../resources/fc/lib/jquery.min.js"></script>
<script src="../../resources/jquery-ui/jquery-ui.min.js"></script>
<script src="../../resources/fc/lib/moment.min.js"></script>
<script src="../../resources/fc/fullcalendar.js"></script>
<script src="../../resources/fc/locale/ru.js"></script>
<script src="../../resources/js/mainrange.js"></script>
<script src="../../resources/air-datepicker/datepicker.js"></script>
</body>
</html>
