<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="model.User, model.Mutter, java.util.List" %>
    <% User loginUser = (User)  session.getAttribute("loginUser");
    List<Mutter> mutterList = (List<Mutter>) application.getAttribute("mutterList");
    String errorMsg = (String) request.getAttribute("errorMsg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dokotubu</title>
</head>
<body>
<h1>Login to docotsubu</h1>
<p>ようこそ<%= loginUser.getName() %>さん、ログイン中
<a href="/docoTsubu/Logout">ログアウト</a>
</p>
<p><a href="/docoTsubu/main">更新</a></p>
<form action="/docoTsubu/Main" method="post">
<input type="text" name="text">
<input type="submit" value="tweeet">
</form>
<% if (errorMsg != null) { %>
<p><%= errorMsg %></p>
<% } %>
<% for (Mutter mutter : mutterList) { %>
<p><%= mutter.getUserName()  %>:<%= mutter.getText() %></p>
<% }  %>

</body>
</html>