package video66;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LaminaBotones extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;

	JButton botonAzul=new JButton("Azul");
	JButton botonAmarillo=new JButton("Amarillo");
	JButton botonRojo=new JButton("Rojo");
	
	public LaminaBotones() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);

		botonAzul.addActionListener(this);// Primer factor. Decirle: al hacer click.
		//Segundo factor. Objeto fuente: el que desencadena este evento es botonAzul
		//Tercer factor. El oyente, el objeto que recibe el evento. En este caso es this, es decir el Jpanel LaminaBotones.
		
		botonRojo.addActionListener(this);
		botonAmarillo.addActionListener(this);
		
		//tres fuentes que desencadenan un evento: botonAzul, botonAmarillo, botonRojo
		//un unico oyente (this)
		//un unico tipo evento (click)
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object botonPulsado=e.getSource();//getSource() da el origen, quien hizo click
		if(botonPulsado==botonAzul)
			setBackground(Color.BLUE);
		else if (botonPulsado==botonAmarillo)
			setBackground(Color.YELLOW);
		else
			setBackground(Color.RED);
	}
	
}
