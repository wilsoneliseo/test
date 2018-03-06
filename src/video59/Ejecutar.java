package video59;

import javax.swing.JFrame;

import test.Probador;

/**
 * Interfaces de usuario V.
 * Dibujando en el Frame I.
 * Video: https://www.youtube.com/watch?v=nNu6ideyyGs&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=59
 * @author wegt
 *
 */
public class Ejecutar implements Probador {

	/**
	 * este metodo es como que fuera el public static main para este paquete
	 */
	@Override
	public void correr() {
		PruebaDibujo mi_marco=new PruebaDibujo();
		
		mi_marco.setVisible(true);
		
		mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
