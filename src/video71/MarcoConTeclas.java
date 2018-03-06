package video71;

import javax.swing.JFrame;

public class MarcoConTeclas extends JFrame {

	private static final long serialVersionUID = 1L;

	public MarcoConTeclas() {		
		setVisible(true);
		setBounds(700,300,600,450);
		
		EventoDeTeclado tecla=new EventoDeTeclado();
		addKeyListener(tecla);		
	}
}