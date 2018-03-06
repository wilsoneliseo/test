package video97;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class LaminaSlider extends JPanel{
	private static final long serialVersionUID = 1L;
	
	
	public LaminaSlider() {
		setLayout(new BorderLayout());
		
		rotulo=new JLabel("En un lugar de la mancha de cuyo nombre...");
		add(rotulo,BorderLayout.CENTER);
		
		control=new JSlider(8,50,12);		
		//pintar marcas
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);		
		//pintar etiquetas de numeros
		control.setFont(new Font("Utopia",Font.ITALIC,10));
		control.setPaintLabels(true);
		control.addChangeListener(new EventoSlider());

		JPanel laminaSlider=new JPanel();
		laminaSlider.add(control);
		add(laminaSlider, BorderLayout.NORTH);			
		
	}
	
	//clase interna
	private class EventoSlider  implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent arg0) {
//			System.out.println("Estas manipulando el deslizante "+control.getValue());
			rotulo.setFont(new Font("Utopia",Font.PLAIN,control.getValue()));
		}
		
	}
	
	private JLabel rotulo;
	private JSlider control;
}
