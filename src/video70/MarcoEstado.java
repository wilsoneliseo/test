package video70;

import javax.swing.JFrame;

public class MarcoEstado extends JFrame {

	private static final long serialVersionUID = 1L;

	public MarcoEstado() {		
		setVisible(true);
		setBounds(300,300,500,350);
		
		CambiaEstado nuevo_estado=new CambiaEstado();
		addWindowStateListener(nuevo_estado);
	}
}