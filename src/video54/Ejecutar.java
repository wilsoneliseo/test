package video54;

import javax.swing.JOptionPane;

import test.Probador;

/**
 * Clases internas locales. ¿Qué son?
 * - Es una clase dentro de un método.
 * - ¿Cuándo se utilizan este tipo de clases y por qué?
 * 	+ Son útiles cuando solo se va a utilizar (instanciar) la clase interna
 * 	UNA VEZ. El objetivo es simplificar aún más el código.
 * 	+ Su ámbito queda restringido al método donde son declaradas. ¿Ventajas?
 * 		* Están muy "encapsuladas". Ni siquiera la clase a la que pertenece
 * 		puede acceder a ella. Tan solo puede acceder a ella el método 
 * 		donde estan declaradas.
 * 		* El código resulta más simple.
 * Video: https://www.youtube.com/watch?v=dA5pIY4Na_0&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=54
 * @author wegt
 *
 */
public class Ejecutar implements Probador {

	/**
	 * este metodo es como que fuera el public static main para este paquete
	 */
	@Override
	public void correr() {
		Reloj miReloj=new Reloj();
		
		miReloj.enMarcha(3000,true);//si se le pone true suena.
		
		JOptionPane.showMessageDialog(null, "Pulsar Aceptar para terminar.");
		
		System.exit(0);
	}
	
}
