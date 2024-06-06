<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Text Quest Game</title>
</head>
<body>
<h1>Добро пожаловать в квест игру!</h1>
<form action="game" method="post">
    <label for="playerName">Ваше имя:</label>
    <input type="text" id="playerName" name="playerName" required>
    <button type="submit">Начать игру</button>
</form>
</body>
</html>
