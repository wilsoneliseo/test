package video83;

import javax.swing.JFrame;

public class MarcoCalculadora extends JFrame{
	private static final long serialVersionUID = 1L;
	
	
	public MarcoCalculadora() {
		setTitle("Calculadora");
		setBounds(500,300,450,300);
		
		LaminaCalculadora lamina=new LaminaCalculadora();
		add(lamina);
	}

}
