package video57;

import javax.swing.JFrame;

import test.Probador;

/**
 * Interfaces de usuario III.
 * Colocando un Frame en el centro de la pantalla
 * Video: https://www.youtube.com/watch?v=zADgVrhtBDs&index=57&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk
 * @author wegt
 *
 */
public class Ejecutar implements Probador {

	/**
	 * este metodo es como que fuera el public static main para este paquete
	 */
	@Override
	public void correr() {
		MarcoCentrado marco1=new MarcoCentrado();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
