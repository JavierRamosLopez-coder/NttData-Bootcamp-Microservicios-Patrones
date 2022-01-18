package com.nttdata.singleton;

import com.nttdata.entity.Person;

/**
 * Clase PersonSingelton
 * @author jramlope
 *
 */
public class PersonSingelton {

	/** Atributo estático de la clase Persona **/
	private static Person INSTANCE;
	
	/**
	 * Constructor privado
	 */
	private PersonSingelton() {
		
	}
	
	/**
	 * Método getInstance que devuelve un objeto de la clase Person
	 * @return
	 */
	public static Person getInstance() {

		// Establecemos condiciones
		if (INSTANCE == null) {
			INSTANCE = new Person();
		}

		return INSTANCE;

	}
	
}
