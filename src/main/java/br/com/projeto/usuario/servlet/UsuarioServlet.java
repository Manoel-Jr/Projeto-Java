package br.com.projeto.usuario.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.modelo.usuario.Usuario;


@WebServlet(urlPatterns = {"/logar"})
public class UsuarioServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		if(email.equals("") && senha.equals("")) {
			resp.sendRedirect("login.jsp");
		}
		else
		   if(email.equals("junior@hotmail.com") && senha.equals("12345")){
			resp.sendRedirect("index.jsp");
		}
		
		*/
		
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		Usuario user = new Usuario();
		
		user.setEmail1(email);
		user.setSenha1(senha);
		
		if(user.getEmail1().equals("") && user.getSenha1().equals("")) {
			resp.getWriter().print("Preencha os Campos!");
		}
		else if(user.getEmail1().equals("junior@hotmail.com") && user.getSenha1().equals("12345")){
			resp.sendRedirect("index.jsp");
		}
		else if(user.getEmail1() != "junior@hotmail.com" && user.getSenha1()!= "") {
			resp.getWriter().print("E-mail "+ user.getEmail1() + "é Invalido!");
		}
		
	}
	
}
