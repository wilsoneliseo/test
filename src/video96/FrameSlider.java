package video96;

import javax.swing.JFrame;

public class FrameSlider extends JFrame{
	private static final long serialVersionUID = 1L;
	
	
	public FrameSlider() {
		
		setBounds(550,400,550,350);
		LaminaSlider lamina=new LaminaSlider();
		add(lamina);
		setVisible(true);
	}

}
