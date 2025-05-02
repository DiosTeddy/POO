package mx.poo.itao.objetos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante extends Persona{

	private String carrera;
	private Integer edad;
	private String direccion;
	private String genero;
	
	public void estudiar() {
		System.out.println("Estudiando " + carrera);
		
	}

}