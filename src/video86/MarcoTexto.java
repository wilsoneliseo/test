package video86;

import javax.swing.JFrame;

public class MarcoTexto extends JFrame{
	private static final long serialVersionUID = 1L;

	public MarcoTexto() {
		setBounds(600,300, 600,350);
		
		LaminaTexto lamina=new LaminaTexto();
		add(lamina);
		setVisible(true);
	}
}
