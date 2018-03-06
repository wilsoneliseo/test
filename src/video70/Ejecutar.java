package video70;

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
		MarcoEstado mi_marco=new MarcoEstado();
		mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
