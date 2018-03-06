package video77;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;

//AbstractAction implementa 6 de 7 métodos de la interfaz Action. Por lo
//que solo necesitamos programar el método actionPerformed() de la interfaz
//Action cuando se hereda de AbstractAction, tal y como es el caso de esta 
//clase AccionColor
public class AccionColor extends AbstractAction{

	private static final long serialVersionUID = 1L;
	
	public AccionColor(String nombre, Icon icono, Color color_boton) {
		putValue(Action.NAME, nombre);
		putValue(Action.SMALL_ICON, icono);
		putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color "+ nombre);
		putValue("color_de_fondo", color_boton);//esta es la acción
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
