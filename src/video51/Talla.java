package video51;


enum Talla
{				
	MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

	private Talla(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String dameAbreviatura() {
		return abreviatura;
	}

	private String abreviatura;					
}