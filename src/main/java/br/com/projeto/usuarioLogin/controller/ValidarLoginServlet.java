package br.com.projeto.usuarioLogin.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.modelo.cadastro.usuario.CadastroUsuario;



@WebServlet(urlPatterns = {"/logar"})
public class ValidarLoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		CadastroUsuario user = new CadastroUsuario();
		
		user.setEmail(email);
		user.setSenha(senha);
		
		if(user.getEmail().equals("") && user.getSenha().equals("")) {
			resp.getWriter().print("Preencha os Campos!");
		}
		else if(user.getEmail().equals("junior@hotmail.com") && user.getSenha().equals("12345")){
			resp.sendRedirect("index.jsp");
		}
		else if(user.getEmail() != "junior@hotmail.com" && user.getSenha()!= "") {
			 resp.getWriter().print("E-mail "+ user.getEmail() + "é Invalido!");
		}
	
	 
	}
	
}
