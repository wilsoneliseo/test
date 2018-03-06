package video87;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LaminaTexto extends JPanel{
	private static final long serialVersionUID = 1L;

	public LaminaTexto() {
		setLayout(new BorderLayout());
		
		JPanel lamina2=new JPanel();
		lamina2.setLayout(new FlowLayout());
		
		resultado=new JLabel("", JLabel.CENTER);		
		
		JLabel texto1=new JLabel("Email: ");
		lamina2.add(texto1);
		
		campo1=new JTextField(20);
		lamina2.add(campo1);
		
		add(resultado,BorderLayout.CENTER);
		
		JButton boton=new JButton("Comprobar");
		DameTexto miEvento=new DameTexto();
		boton.addActionListener(miEvento);
		lamina2.add(boton);
		
		add(lamina2,BorderLayout.NORTH);
	}
	
	//Clase interna
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int correcto=0;
			String email=campo1.getText().trim();//trim() quita espacios en blanco en la cadena
			for(int i=0;i<email.length();i++)
				if(email.charAt(i)=='@')
					correcto++;
			
			if(correcto!=1)
				resultado.setText("Incorrecto");
			else
				resultado.setText("Correcto");
		}
		
	}
	
	private JTextField campo1;
	private JLabel resultado;
}
