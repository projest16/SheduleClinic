<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">Стоматологическая клиника</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="/shedule">Расписание</a></li>
            <%--<li><a href="/test2">Расписание</a></li>--%>
            <li><a href="/admin">Панель администратора</a></li>
        </ul>
        <jsp:include page="menu_login.jsp"/>
    </div>
</nav>
