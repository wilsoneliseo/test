package video80;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LaminaPrincipal extends JPanel{

	private static final long serialVersionUID = 1L;

	public LaminaPrincipal () {
		JButton botonNuevo=new JButton("Nuevo");
		add(botonNuevo);
		
		botonCerrar=new JButton("Cerrar Todo");
		add(botonCerrar);
		
		OyenteNuevo miOyente=new OyenteNuevo();
		botonNuevo.addActionListener(miOyente);
		
	}//fin constructor
	
	
	private class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			MarcoEmergente marco=new MarcoEmergente(botonCerrar);
			marco.setVisible(true);
		}
		
	}
	
	JButton botonCerrar;
}
