package video56;

import javax.swing.JFrame;

import test.Probador;

/**
 * Interfaces de usuario II.
 * Colocando el Frame. Los métodos setLocation(x,y) y setBounds(x,y,ancho,largo)
 * son de la clase Component y por herencia tambien JFrame.
 * Video: https://www.youtube.com/watch?v=wk95G-XgWfc&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=56
 * @author wegt
 *
 */
public class Ejecutar implements Probador {

	/**
	 * este metodo es como que fuera el public static main para este paquete
	 */
	@Override
	public void correr() {
		MiMarco marco1=new MiMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
