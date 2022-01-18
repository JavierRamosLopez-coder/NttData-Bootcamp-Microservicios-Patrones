package com.nttdata.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.builder.PersonBuilder;
import com.nttdata.builder.PersonLombok;
import com.nttdata.chainofresponsability.Unit;
import com.nttdata.decorator.PersonDecorator;
import com.nttdata.entity.Person;
import com.nttdata.proxy.Proxy;
import com.nttdata.singleton.PersonSingelton;

@SpringBootApplication
/**
 * Clase main encargada de realizar la lógica de la aplicación
 * 
 * @author jramlope
 *
 */
public class Test implements CommandLineRunner {

	/**
	 * Método main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Uso del singelton
		System.out.println("<===== USO DEL PATRÓN SINGLETON =====>");
		PersonSingelton.getInstance().setName("Javier");
		PersonSingelton.getInstance().setAge(19);

		System.out.println("Nombre : " + PersonSingelton.getInstance().getName());
		System.out.println("Edad : " + PersonSingelton.getInstance().getAge());
		System.out.println("\n");

		// Uso del prototype
		System.out.println("<===== USO DEL PATRÓN PROTOTYPE =====>");
		Person person = new Person("Faustino", 65);
		System.out.println(person.getClone());
		System.out.println("\n");

		// Uso del builder
		System.out.println("<===== USO DEL PATRÓN BUILDER =====>");
		PersonBuilder personBuilder = PersonBuilder.builder().age(32).name("Alonso").build();
		System.out.println("Nombre : " + personBuilder.getName());
		System.out.println("Edad : " + personBuilder.getAge());
		System.out.println("\n");

		// Uso del decorator
		System.out.println("<===== USO DEL PATRÓN DECORATOR =====>");
		Person person1 = new Person();
		person1.setName("Javier");
		person1.setAge(19);

		PersonDecorator pd = new PersonDecorator(person1);

		System.out.println("El nombre modificado : " + pd.getAge());
		System.out.println("Edad modificada : " + pd.getName());
		System.out.println("\n");

		// Uso del proxy
		System.out.println("<===== USO DEL PROXY =====>");
		Proxy proxy = new Proxy(person1);
		proxy.operation();

		// Uso del chain responsability
		Unit teniente = new Unit();
		teniente.setName("Javier");
		Unit capitan = new Unit();
		capitan.setName("Alonso");
		Unit soldado = new Unit();
		soldado.setName("Francisco");
		teniente.setSubordinate(capitan);
		capitan.setSubordinate(soldado);
		teniente.executeCommand("GO");
		System.out.println("\n");

		// Uso del lombok
		System.out.println("<===== USO DE LOMBOK =====>");
		PersonLombok pl = PersonLombok.builder().age(19).name("Javier").build();

		System.out.println(pl.getName());

	}

}
