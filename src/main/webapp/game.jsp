<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Game Page</title>
</head>
<body>
<h1>Шаг: ${sessionScope.step}</h1>
<h2>Привет, ${sessionScope.playerName}!</h2>
<c:choose>
    <c:when test="${sessionScope.step == 1}">
        <p>Вы стоите на перекрестке. Вы идете налево или направо?</p>
        <form action="game" method="post">
            <button type="submit" name="action" value="left">Left</button>
            <button type="submit" name="action" value="right">Right</button>
        </form>
    </c:when>
    <c:when test="${sessionScope.step == 2}">
        <p>Вы натыкаетесь на реку. Вы переплываете ее или строите плот?</p>
        <form action="game" method="post">
            <button type="submit" name="action" value="swim">Переплыть</button>
            <button type="submit" name="action" value="raft">Сделать плот</button>
        </form>
    </c:when>
    <c:otherwise>
        <p>Поздравляем, ${sessionScope.playerName}! Вы закончили игру.</p>
        <form action="restart" method="post">
            <button type="submit">Заново</button>
        </form>
    </c:otherwise>
</c:choose>
</body>
</html>
