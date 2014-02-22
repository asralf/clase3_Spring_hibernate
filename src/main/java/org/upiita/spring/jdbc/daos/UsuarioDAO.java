package org.upiita.spring.jdbc.daos;

import org.upiita.spring.jdbc.entidades.Usuario;

public interface UsuarioDAO {

	public Usuario buscaUsuarioPorId(Integer usuarioId);

	public void creaUsuario(Usuario usuario);
	
	//este codigo no esta completo
	
	public Usuario buscaPorEmailYPassword(String email, String password);

}
