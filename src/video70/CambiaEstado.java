package video70;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;


/**
 * @author wegt
 *
 */
class CambiaEstado implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent e) {
//		System.out.println("La ventana ha cambiado de estado");
//		System.out.println(e.getNewState());
		
		if(e.getNewState()==Frame.MAXIMIZED_BOTH)// MAXIMIZED_BOTH indica que esta a pantalla completa
			System.out.println("La ventana está a ventana completa.");
		else if (e.getNewState()==Frame.NORMAL)
			System.out.println("La ventana está normal");
		else if (e.getNewState()==Frame.ICONIFIED)
			System.out.println("La ventana está minimizada");
	}

}
