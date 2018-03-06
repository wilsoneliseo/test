package video69;

import javax.swing.JFrame;

import test.Probador;

/**
 * Eventos V. Eventos de ventana II
 * @author wegt
 */
public class Ejecutar implements Probador {

	/**
	 * este metodo es como que fuera el public static main para este paquete
	 */
	@Override
	public void correr() {
		MarcoVentana mi_marco=new MarcoVentana();
		mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana mi_marco2=new MarcoVentana();
		mi_marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //DISPOSE_ON_CLOSE hace que cuando se cierra la ventana no termine el programa. 
		
		mi_marco.setTitle("Ventana 1");
		mi_marco2.setTitle("Ventana 2");
		
		mi_marco.setBounds(300,300,500,350);
		mi_marco2.setBounds(900,300,500,350);
		
	}
	
}
