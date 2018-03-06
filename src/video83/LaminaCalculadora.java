package video83;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LaminaCalculadora extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public LaminaCalculadora() {
		setLayout(new BorderLayout());
		
		JButton pantalla=new JButton("0");
		pantalla.setEnabled(false);		
		add(pantalla,BorderLayout.NORTH);
		
		//panel que va en el centro de LaminaCalculadora
		lamina2=new JPanel();
		lamina2.setLayout(new GridLayout(4,4));
		//ahora ir agregando los botones al GridLayout
		ponerBoton("7");
		ponerBoton("8");
		ponerBoton("9");
		ponerBoton("/");
		ponerBoton("4");
		ponerBoton("5");
		ponerBoton("6");
		ponerBoton("*");
		ponerBoton("1");
		ponerBoton("2");
		ponerBoton("3");
		ponerBoton("+");
		ponerBoton("0");
		ponerBoton(".");
		ponerBoton("=");
		ponerBoton("-");
		
		add(lamina2,BorderLayout.CENTER);
		
	}
	
	private void ponerBoton(String rotulo) {
		JButton boton=new JButton(rotulo);		
		lamina2.add(boton);
	}
	
	private JPanel lamina2;	
}
