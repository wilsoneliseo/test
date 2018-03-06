package video51;

import java.util.Scanner;

import test.Probador;

public final class Ejecutar implements Probador{

	public Ejecutar() {
		super();
	}
	
	/**
	 * prueba del enum Talla.
	 */
	@Override
	public void correr() {
		Scanner entrada=new Scanner(System.in);

		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");

		String entrada_datos=entrada.next().toUpperCase();

		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);		

		System.out.println("Talla="+la_talla);

		System.out.println("Abreviatura="+la_talla.dameAbreviatura());

		entrada.close();
	}	
}
