package video73;

import javax.swing.JFrame;

public class MarcoRaton extends JFrame {

	private static final long serialVersionUID = 1L;

	public MarcoRaton() {		
		setVisible(true);
		setBounds(700,300,600,450);
		
		addMouseListener(new EventoDeRaton());
		addMouseMotionListener(new EventoDeRatonMovimiento());
	}
}