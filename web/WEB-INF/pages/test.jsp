<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <link rel="stylesheet" href="../../resources/bootstrap-3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../resources/fc/fullcalendar.css">
    <link rel="stylesheet" href="../../resources/fc/fullcalendar.print.css" media="print">
    <link rel="stylesheet" href="../../resources/css/style.css">

</head>
<body>
<%--<div id="calendar"></div>--%>
<div id="dialog">
    <form>
        <div class="form-group">
            <label for="title">Название события</label>
            <input type="text" class="form-control" id="title" placeholder="Название события">
        </div>
        <button type="submit" class="btn btn-success">Добавить событие</button>
    </form>
</div>

<script src="../../resources/fc/lib/jquery.min.js"></script>
<script src="../../resources/jquery-ui/jquery-ui.min.js"></script>
<script src="../../resources/fc/lib/moment.min.js"></script>
<script src="../../resources/fc/fullcalendar.js"></script>
<script src="../../resources/fc/locale/ru.js"></script>
<script src="../../resources/js/main.js"></script>

</body>
</html>