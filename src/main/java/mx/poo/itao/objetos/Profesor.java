package mx.poo.itao.objetos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

public class Profesor extends Persona {
	private String numEm;
	
	public void mostrarProfesor() {
		System.out.println("Numero Empleado"+numEm );
	}
	

}
