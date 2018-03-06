package video52;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import test.Probador;

public class Ejecutar implements Probador {

	/**
	 * prueba la clase Timer de java.swing que funciona como tipo hilo. Al constructor de timer se 
	 * le pasa el tiempo en segundos y un oyente, por eso se definio la clase DameLaHora que es una clase que
	 * implementa la interfaz ActionListener.
	 * 
	 * Video: https://www.youtube.com/watch?v=0fifCsOYbXw&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=52
	 */
	@Override
	public void correr() {
		DameLaHora oyente=new DameLaHora();
		
		Timer mi_temporizador=new Timer(5000, oyente);//5000 milisegundos
		
		mi_temporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener.");
//		System.exit(0);
	}
	
}
