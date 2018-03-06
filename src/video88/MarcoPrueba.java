package video88;

import javax.swing.JFrame;

public class MarcoPrueba extends JFrame{
	private static final long serialVersionUID = 1L;

	
	MarcoPrueba(){
		setBounds(500,300,500,350);
		LaminaPrueba lamina=new LaminaPrueba();
		add(lamina);
		setVisible(true);
	}	
	
}
