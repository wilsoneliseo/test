package video93;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class LaminaRadio extends JPanel{
	private static final long serialVersionUID = 1L;

	public LaminaRadio(){

		ButtonGroup miGrupo1=new ButtonGroup();		
		JRadioButton boton1=new JRadioButton("Azul",false);
		JRadioButton boton2=new JRadioButton("Rojo",true);
		JRadioButton boton3=new JRadioButton("Verde",false);		
		miGrupo1.add(boton1);
		miGrupo1.add(boton2);
		miGrupo1.add(boton3);				
		add(boton1);//se agregan los radios buttons de uno en uno. No se puede agregar el grupo de una sola vez
		add(boton2);
		add(boton3);
		

		ButtonGroup miGrupo2=new ButtonGroup();
		JRadioButton boton4=new JRadioButton("Masculino",false);
		JRadioButton boton5=new JRadioButton("Femenino",true);
		miGrupo2.add(boton4);
		miGrupo2.add(boton5);
		add(boton4);//se agregan los radios buttons de uno en uno. No se puede agregar el grupo de una sola vez
		add(boton5);

	}
}
