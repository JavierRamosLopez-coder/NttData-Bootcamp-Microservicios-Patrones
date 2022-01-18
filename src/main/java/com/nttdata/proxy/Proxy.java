package com.nttdata.proxy;

import com.nttdata.entity.Person;

/**
 * Clase Proxy que implementa la interfaz IPersonProxyInterface
 * @author jramlope
 *
 */
public class Proxy implements IPersonProxyInterface{

	/** Atributo privado de la clase Person **/
	private Person person;

	/**
	 * Método constructor
	 * @param p
	 */
	public Proxy(Person p) {
		this.person = p;
	}
	
	@Override
	public void operation() {
		antes();
		this.person.operation();
		despues();
	}
	
	/**
	 * Método que muestra una cadena de caracteres
	 */
	public void antes() {
		System.out.println("Antes");
	}
	
	/**
	 * Método que muestra una cadena de caracteres
	 */
	public void despues() {
		System.out.println("Después");
	}
	
}
