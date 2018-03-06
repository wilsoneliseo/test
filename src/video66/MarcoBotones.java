package video66;

import javax.swing.JFrame;

public class MarcoBotones extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MarcoBotones() {		
		setTitle("Botones y eventos.");
		setBounds(700,300,500,300);
		
		LaminaBotones mi_lamina=new LaminaBotones();
		add(mi_lamina);
	}
}
