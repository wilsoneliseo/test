package video74;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class LaminaFoco extends JPanel{

	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);//invalidar el posicionamiento por defecto
		
		cuadro1=new JTextField();
		cuadro2=new JTextField();
		
		cuadro1.setBounds(120,10,150,20);
		cuadro2.setBounds(120,50,150,20);
		
		add(cuadro1);
		add(cuadro2);
		
		LanzaFocos elFoco=new LanzaFocos();
		cuadro1.addFocusListener(elFoco);
	}
	
	private class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void focusLost(FocusEvent arg0) {
			System.out.println("He perdido el foco");
		}

	}
	
	JTextField cuadro1;
	JTextField cuadro2;
}