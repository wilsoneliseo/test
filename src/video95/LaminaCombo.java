package video95;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LaminaCombo extends JPanel{
	private static final long serialVersionUID = 1L;
	
	
	public LaminaCombo() {
		setLayout(new BorderLayout());
		
		texto=new JLabel("En un lugar de la mancha de cuyo nombre...");
		texto.setFont(new Font("Serif",Font.PLAIN,18));
		add(texto,BorderLayout.CENTER);
		
		JPanel laminaNorte=new JPanel();
		miCombo=new JComboBox<String>();
		miCombo.setEditable(true);
		miCombo.addItem("Utopia");
		miCombo.addItem("Courier");
		EventoCombo miEvento=new EventoCombo();
		miCombo.addActionListener(miEvento);
		laminaNorte.add(miCombo);
		
		add(laminaNorte,BorderLayout.NORTH);
	}
	
	private class EventoCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			texto.setFont(new Font((String)miCombo.getSelectedItem(), Font.PLAIN,18));
		}
		
	}
	
	private JLabel texto;
	private JComboBox<String> miCombo;

}
