<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cadastro de Usuário</title>
    <spring:url var="css" value="/static/css/bootstrap.css"/>
    <link type="text/css" rel="stylesheet" href="${css }"/>
    <link rel="stylesheet" href="css/bootstrap-theme.css">
    <link rel="stylesheet" href="css/bootstrap-theme.css.map.css">
    <link rel="stylesheet" href="css/bootstrap-theme.min.css.css">
    <link rel="stylesheet" href="css/bootstrap-theme.min.css.map.css">
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/bootstrap.css.map">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap.min.css.map.css">
</head>
<body>
<div class="container" align="center">
    <h1>Cadastro de Usuários</h1>

        <form action="/agenda-acme/cadastro" method="post">
          <input type="text" name="nome" id="nome" placeholder="Nome"/><br/>
          <br/>
          <input type="email" name="email" id="email" placeholder="E-mail"/><br/>
          <br/>
          <input type="password" name="senha" id="senha" placeholder="Password"/><br/>
          <br/>
          <input type="password" name="confsenha" id="confsenha" placeholder="Confirmar Password"/><br/>
          <br/>
		<div class="form-group">
			<button type="submit" class="btn btn-primary">Confirmar</button>
		</div>
        </form>
	</div>
    <hr>
    <footer class="footer">
        <p>&copy; 2020 Junior Healy</p> 
    </footer>
</div>
</body>
</html>