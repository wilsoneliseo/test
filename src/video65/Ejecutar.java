package video65;

import javax.swing.JFrame;

import test.Probador;

public class Ejecutar implements Probador {

	/**
	 * este metodo es como que fuera el public static main para este paquete
	 */
	@Override
	public void correr() {
		MarcoBotones mi_marco=new MarcoBotones();
		
		mi_marco.setVisible(true);
		
		mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
