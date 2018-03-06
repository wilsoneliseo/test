package video55;

import javax.swing.JFrame;

import test.Probador;

/**
 * Interfaces de usuario I.
 * Los marcos son JFrames. Que heredan de Frame del paquete awt y que se
 * encuentra en javax.
 * Video: https://www.youtube.com/watch?v=7q2VBGIKeYc&index=55&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk
 * @author wegt
 *
 */
public class Ejecutar implements Probador {

	/**
	 * este metodo es como que fuera el public static main para este paquete
	 */
	@Override
	public void correr() {
		MiMarco marco1=new MiMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
