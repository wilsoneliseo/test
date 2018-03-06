package video88;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class LaminaPrueba extends JPanel{
	private static final long serialVersionUID = 1L;

	public LaminaPrueba() {
		JTextField miCampo=new JTextField(20);
		
		Document midoc=miCampo.getDocument();
		EscuchaTexto el_evento=new EscuchaTexto();
		midoc.addDocumentListener(el_evento);
		
		add(miCampo);
	}
	
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// este método se ejecuta cuando el texto de Document 
			// cambia alguna de sus propiedades: negrita, cursiva, etc.
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			System.out.println("Has insertado texto.");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			System.out.println("Has borrado texto.");			
		}
		
	}

}
