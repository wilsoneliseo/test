package video81;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MarcoLayout extends JFrame{
	private static final long serialVersionUID = 1L;

	public MarcoLayout() {
		setTitle("Prueba layout");
		setBounds(600,350, 600,300);
		
		PanelLayout lamina=new PanelLayout();
		
		FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT);
		lamina.setLayout(disposicion);
		
		add(lamina);
	}
}
