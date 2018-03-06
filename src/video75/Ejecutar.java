package video75;

import test.Probador;

/**
 * @author wegt
 */
public class Ejecutar implements Probador {

	/**
	 * este metodo es como que fuera el public static main para este paquete
	 */
	@Override
	public void correr() {
		FocoVentana miv=new FocoVentana();
		miv.iniciar();
	}
	
}
