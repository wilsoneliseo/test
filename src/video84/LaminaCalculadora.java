package video84;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LaminaCalculadora extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public LaminaCalculadora() {
		principio=true;//
		setLayout(new BorderLayout());
		
		pantalla=new JButton("0");
		pantalla.setEnabled(false);		
		add(pantalla,BorderLayout.NORTH);
		
		//panel que va en el centro de LaminaCalculadora
		lamina2=new JPanel();
		lamina2.setLayout(new GridLayout(4,4));
		//ahora ir agregando los botones al GridLayout
		ActionListener insertar=new InsertarNumero();
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
//		ponerBoton("/");
		ponerBoton("4",insertar);
		ponerBoton("5",insertar);
		ponerBoton("6",insertar);
//		ponerBoton("*");
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
//		ponerBoton("-");
		ponerBoton("0",insertar);
		ponerBoton(".",insertar);
//		ponerBoton("=");
//		ponerBoton("+");
		
		add(lamina2,BorderLayout.CENTER);
		
	}
	
	private void ponerBoton(String rotulo, ActionListener oyente) {
		JButton boton=new JButton(rotulo);
		boton.addActionListener(oyente);
		lamina2.add(boton);
	}
	
	private class InsertarNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String entrada=e.getActionCommand();//obtiene el texto del botón pulsado
			if(principio) {
				pantalla.setText("");
				principio =false;
			}
			pantalla.setText(pantalla.getText()+entrada);
		}
		
	}
	
	private JPanel lamina2;
	private JButton pantalla;
	private boolean principio;//para conocer si es es el primer digito de la cifra
}
