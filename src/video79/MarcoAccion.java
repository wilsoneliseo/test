package video79;


import javax.swing.JFrame;

public class MarcoAccion extends JFrame {
	private static final long serialVersionUID = 1L;

	public MarcoAccion() {
		setTitle("Prueba acciones");
		setBounds(600,350, 600,300);
		
		PanelAccion lamina=new PanelAccion();
		add(lamina);
	}
}
