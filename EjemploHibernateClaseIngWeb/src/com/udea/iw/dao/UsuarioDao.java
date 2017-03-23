/**
 * 
 */
package com.udea.iw.dao;
import java.util.ArrayList;
import java.util.List;
import com.udea.iw.dto.Usuario;
import com.udea.iw.exception.Exceptions;
/**
 * @author davida.acevedo
 * Versión 2.0
 */
public interface UsuarioDao {
	//Entrega la lista completa de ciudades de la base de datos ordenada
	public List<Usuario> obtener() throws Exceptions;
	//Lista de codigos
	public Usuario obtener(String login) throws Exceptions;
}
