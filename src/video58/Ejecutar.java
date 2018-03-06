package video58;

import javax.swing.JFrame;

import test.Probador;

/**
 * Interfaces de usuario IV.
 * Escribiendo en el Frame.
 * El JFrame es como la mesa de un dibujante y el pliego en donde el dibu-
 * jante trabaja sería los paneles (o lámina) JPanel.
 * Video: https://www.youtube.com/watch?v=zWUMgcFbOlg&index=58&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk
 * @author wegt
 *
 */
public class Ejecutar implements Probador {

	/**
	 * este metodo es como que fuera el public static main para este paquete
	 */
	@Override
	public void correr() {
		MarcoConTexto mi_marco=new MarcoConTexto();
		mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
