package video69;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * Clase oyente
 * @author wegt
 *
 */
class M_Ventana extends WindowAdapter{

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified. Ventana minimizada");
	}

}
