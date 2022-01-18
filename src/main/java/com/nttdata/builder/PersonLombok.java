package com.nttdata.builder;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Value;

@Data
@Value
@Getter
@Builder(toBuilder = true)
/**
 * Clase PersonLombok
 * @author jramlope
 *
 */
public class PersonLombok {

	/** Atributo privado de tipo String **/
	private final String name;
	
	/** Atributo privado de tipo int **/
	private final int age;
	
}
