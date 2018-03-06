package video91;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MarcoPruebaArea extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public MarcoPruebaArea(){
		setTitle("Probando área de texto");
		setBounds(500,300,500,350);
		setLayout(new BorderLayout());//concepto nuevo
		
		laminaBotones=new JPanel();

		botonInsertar=new JButton("Insertar");
		botonInsertar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 areaTexto.append("En un lugar de la mancha de cuyo nombre no quiero acordarme...");
			}			
		});		
		laminaBotones.add(botonInsertar);
		
		
		botonSaltoLinea=new JButton("Salto línea");
		botonSaltoLinea.addActionListener(new ActionListener() {//boton funciona como on-off
			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean saltar=!areaTexto.getLineWrap();//saber si areaTexto tiene saltos de linea
				areaTexto.setLineWrap(saltar);
				
				botonSaltoLinea.setText(saltar?"Quitar salto":"Salto línea");
			}			
		});
		laminaBotones.add(botonSaltoLinea);
		
  		add(laminaBotones, BorderLayout.SOUTH);
  		
		areaTexto=new JTextArea(8,20);
		laminaBarras=new JScrollPane(areaTexto);
		
		add(laminaBarras, BorderLayout.CENTER);
	}
	
	private JPanel laminaBotones;
	private JButton botonInsertar;
	private JButton botonSaltoLinea;
	private JTextArea areaTexto;
	private JScrollPane laminaBarras;
}
