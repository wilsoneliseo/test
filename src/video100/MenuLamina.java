package video100;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuLamina extends JPanel{
	private static final long serialVersionUID = 1L;
	
	
	public MenuLamina() {
		JMenuBar miBarra=new JMenuBar();
		
		
		JMenu archivo=new JMenu("Archivo");
		JMenuItem guardar=new JMenuItem("Guardar");
		archivo.add(guardar);
		JMenuItem guardarComo=new JMenuItem("Guardar como");
		archivo.add(guardarComo);		
		miBarra.add(archivo);
		
		
		JMenu edicion=new JMenu("Edicion");
		JMenuItem cortar=new JMenuItem("Cortar");
		edicion.add(cortar);
		JMenuItem copiar=new JMenuItem("Copiar");
		edicion.add(copiar);
		JMenuItem pegar=new JMenuItem("Pegar");
		edicion.add(pegar);
		edicion.addSeparator();//agrega un separador
		miBarra.add(edicion);
		
		
		JMenu herramientas=new JMenu("Herramientas");
		JMenuItem generales=new JMenuItem("Generales");
		herramientas.add(generales);
		miBarra.add(herramientas);

		//a continuacion es para crear un "Submenu" en la pestaña edicion llamada "Opciones" (min 18:40)
		JMenu opciones=new JMenu("Opciones");
		JMenuItem opcion1=new JMenuItem("Opcion 1");
		opciones.add(opcion1);
		JMenuItem opcion2=new JMenuItem("Opcion 2");
		opciones.add(opcion2);
		edicion.add(opciones);//un menu que agrega otro menu, este es la clave para crearlo
		
		
		add(miBarra);
	}

}
