package video92;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LaminaCheck extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public LaminaCheck(){
		setLayout(new BorderLayout());
		
		Font miLetra=new Font("Serif", Font.PLAIN,24);
		texto=new JLabel("En un lugar de la mancha de cuyo nombre...");
		texto.setFont(miLetra);
		
		JPanel laminaTexto=new JPanel();
		laminaTexto.add(texto);
		
		add(laminaTexto,BorderLayout.CENTER);
		
		check1=new JCheckBox("Negrita");
		check1.addActionListener(new ManejaChecks());
		
		check2=new JCheckBox("Cursiva");
		check2.addActionListener(new ManejaChecks());
		
		JPanel laminaChecks=new JPanel();
		laminaChecks.add(check1);
		laminaChecks.add(check2);
		add(laminaChecks, BorderLayout.SOUTH);
	}
	
	
	//clase interna
	private class ManejaChecks implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int tipo=0;
			
			if(check1.isSelected()) 
				tipo+=Font.BOLD;
			
			if(check2.isSelected()) 
				tipo+=Font.ITALIC;
			
			texto.setFont(new Font("Serif", tipo, 24));
			/* de acerdo a la api la clas Font en el segundo parametro del
			 * constructor significa lo siguiente:
			 * - 0 :: normal
			 * - 1 :: negrita
			 * - 2 :: cursiva
			 * - 3 :: negrita y cursiva 
			 * 
			 * */
		}
		
	}
	
	private JLabel texto;
	private JCheckBox check1, check2;

}
