package video77;

import javax.swing.JFrame;

import test.Probador;

/**
 * @author wegt
 */
public class Ejecutar implements Probador {

	/**
	 * este metodo es como que fuera el public static main para este paquete
	 */
	@Override
	public void correr() {
		MarcoAccion marco=new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}
	
}
