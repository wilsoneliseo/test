package video89;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class LaminaPassword extends JPanel{
	private static final long serialVersionUID = 1L;

	public LaminaPassword() {
		setLayout(new BorderLayout());
		
		JPanel laminaSuperior=new JPanel();		
		laminaSuperior.setLayout(new GridLayout(2,2));
		add(laminaSuperior,BorderLayout.NORTH);		
		JLabel etiqueta1=new JLabel("Usuario");
		JLabel etiqueta2=new JLabel("Contraseña");
		JTextField usuario=new JTextField(15);
		contra=new JPasswordField(15);
		CompruebaPass miEvento=new CompruebaPass();
		contra.getDocument().addDocumentListener(miEvento);
		laminaSuperior.add(etiqueta1);
		laminaSuperior.add(usuario);
		laminaSuperior.add(etiqueta2);
		laminaSuperior.add(contra);
		
		JButton enviar=new JButton("Enviar");
		add(enviar,BorderLayout.SOUTH);
	}
	
	//clase interna
	private class CompruebaPass implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			char [] contrasena;
			contrasena=contra.getPassword();
			if(contrasena.length<8 || contrasena.length>12)
				contra.setBackground(Color.RED);
			else
				contra.setBackground(Color.WHITE);
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			char [] contrasena;
			contrasena=contra.getPassword();
			if(contrasena.length<8 || contrasena.length>12)
				contra.setBackground(Color.RED);
			else
				contra.setBackground(Color.WHITE);
		}
		
	}

	private JPasswordField contra;
}
