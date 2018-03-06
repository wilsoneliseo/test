package video98;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class LaminaSpinner extends JPanel{
	private static final long serialVersionUID = 1L;
	
	
	public LaminaSpinner() {
		//spinner de lista
		String lista[]= {"Enero","Febrero","Marzo","Abril"};		
		JSpinner control1=new JSpinner(new SpinnerListModel(lista));
		Dimension d=new Dimension(200,20);//para darle dimensión al controla
		control1.setPreferredSize(d);
		add(control1);
		
		
		//spinner de fecha
		JSpinner control2=new JSpinner(new SpinnerDateModel());
		add(control2);
		
		//spinner de lista de las fuentes del sistema
		String lista2[]= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		JSpinner control3=new JSpinner(new SpinnerListModel(lista2));
		Dimension d2=new Dimension(200,20);//para darle dimensión al controla
		control3.setPreferredSize(d2);
		add(control3);
		
		//spinner de numeros modificado
		JSpinner control4=new JSpinner(new SpinnerNumberModel(5,0,10,2));//comienza en el 5, valor minimo es 0, valor maximo es 10, y va de dos en dos
		Dimension d3=new Dimension(200,20);//para darle dimensión al controla
		control4.setPreferredSize(d3);
		add(control4);


	}

}
