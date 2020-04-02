<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lista de Ususarios</title>
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
<div class="container">
    <h1>Lista de Usuários</h1>
    <hr>
    <div>

        <a class="btn btn-default" href="/agenda-acme/cadastro">Novo Usuário</a>
    </div>
    <hr>

    <div class="${msg == null ? 'panel-default' : 'panel-success'}">

        <div class="panel-heading">
            <span>${msg == null ? '' : msg}</span>
        </div>
          
          <table class="table table-striped">
		<thead class="thead-dark">
			<tr>
				<td>Nome</td>
				<td>Email</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listaUsuarios}" var="usuario">
				<tr>
					<td>${usuario.nome}</td>
					<td>${usuario.email}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
        
    </div>
    <hr>
    <footer class="footer">
        <p>&copy; 2020 Junior Healy</p>
    </footer>
</div>
</body>
</html>