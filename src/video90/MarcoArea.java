package video90;

import javax.swing.JFrame;

public class MarcoArea extends JFrame{
	private static final long serialVersionUID = 1L;

	MarcoArea(){
		setBounds(500,300,500,350);
		LaminaArea lamina=new LaminaArea();
		add(lamina);
		setVisible(true);
	}
}
