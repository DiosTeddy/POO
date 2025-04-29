package mx.poo.itao;

import mx.poo.itao.objetos.Estudiante;

public class Main {

	public static void main(String[] args) {
		
		Estudiante e = new Estudiante();
		e.setCarrera("IA");
		e.setNombre("Fernando");
		e.saludar();
		e.estudiar();
	}

}
