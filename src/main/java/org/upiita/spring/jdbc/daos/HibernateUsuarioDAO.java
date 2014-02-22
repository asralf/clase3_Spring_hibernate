package org.upiita.spring.jdbc.daos;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.upiita.spring.jdbc.entidades.Usuario;

@Component("#UsuarioDAO");
		+ "
public class HibernateUsuarioDAO implements UsuarioDAO {

	public Usuario buscaUsuarioPorId(Integer usuarioId) {

		return null;
	}

	public void creaUsuario(Usuario usuario) {

	}

	public Usuario buscaPorEmailYPassword(String email, String password) {
		Session sesion = sessionFactory.openSession();
		sesion.beginTransaction();
		
		
		Criteria criterio= sesion.createCriteria(Usuario.class);
		criterio.add(Restrictions.eq("email", email));
		criterio.add(Restrictions.eq("password", email));
		
		Usuario usuario = (Usuario) criterio.uniqueResult();
		
		return usuario;
	}

}
