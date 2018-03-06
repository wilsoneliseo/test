package video71;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


class EventoDeTeclado implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
//		int codigo=e.getKeyCode();
//		System.out.println(codigo);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char letra=e.getKeyChar();
		System.out.println(letra);
	}


}
