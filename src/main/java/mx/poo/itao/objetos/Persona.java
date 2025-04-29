package mx.poo.itao.objetos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private double estatura;
	
	public void saludar() {
		System.out.println("Hola, soy " + nombre + apellido);
	}
		public void edad() {
			System.out.println("Tengo" + edad);
		}
			public void Medida() {
				System.out.println("Mido" + estatura);
			
	}
		

}
