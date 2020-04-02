package br.com.projeto.cadastro.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.projeto.modelo.cadastro.usuario.CadastroUsuario;


@WebServlet(urlPatterns = {"/cadastro"})
public class Cadastro extends HttpServlet{
	
	//Usuario cadu = new Usuario();
	//List<CadastroUsuario> lista = new ArrayList<>();
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/*
		HttpSession session = req.getSession();
		List<CadastroUsuario> usuarios = (ArrayList<CadastroUsuario>) session.getAttribute("usuarios");

		req.setAttribute("usuarios", usuarios); 
		
		
		RequestDispatcher rd = req.getRequestDispatcher("add.jsp");
		//req.setAttribute("lista", lista);
		rd.forward(req, resp);
		*/
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		CadastroUsuario cadu = new CadastroUsuario();
		
		
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		String confSenha = req.getParameter("confsenha");
		
		cadu.setNome(nome);
		cadu.setEmail(email);
		cadu.setSenha(senha);
		cadu.setConfSenha(confSenha);
		

		/*
		System.out.println("boa tarde!");
		
		
        HttpSession session = req.getSession();
		
        List<Usuario> usuarios;
        
		if(session.getAttribute("usuarios") == null){
			usuarios = new ArrayList<Usuario>();
		}else{
			usuarios = (List<Usuario>) session.getAttribute("usuarios");
		}
		
		usuarios.add(cadu);
		session.setAttribute("usuarios", usuarios);

		req.setAttribute("listaUsuarios", usuarios);
		
		req.setAttribute("msg", "Cadastrado com Sucesso!");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("list.jsp");
		dispatcher.forward(req, resp);
		
		
		/*
		RequestDispatcher rd = req.getRequestDispatcher("list.jsp");
		req.setAttribute("lista", lista);
		req.setAttribute("msg", "Cadastrado com Sucesso!");
		rd.forward(req, resp);
		*/
		
	}

}
