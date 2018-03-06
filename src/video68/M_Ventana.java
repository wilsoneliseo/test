package video68;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class M_Ventana implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated. Ventana activada");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed. La ventana ha sido cerrada");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing. Cerrando ventana");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated. Ventana desactivada");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified. Ventana restaurada");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified. Ventana minimizada");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened. Ventana abierta");
	}
	
}
