package video99;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class LaminaSpinner extends JPanel{
	private static final long serialVersionUID = 1L;
	
	
	public LaminaSpinner() {
//		JSpinner control=new JSpinner(new MiModeloSpinner());
		JSpinner control=new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			private static final long serialVersionUID = 1L;

			public Object getNextValue() {
				return super.getPreviousValue();
			}

			public Object getPreviousValue() {
				return super.getNextValue();
			}
			
		});
		Dimension d=new Dimension(200,20);//para darle dimensión al controla
		control.setPreferredSize(d);
		add(control);

	}
	
	/* se deja de usar esta clase interna y se sustituye por la clase
	 * interna anónima en el constructor de la clase JSpinner
	 * 
	//clase interna
	private class MiModeloSpinner extends SpinnerNumberModel{
		private static final long serialVersionUID = 1L;

		public MiModeloSpinner() {
			super(5,0,10,1);
		}
		
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		
		public Object getPreviousValue() {
			return super.getNextValue();
		}

	}
	*
	*/

}
