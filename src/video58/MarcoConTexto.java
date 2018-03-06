package video58;

import javax.swing.JFrame;

public class MarcoConTexto extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoConTexto() {
		setVisible(true);
		setSize(600,450);
		setLocation(400,200);
		setTitle("primer texto");
		
		Lamina mi_lamina=new Lamina();
		add(mi_lamina);
	}
}
