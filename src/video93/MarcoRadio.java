package video93;

import javax.swing.JFrame;

public class MarcoRadio extends JFrame{
	private static final long serialVersionUID = 1L;

	public MarcoRadio() {		
		setBounds(500,300, 500,300);
		
		LaminaRadio lamina=new LaminaRadio();
		add(lamina);
		
		setVisible(true);
	}

}
