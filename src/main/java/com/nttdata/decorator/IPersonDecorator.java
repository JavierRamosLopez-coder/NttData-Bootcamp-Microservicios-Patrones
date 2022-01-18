package com.nttdata.decorator;

/**
 * Interfaz IPersonDecorator
 * @author jramlope
 *
 */
public interface IPersonDecorator {

	/**
	 * Método que devuelve la edad
	 * @return
	 */
	public int getAge();
	
	/**
	 * Método que devuelve el nombre
	 * @return
	 */
	public String getName();
	
}
