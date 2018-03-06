package video69;

import javax.swing.JFrame;

public class MarcoVentana extends JFrame {

	private static final long serialVersionUID = 1L;

	public MarcoVentana() {		
		setVisible(true);
		
//		M_Ventana oyente_ventana=new M_Ventana();
//		addWindowListener(oyente_ventana);
		addWindowListener(new M_Ventana());
	}
}