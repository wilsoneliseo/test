package video59;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Lamina extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param g permite dibujar muchas cosas. La clase Graphics esta presente
	 * desde las primeras versiones de Java, por lo que ya es bastante antigua
	 * con el tiempo se ha ido quedando corta. Corta en el sentido de que los
	 * dibujos que se obtienen hay un monton de cosas que no permite: modificar
	 * el grosor del trazo, rotar figuras geometricas, etc. Debido ha esto se
	 * agrego a Java, la biblioteca Java 2D. Con Java 2D se puede hacer las 
	 * cosas que no puede la clase Graphics, pero es mas complejo, ha diferencia
	 * de Graphics que es mas sencillo. (min 14:04)
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
//		g.drawRect(50, 50, 200, 200);//cuadrado

		g.drawLine(100, 100, 300, 200);//linea
		
		g.drawArc(50, 100, 100, 200, 120, 150);//arco
		
	}
	
	
}
