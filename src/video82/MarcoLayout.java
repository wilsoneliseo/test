package video82;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MarcoLayout extends JFrame{
	private static final long serialVersionUID = 1L;

	public MarcoLayout() {
		setTitle("Prueba layout");
		setBounds(600,350, 600,300);
		
		PanelLayout lamina=new PanelLayout();
		PanelLayout2 lamina2=new PanelLayout2();
				
		add(lamina,BorderLayout.NORTH);
		add(lamina2,BorderLayout.SOUTH);
	}
}
