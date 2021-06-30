<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.Health" %>
    <%
    Health health = (Health) request.getAttribute("health");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>すっきりきり健康診断</title>
</head>
<body>
<h1>すっきり健康診断の結果</h1>
<p>
身長:<%= health.getHeight() %>
体重:<%= health.getWeight() %>
BMI:<%= health.getBmi() %>
体形:<%= health.getBodyType() %>
</p>
<a href = "/impressPractice/HealthCheck">戻る</a>

</body>
</html>