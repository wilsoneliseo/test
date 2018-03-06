package video53;

import javax.swing.JOptionPane;

import test.Probador;

/**
 * ¿Que son las clases internas?. También conocidas como Inner class, como
 * su nombre lo indica, una clase interna es una clase dentro de otra. La
 * clases internas son necesarias por:
 * 1. Para acceder a los campos privados de una clase desde otra clase
 * 2. Para ocultar una clase de otras perteneciente al mismo paquete
 * 3. Para crear clases "anonimas internas" muy útiles para gestionar eventos y retrollamadas.
 * 4. Cuando solo una clase debe acceder a los campos de ejemplar de otra clase.
 * Video: https://www.youtube.com/watch?v=rQS5P63GTU8&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=53
 * @author wegt
 *
 */
public class Ejecutar implements Probador {

	/**
	 * este metodo es como que fuera el public static main para este paquete
	 */
	@Override
	public void correr() {
		Reloj miReloj=new Reloj(3000,true);//si se le pone true suena.
		
		miReloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Pulsar Aceptar para terminar.");
		
		System.exit(0);
	}
	
}
