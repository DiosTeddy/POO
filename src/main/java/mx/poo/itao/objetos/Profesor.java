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

public class Profesor extends Persona {
	private String numEm;
	
	public void mostrarProfesor() {
		System.out.println("Numero Empleado:"+ numEm );
	}
	

}
