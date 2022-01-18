package com.nttdata.entity;

import com.nttdata.decorator.IPersonDecorator;
import com.nttdata.property.IPersonProperty;
import com.nttdata.proxy.IPersonProxyInterface;

public class Person implements IPersonDecorator, IPersonProxyInterface, IPersonProperty {

	/** Atributo privado de tipo String **/
	private String name;

	/** Atributo privado de tipo Int **/
	private int age;

	/**
	 * Constructor
	 */
	public Person() {

	}

	public Person(String n, int a) {
		this.name = n;
		this.age = a;
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
	public void operation() {
		System.out.println("Hola");
	}

	@Override
	public Person getClone() {

		Person p = new Person(name, age);

		return p;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
