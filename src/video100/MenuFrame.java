package video100;

import javax.swing.JFrame;

public class MenuFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	
	public MenuFrame() {		
		setBounds(550,300,550,400);
		
		MenuLamina lamina=new MenuLamina();
		add(lamina);
		setVisible(true);
	}

}
