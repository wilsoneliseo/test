package video79;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class PanelAccion extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public PanelAccion() {
		AccionColor accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/graficos/amarillo.png"), Color.YELLOW);
		AccionColor accionAzul=new AccionColor("Azul", new ImageIcon("src/graficos/azul.png"), Color.BLUE);
		AccionColor accionRojo=new AccionColor("Rojo", new ImageIcon("src/graficos/rojo.png"), Color.RED);
		
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);//paso 1. Indica que el objeto del foco se encuenta dentro del JPanel

		KeyStroke teclaAmarillo=KeyStroke.getKeyStroke("ctrl A");//paso 2
		mapaEntrada.put(teclaAmarillo, "fondo_amarillo");//paso 3. El objeto es "fondo_amarillo"
		
		KeyStroke teclaAzul=KeyStroke.getKeyStroke("ctrl B");//paso 2
		mapaEntrada.put(teclaAzul, "fondo_azul");//paso 3. El objeto es "fondo_azul"
		
		KeyStroke teclaRojo=KeyStroke.getKeyStroke("ctrl R");//paso 2
		mapaEntrada.put(teclaRojo, "fondo_rojo");//paso 3. El objeto es "fondo_rojo"
		
		
		ActionMap mapaAccion=getActionMap();//paso 4. asignar el objeto a la accion
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_azul", accionAzul);
		mapaAccion.put("fondo_rojo", accionRojo);
	}

	//AbstractAction implementa 6 de 7 métodos de la interfaz Action. Por lo
	//que solo necesitamos programar el método actionPerformed() de la interfaz
	//Action cuando se hereda de AbstractAction, tal y como es el caso de esta 
	//clase AccionColor
	private class AccionColor extends AbstractAction{

		private static final long serialVersionUID = 1L;

		public AccionColor(String nombre, Icon icono, Color color_boton) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icono);
			putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color "+ nombre);
			putValue("color_de_fondo", color_boton);//esta es la acción
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Color c= (Color) getValue("color_de_fondo");
			setBackground(c);
		}

	}//fin de clase AccionColor

	
}
