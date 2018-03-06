package video82;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelLayout extends JPanel{
	private static final long serialVersionUID = 1L;

	public PanelLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));
		
	}
}
