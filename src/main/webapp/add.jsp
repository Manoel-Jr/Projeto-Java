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
        <!-- /agenda-acme/cadastro -->
        <form action="" method="post">
          <input type="text" name="nome" id="nome" placeholder="Nome"/><br/>
          <br/>
          <input type="email" name="email" id="email" placeholder="E-mail"/><br/>
          <br/>
          <input type="password" name="senha" id="senha" placeholder="Password"/><br/>
          <br/>
          <input type="password" name="confsenha" id="confsenha" placeholder="Confirmar Password"/><br/>
		  <div class="form-group">
		  <br>
			<button type="submit" class="btn btn-primary" onclick="adicionar()">Confirmar</button>
		  </div>
          <br/>
        </form>
        <script type="text/javascript">

        function adicionar(){

        	var nome = document.querySelector('#nome');
            var email = document.querySelector('#email');
            var senha = document.querySelector('#senha');
            var confsenha = document.querySelector('#confsenha');

            const limpar(){

                nome.value = "";
                email.value = "";
                senha.value = "";
                confsenha = "";
            }

            let Users=[]

            const mostrarElementos =() =>{
            	 event.preventDefault();
                 var usuario = {
                    nome: nome.value,
                    email: email.value,
                    senha: senha.value,
                    confsenha: confsenha.value     
                 }
            }

            Users.push(usuario);
            console.log(usuario);
            localStorage.setItem('usuario',JSON.stringify(usuario));
            limpar();
        }
        </script>
	</div>
    <hr>
    <footer class="footer">
        <p align="center">&copy; 2020 Junior Healy</p> 
    </footer>
</div>
</body>
</html>