package video67;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LaminaBotones extends JPanel{

	private static final long serialVersionUID = 1L;

	JButton botonAzul=new JButton("Azul");
	JButton botonAmarillo=new JButton("Amarillo");
	JButton botonRojo=new JButton("Rojo");
	
	public LaminaBotones() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		ColorFondo amarillo=new ColorFondo(Color.YELLOW);
		ColorFondo azul=new ColorFondo(Color.BLUE);
		ColorFondo rojo=new ColorFondo(Color.RED);

		botonAzul.addActionListener(azul);
		botonRojo.addActionListener(rojo);
		botonAmarillo.addActionListener(amarillo);
	}
	
	//clase interna
	private class ColorFondo implements ActionListener{

	public ColorFondo(Color c) {
		colorDeFondo=c;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(colorDeFondo);
	}
	
	private Color colorDeFondo;

}


}
