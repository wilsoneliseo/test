package video59;

import javax.swing.JFrame;

public class PruebaDibujo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PruebaDibujo() {		
		setSize(400,400);		
		setTitle("Prueba de dibujo.");
		
		Lamina mi_lamina=new Lamina();
		add(mi_lamina);
	}
}
