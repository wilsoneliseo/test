package video54;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class Reloj {

//	public Reloj(int intervalo, boolean sonido) {
//		this.intervalo=intervalo;
//		this.sonido=sonido;
//	}
//	
	public void enMarcha(int intervalo, boolean sonido) {//min 8:26
		/**
		 * Esta es la clase INTERNA LOCAL. Ojo que la clase interna local 
		 * no debe llevar modificador de acceso antes de "class". Otra 
		 * ventaja de esto es que DameLaHora2 puede haceder tanto a campos
		 * de la clase Reloj como de las variables locales declaradas 
		 * dentro de enMarcha().
		 */
		class DameLaHora2 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Date ahora=new Date();

				System.out.println("Te pongo la hora cada cierto tiempo: "+ahora);

				if(sonido)//variable sonido esta definida fuera de esta clase. Esta en la clase Reloj.
					Toolkit.getDefaultToolkit().beep();
			}

		}
		
		ActionListener oyente=new DameLaHora2();
		Timer mi_temporizador=new Timer(intervalo, oyente);
		mi_temporizador.start();

	}	
	
}
