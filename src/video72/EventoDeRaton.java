package video72;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


class EventoDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("Haz hecho click");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("Acabas de entrar");		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("Acabas de salir");		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("Acabas de presionar");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Acabas de levantar");
		
	}


}
