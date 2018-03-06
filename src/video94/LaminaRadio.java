package video94;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class LaminaRadio extends JPanel{
	private static final long serialVersionUID = 1L;

	public LaminaRadio(){
		setLayout(new BorderLayout());

		texto=new JLabel("En un lugar de la mancha de cuyo nombre...");
		texto.setFont(new Font("Serif",Font.PLAIN,12));
		add(texto,BorderLayout.CENTER);
		
		laminaBotones=new JPanel();
		miGrupo=new ButtonGroup();
		
		colocarBotones("Pequeño",false,10);
		colocarBotones("Mediano",true,12);
		colocarBotones("Grande",false,18);
		colocarBotones("Muy Grande",false,26);
				
		add(laminaBotones, BorderLayout.SOUTH);
	}
	
	public void colocarBotones(String nombre, boolean seleccionado, int tamanio) {
		JRadioButton boton=new JRadioButton(nombre, seleccionado);
		miGrupo.add(boton);
		laminaBotones.add(boton);
		
		ActionListener miEvento=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				texto.setFont(new Font("Serif",Font.PLAIN,tamanio));
			}
			
		};
		
		boton.addActionListener(miEvento);
	}
	
	private JLabel texto;
	private ButtonGroup miGrupo;
	private JPanel laminaBotones;
}

// ESTA ES OTRA FORMA, MENOS ELEGANTE,  DE HACERLO. DESCOMENTAR PARA PROBAR.
//public class LaminaRadio extends JPanel{
//	private static final long serialVersionUID = 1L;
//
//	public LaminaRadio(){
//		setLayout(new BorderLayout());
//		
//		texto=new JLabel("En un lugar de la mancha de cuyo nombre...");		
//		add(texto,BorderLayout.CENTER);
//		
//		ButtonGroup miGrupo=new ButtonGroup();
//		EventoRadio miEvento=new EventoRadio();
//		boton1=new JRadioButton("Pequeño",false);
//		boton1.addActionListener(miEvento);
//		boton2=new JRadioButton("Mediano",true);
//		boton2.addActionListener(miEvento);
//		boton3=new JRadioButton("Grande",false);
//		boton3.addActionListener(miEvento);
//		boton4=new JRadioButton("Muy Grande",false);
//		boton4.addActionListener(miEvento);
//		miGrupo.add(boton1);
//		miGrupo.add(boton2);
//		miGrupo.add(boton3);
//		miGrupo.add(boton4);
//		JPanel lamina=new JPanel();
//		lamina.add(boton1);
//		lamina.add(boton2);
//		lamina.add(boton3);
//		lamina.add(boton4);
//		
//		add(lamina,BorderLayout.SOUTH);
//		
//	}
//	
//	//clase interna
//	private class EventoRadio implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			if(e.getSource()==boton1)//getSource() devuelve el objeto que desencadenó el evento
//				texto.setFont(new Font("Serif", Font.PLAIN, 10));
//			else if(e.getSource()==boton2)
//				texto.setFont(new Font("Serif", Font.PLAIN, 12));
//			else if(e.getSource()==boton3)
//				texto.setFont(new Font("Serif", Font.PLAIN, 18));
//			else if(e.getSource()==boton4)
//				texto.setFont(new Font("Serif", Font.PLAIN, 24));
//		}
//		
//	}
//	
//	private JLabel texto;
//	private JRadioButton boton1, boton2, boton3, boton4;
//}
