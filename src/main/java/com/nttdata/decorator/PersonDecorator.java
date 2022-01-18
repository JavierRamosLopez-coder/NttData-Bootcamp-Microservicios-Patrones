package com.nttdata.decorator;

import com.nttdata.entity.Person;

/**
 * Clase PersonDecorator que implementa la interfaz IPersonDecorator
 * 
 * @author jramlope
 *
 */
public class PersonDecorator implements IPersonDecorator {

	/** Creación de un objeto de la clase Person **/
	private Person persona;

	/**
	 * Método constructor
	 * 
	 * @param persona
	 */
	public PersonDecorator(Person persona) {
		this.persona = persona;
	}

	@Override
	public int getAge() {
		return this.persona.getAge() + 6;
	}

	@Override
	public String getName() {
		return this.persona.getName() + " Ramos";
	}

}
