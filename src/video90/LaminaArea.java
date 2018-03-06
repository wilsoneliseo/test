package video90;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class LaminaArea extends JPanel{
	private static final long serialVersionUID = 1L;

	public LaminaArea(){
		miArea=new JTextArea(8,20);//fila y columna
		JScrollPane laminaBarras=new JScrollPane(miArea);
		//miArea.setLineWrap(true);//true significa que si haga saltos de linea
		add(laminaBarras);
		
		JButton boton=new JButton("Dale");
		boton.addActionListener(new GestionaArea());
		add(boton);
	}
	
	//Clase interna
	private class GestionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println(miArea.getText());
		}
		
	}
	private JTextArea miArea;
}
