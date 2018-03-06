package video52;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

class DameLaHora implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Date ahora=new Date();
		System.out.println("Te pongo la hora cada cierto tiempo: "+ahora);
	}

}
