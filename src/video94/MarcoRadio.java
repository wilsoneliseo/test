package video94;

import javax.swing.JFrame;

public class MarcoRadio extends JFrame{
	private static final long serialVersionUID = 1L;

	public MarcoRadio() {		
		setBounds(550,300, 500,350);
		
		LaminaRadio lamina=new LaminaRadio();
		add(lamina);
		setVisible(true);
	}

}
