package com.udea.iw.dao;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

import com.udea.iw.dao.impl.UsuarioDaoImp;
import com.udea.iw.dto.Usuario;
import com.udea.iw.exception.Exceptions;

public class UsuarioDaoTest {

	@Test
	public void testObtener() {
		//Test para el metodo obtener()
				UsuarioDaoImp usuario = null;
				String login = "elver";
				Usuario user = null;
				
				try {
					usuario = new UsuarioDaoImp(); //crea el objeto
					user = usuario.obtener(login);
					assertTrue(user!=null);  //Envia solo si la lista tiene datos
					System.out.println(user.getRol());
				}catch(Exceptions e) {
					e.printStackTrace(); //Envia el error 
					fail(e.getMessage());  //Mensaje de error
				}
			}

}
