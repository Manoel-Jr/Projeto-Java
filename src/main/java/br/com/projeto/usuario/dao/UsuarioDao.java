package br.com.projeto.usuario.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;
import br.com.projeto.modelo.cadastro.usuario.CadastroUsuario;


public class UsuarioDao {

	private static UsuarioDao con;
	protected EntityManager entidade;
	
	
	public static UsuarioDao getConexao() {
		
		if(con == null) {
			con = new UsuarioDao();
		}
		
		return con;
	}
	
	private UsuarioDao() {
		entidade = getEntity();
	}

	private EntityManager getEntity() {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ACME");
		
		if(entidade == null) {
			entidade = factory.createEntityManager();
		}
		
		
		return entidade;
	}
	
	
	public CadastroUsuario getById(long id) {
		return entidade.find(CadastroUsuario.class, id);
	}
	
	
	
	public List
}
