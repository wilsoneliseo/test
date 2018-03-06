package video77;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("unused")
public class PanelAccion extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public PanelAccion() {
		AccionColor accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/graficos/amarillo.png"), Color.YELLOW);
		AccionColor accionAzul=new AccionColor("Azul", new ImageIcon("src/graficos/azul.png"), Color.BLUE);
		AccionColor accionRojo=new AccionColor("Rojo", new ImageIcon("src/graficos/rojo.png"), Color.RED);
		
		/*JButton botonAmarillo=new JButton("Amarillo");
		JButton botonAzul=new JButton("Azul");
		JButton botonRojo=new JButton("Rojo");
		
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);*/
	}
	
}
