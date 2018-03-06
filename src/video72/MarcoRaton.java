package video72;

import javax.swing.JFrame;

public class MarcoRaton extends JFrame {

	private static final long serialVersionUID = 1L;

	public MarcoRaton() {		
		setVisible(true);
		setBounds(700,300,600,450);
		
		EventoDeRaton eventoRaton=new EventoDeRaton();
		addMouseListener(eventoRaton);
	}
}