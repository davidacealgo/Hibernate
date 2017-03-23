/**
 * 
 */
package com.udea.iw.dao;
import java.util.ArrayList;
import java.util.List;
import com.udea.iw.dto.Rol;
import com.udea.iw.exception.Exceptions;
/**
 * @author davida.acevedo
 * Versión 2.0
 */
public interface RolDao {
	//Entrega la lista completa de ciudades de la base de datos ordenada
	public List<Rol> obtener() throws Exceptions;
	//Lista de codigos
	public Rol obtener(Long codigo) throws Exceptions;
}
