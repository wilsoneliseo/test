package video68;

import javax.swing.JFrame;

public class MarcoVentana extends JFrame {

	private static final long serialVersionUID = 1L;

	public MarcoVentana() {		
//		setTitle("Respondiendo...");
//		setBounds(300,300,500,350);
		setVisible(true);
		
		M_Ventana oyente_ventana=new M_Ventana();
		addWindowListener(oyente_ventana);		
	}
}