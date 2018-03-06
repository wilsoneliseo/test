package video92;

import javax.swing.JFrame;

public class MarcoCheck extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public MarcoCheck() {
		setBounds(550,300,550,350);		
		
		LaminaCheck lamina=new LaminaCheck();
		add(lamina);
		
		setVisible(true);
	}
	
}
