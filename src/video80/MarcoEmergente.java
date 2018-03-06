package video80;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MarcoEmergente extends JFrame{
	private static final long serialVersionUID = 1L;

	public MarcoEmergente(JButton botonDePrincipal) {
		contador++;
		setTitle("Ventana "+contador);
		setBounds(40*contador, 40*contador, 300,150);
		
		CierraTodos oyenteCerrar=new CierraTodos();
		botonDePrincipal.addActionListener(oyenteCerrar);
	}//fin constructor
	
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			dispose(); //libera todos los recursos de las ventanas y sus componenetes, marcandolo como invisible.			
		}
		
		
	}
	
	private static int contador=0;
}

