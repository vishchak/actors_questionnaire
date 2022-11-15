<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>vishchak.denis</title>
</head>
<body>
<p><b>Best actor ever </b></p>
<form action="/question" method="post">
    <p><select name="answer_one">
        <option value="Brad Pitt">Brad Pitt</option>
        <option value="Christoph Waltz">Christoph Waltz</option>
        <option value="Tom Holland">Tom Holland</option>
    </select></p>

    <p><b>What about actress?</b></p>
    <p><select name="answer_two">
        <option value="Penelope Cruz">Penelope Cruz</option>
        <option value="Anna Gun">Anna Gun</option>
        <option value="Natalie Portman">Natalie Portman</option>
    </select></p>
    <input type="submit"/>
</form>
</body>
</html>