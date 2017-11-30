<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: d.tarasov
  Date: 30.11.2017
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form id="formAddEvent1" action="/range2" method="post" modelAttribute="doctor">


    <form:select id="doctor_choose" path="doctor_id" items="${listDoctors}" itemLabel="surname" itemValue="doctor_id"/>
    </p>

    <td colspan="2">
        <input type="submit" onclick="eventChooseDoctor()"
               value="<spring:message text="Сменить доктора"/>" class="ui-button"/>
    </td>
</form:form>

</body>
</html>
