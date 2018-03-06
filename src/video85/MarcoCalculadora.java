package video85;

import javax.swing.JFrame;

public class MarcoCalculadora extends JFrame{
	private static final long serialVersionUID = 1L;
	
	
	public MarcoCalculadora() {
		setTitle("Calculadora");
		setBounds(500,300,450,300);
		
		LaminaCalculadora lamina=new LaminaCalculadora();
		add(lamina);
		//pack(); //le decimos que el tamaño que tiene que tener el contenedor es el que tienen los componentes en su interior, es decir se tienen que adaptar al tamaño por defecto de lo que hay en su interior
	}

}
