package video53;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class Reloj {

	public Reloj(int intervalo, boolean sonido) {
		this.intervalo=intervalo;
		this.sonido=sonido;
	}
	
	public void enMarcha() {
		ActionListener oyente=new DameLaHora2();
		Timer mi_temporizador=new Timer(intervalo, oyente);
		mi_temporizador.start();
	}
	
	private int intervalo;
	private boolean sonido;
	
	/**
	 * Esta es la clase INTERNA. Ojo con el modificador "private", es posible
	 * porque es una clase interna.
	 */
	private class DameLaHora2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Date ahora=new Date();

			System.out.println("Te pongo la hora cada cierto tiempo: "+ahora);

			if(sonido)//variable sonido esta definida fuera de esta clase. Esta en la clase Reloj.
				Toolkit.getDefaultToolkit().beep();//min 25:15			
		}
		
	}
}
