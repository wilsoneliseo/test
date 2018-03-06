package video73;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class EventoDeRaton extends MouseAdapter{

	/*
	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println("Coordenada X: "+e.getX()+ " Coordenada Y: "+e.getY()); // getY() y getX() para ver donde esta ubicado el ratón en determinado momento
//		System.out.println(e.getClickCount()); // getClickCount() para ver si se ha echo un click, doble click, triple click, etc.
	}
	*/
	
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) 
			System.out.println("Acabas de pulsar el botón izquierdo");
		else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK)
			System.out.println("Acabas de pulsar la rueda del ratón");
		else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK)
			System.out.println("Acabas de pulsar el botón derecho");		
	}
}
