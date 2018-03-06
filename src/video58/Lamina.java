package video58;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Lamina extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		arg0.drawString("Estamos aprendiendo Swing", 100, 100);
	}
	
	
}
