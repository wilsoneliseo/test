package video57;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MarcoCentrado extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MarcoCentrado() {
		Toolkit miPantalla=Toolkit.getDefaultToolkit();//obteniendo sistema nativo de ventanas. min 5:00
		Dimension tamanoPantalla=miPantalla.getScreenSize();//obteniendo el tamaño de pantalla 	1900x1080 p. ej.
		
		int alturaPantalla=tamanoPantalla.height;
		int anchoPantalla=tamanoPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setTitle("Marco centado");
		Image miIcono=miPantalla.getImage("src/graficos/linux.png");
		setIconImage(miIcono);
	}
	
}
