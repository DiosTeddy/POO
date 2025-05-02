package mx.poo.itao;
import mx.poo.itao.objetos.Profesor;
import mx.poo.itao.objetos.Estudiante;
import mx.poo.itao.objetos.Persona;


public class Main {

	public static void main(String[] args) {
		
		Estudiante e = new Estudiante();
		e.setNombre("Fernando");
		e.setCarrera("IA");
		e.saludar();
		e.estudiar();
		Profesor p = new Profesor ();
		p.setNombre("Vianca");
		p.setnumEm("22110033");
		p.saludar();
		p.mostrarProfesor();
		System.out.println("---------------");
		Persona p1 = new Persona ();
		p1.setNombre("Victor");
		p1.saludar();
		Estudiante e1 = new Estudiante();
		e1.setNombre("Fernando");
		e1.setCarrera("IA");
		e1.saludar();
		e1.estudiar();
		
	}

}
