<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>


    <link rel="stylesheet" href="../../resources/css/style.css">
    <link rel="stylesheet" href="../../resources/fc/fullcalendar.css">
    <link rel="stylesheet" href="../../resources/fc/fullcalendar.print.css" media="print">
    <%--<link rel="stylesheet" href="../../resources/bootstrap-3.3.7/css/bootstrap.min.css">--%>

</head>
<body>
<button id="add_event_button">Добавить событие</button>
<div id="dialog-form" title="Событие">
    <form id="formAddEvent">
        <p><label for="event_type">Тип события</label>
            <input type="text" id="event_type" name="event_type" value=""></p>
        <p><label for="event_start">Начало</label>
            <input type="text" name="event_start" id="event_start"/></p>
        <p><label for="event_end">Конец</label>
            <input type="text" name="event_end" id="event_end"/></p>
        <input type="hidden" name="event_id" id="event_id" value="">
    </form>
</div>
<div id="calendar"></div>

<script src="../../resources/fc/lib/jquery.min.js"></script>
<script src="../../resources/jquery-ui/jquery-ui.min.js"></script>
<script src="../../resources/fc/lib/moment.min.js"></script>
<script src="../../resources/fc/fullcalendar.js"></script>
<script src="../../resources/fc/locale/ru.js"></script>
<script src="../../resources/js/main.js"></script>

</body>
</html>