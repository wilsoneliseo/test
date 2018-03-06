package borrador;

import javax.swing.JFrame;

public class Marco extends JFrame{
	private static final long serialVersionUID = 1L;
	
	
	public Marco() {		
		setBounds(550,300,550,400);
		
		Lamina lamina=new Lamina();
		add(lamina);
		setVisible(true);
	}

}
