package video80;

import javax.swing.JFrame;

public class MarcoPrincipal extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public MarcoPrincipal() {
		setTitle("Prueba varios");
		setBounds(300,100,300,200);

		LaminaPrincipal lamina=new LaminaPrincipal();
		add(lamina);
	}	
}

