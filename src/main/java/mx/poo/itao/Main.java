package mx.poo.itao;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javax.swing.JFileChooser;

import mx.poo.itao.objetos.Estudiante;
import mx.poo.itao.objetos.Persona;
import mx.poo.itao.objetos.Profesor;


public class Main {

	public static void main(String[] args) {
		
		Estudiante e = new Estudiante();
		e.setNombre("Fernando");
		e.setCarrera("IA");
		e.saludar();
		e.estudiar();
		Profesor p = new Profesor ();
		p.setNombre("Vianca");
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
		
		/*Codigo para seleccionar archivo*/
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Selecciona un archivo para subir");
		Integer resultado = fileChooser.showOpenDialog(null);
		
		if (resultado == JFileChooser.APPROVE_OPTION) {
			File archivoSeleccionado = fileChooser.getSelectedFile();
			System.out.println("Archivo seleccionado: " + archivoSeleccionado.getAbsolutePath());
			
			String rutaDestino = "src/documentos";
			File carpetaDestino = new File(rutaDestino);
			
			 if (!carpetaDestino.exists()) {
	                carpetaDestino.mkdirs();
	            }
			 
			 File archivoDestino = new File(carpetaDestino, archivoSeleccionado.getName());
			 
			 try {
				 Files.copy(archivoSeleccionado.toPath(), archivoDestino.toPath(), StandardCopyOption.REPLACE_EXISTING);
	             System.out.println("Archivo guardado exitosamente en: " + archivoDestino.getAbsolutePath());
			 }catch(IOException ex) {
				 System.out.println("Error al copiar el archivo: " + ex.getMessage());
			 }
		}else {
            System.out.println("No se seleccionó ningún archivo.");
        }
	}

}
