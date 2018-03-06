package video98;

import javax.swing.JFrame;

public class FrameSpinner extends JFrame{
	private static final long serialVersionUID = 1L;
	
	
	public FrameSpinner() {		
		setBounds(550,300,550,400);
		
		LaminaSpinner lamina=new LaminaSpinner();
		add(lamina);
		setVisible(true);
	}

}
