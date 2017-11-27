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
<jsp:include page="header.jsp"/>
<p>
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

        .block1{
            width: 700px;
            background: #fc0;
            padding: 5px;
            border: solid 1px black;
            float: left;
            position: relative;
            top: 40px;
            left: 70px;
        }

        .block2{
            width: 500px;
            background: #fc0;
            padding: 5px;
            border: solid 1px black;
            float: left;
            position: relative;
            top: 40px;
            left: 70px;
        }
    </style>
    <!-- Bootstrap -->
    <link href="../../resources/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="grid.css" rel="stylesheet">
</head>
<p>
<h3>Панель администратора</h3>
<p><a href="/listdoctors">Список докторов</a></p>
<p><a href="/listpatients">Список пациентов</a></p>
<p><a href="/listshedules">Список записей</a></p>
</body>
</html>
