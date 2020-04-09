package br.com.projeto.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.HttpConstraintElement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class Filtro
 */

@WebFilter("logar")
public class Filtro implements Filter {

    /**
     * Default constructor. 
     */
    public Filtro() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		if(email.equals("") && senha.equals("")) {
			
			response.getWriter().print("Preencha os Campos!!");
			
		}else if(email != "junior1@hotmail.com" && senha != "12345"){
			
			response.getWriter().print(email + " não esta Registrado!");
			
		}else if(email.equals("junior1@hotmail.com") && senha.equals("12345")){
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			
			dispatcher.forward(request, response);
		}
		
		//HttpServletRequest req = (HttpServletRequest) request;
		//int aid = 
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
