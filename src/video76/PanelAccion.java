package video76;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelAccion extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public PanelAccion() {
		JButton botonAmarillo=new JButton("Amarillo");
		JButton botonAzul=new JButton("Azul");
		JButton botonRojo=new JButton("Rojo");
		
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);
	}
	
}
