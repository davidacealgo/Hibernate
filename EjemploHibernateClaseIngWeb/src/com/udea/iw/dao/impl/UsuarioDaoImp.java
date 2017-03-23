package com.udea.iw.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.HibernateException;

import org.hibernate.Criteria;
import com.udea.iw.dao.DataSource;
import com.udea.iw.dto.Usuario;
import com.udea.iw.dto.Usuario;
import com.udea.iw.exception.Exceptions;

public class UsuarioDaoImp {
	
	//Metodo para obtener todos los usuarios
	public List<Usuario> obtener() throws Exceptions{ 
		List<Usuario> lista = new ArrayList<Usuario>();
		Session session = null;
		try{
			session = DataSource.getInstance().getSession();
			Criteria criteria = session.createCriteria(Usuario.class);
			lista = criteria.list();
		}catch(Exceptions e){
			throw new Exceptions("Error consultando Usuarios",e);
		}
		return lista;
	} 
	
	public Usuario obtener(String login) throws Exceptions{
		
		Usuario Usuario = new Usuario();
		Session session = null;
		try{
			session = DataSource.getInstance().getSession();
			Usuario = (Usuario)session.load(Usuario.class, login);	//load retorna una excepcion si no lo encuentra
			//Usuario = (Usuario)session.get(Usuario.class, login);   //get retorna null si no lo encuentra
		}catch(HibernateException e){
			throw new Exceptions("Error consultando Usuario",e);
		}
		return Usuario;
}
	
		
 }
