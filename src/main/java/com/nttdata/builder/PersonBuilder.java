package com.nttdata.builder;

/**
 * Clase PersonBuilder
 * @author jramlope
 *
 */
public class PersonBuilder {

	/** Atributo privado de tipo String **/
	private String name;
	
	/** Atributo privado de tipo in **/
	private int age;
		
	/**
	 * Método constructor
	 * @param name
	 * @param age
	 */
	public PersonBuilder(String name, int age) {
		this.age = age;
		this.name = name;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonBuilder [name=" + name + ", age=" + age + "]";
	}
	
	/**
	 * Clase anidada PersonnBuilder
	 * @author jramlope
	 *
	 */
	public static class PersonnBuilder{
		
		/** Atributo privado de tipo String **/
		private String name;
		
		/** Atributo privado de tipo int **/
		private int age;
		
		/**
		 * Método constructor
		 * @param name
		 * @return
		 */
		public PersonnBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		/**
		 * Método constructor
		 * @param age
		 * @return
		 */
		public PersonnBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		/**
		 * Método build que devuelve un objeto de la clase PersonBuilder
		 * @return
		 */
		public PersonBuilder build() {
			return new PersonBuilder(this);
		}
		
	}
	/**
	 * Método estático de la clase PersonnBuilder
	 * @return
	 */
	public static PersonnBuilder builder() {
		return new PersonnBuilder();
	}
	
	/**
	 * Constructor privado
	 * @param personBuilder
	 */
	private PersonBuilder(PersonnBuilder personBuilder) {
		super();
		this.name = personBuilder.name;
		this.age = personBuilder.age;
	}
	
}
