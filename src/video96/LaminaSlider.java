package video96;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class LaminaSlider extends JPanel{
	private static final long serialVersionUID = 1L;
	
	
	public LaminaSlider() {
		JSlider control=new JSlider(0,100,50);
		control.setOrientation(SwingConstants.VERTICAL);
		
		//estableciendo marcas
		control.setMajorTickSpacing(50); //de cuanto en cuanto las marcas mayores
		control.setMinorTickSpacing(25); //de cuanto en cuanto las marcas menores
		control.setPaintTicks(true); //decirle que imprima las marcas mayores y menores
		
		//estableciendo numeros con fuente definida
		control.setFont(new Font("Utopia",Font.ITALIC,11));
		control.setPaintLabels(true);
		
		//estableciendo para que el punto no se quede en espacios intermedios, es decir, que las marcas tengan una especie de imán
		control.setSnapToTicks(true);
		
		add(control);
	}

}
