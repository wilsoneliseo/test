package video86;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LaminaTexto extends JPanel{
	private static final long serialVersionUID = 1L;

	public LaminaTexto() {
		JLabel texto1=new JLabel("Email: ");
		add(texto1);
		
		campo1=new JTextField(20);
		add(campo1);
		
		JButton boton=new JButton("Comprobar");
		DameTexto miEvento=new DameTexto();
		boton.addActionListener(miEvento);
		add(boton);
	}
	
	//Clase interna
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(campo1.getText());
		}
		
	}
	
	private JTextField campo1;
}
