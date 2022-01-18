package com.nttdata.chainofresponsability;

/**
 * Clase Unit
 * 
 * @author jramlope
 *
 */
public class Unit {

	/** Atributo privado de tipo String **/
	private String name;

	/** Atributo privado de tipo Unit **/
	private Unit subordinate;

	/**
	 * Método constructor vacío
	 */
	public Unit() {

	}

	/**
	 * Método constructor
	 * 
	 * @param n
	 * @param s
	 */
	public Unit(String n, Unit s) {
		this.name = n;
		this.subordinate = s;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the subordinate
	 */
	public Unit getSubordinate() {
		return subordinate;
	}

	/**
	 * @param subordinate the subordinate to set
	 */
	public void setSubordinate(Unit subordinate) {
		this.subordinate = subordinate;
	}

	/**
	 * Método para ejecutar el comando
	 * 
	 * @param command
	 */
	public void executeCommand(String command) {
		if (subordinate == null) {
			System.out.println("Último rango");
		} else {
			System.out.println(name + " no realizará la tarea, ya que hay un puesto inferior");
			subordinate.executeCommand(command);
		}
	}

}
