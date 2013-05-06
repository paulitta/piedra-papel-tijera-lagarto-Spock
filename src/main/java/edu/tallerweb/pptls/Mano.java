package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	Integer valorForma;
	String nombreForma;
	String jugada[][] = new String[5][5];

	/**
	 * Toda Mano debe crearse con una forma dada, que sera la que determine su
	 * condicion en el juego.
	 * 
	 * @param forma
	 *            , la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		valorForma = forma.getValor();
		nombreForma = forma.name();
	}

	/**
	 * Evaluara el resultado de la partida segun las reglas del juego.
	 * 
	 * @param otra
	 *            , la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		inicializaMatriz();

		if (this.valorForma == otra.valorForma) {
			System.out.println(this.nombreForma + " "+ Resultado.EMPATA + " con " + otra.nombreForma);
			return Resultado.EMPATA;
		} else {

			if (" ".equals(jugada[this.valorForma][otra.valorForma])) {
				System.out.println(this.nombreForma + " "+ Resultado.PIERDE
				                    + " con " + otra.nombreForma);
				return Resultado.PIERDE;
			} else {
				System.out.println(this.nombreForma + " "+ jugada[this.valorForma][otra.valorForma]
				                    + " a " + otra.nombreForma + "  " + Resultado.GANA + " " + this.nombreForma);
				return Resultado.GANA;
			}
		}
	}

	/**
	 * Este metodo se utiliza para inicializar una matriz.
	 * 
	 */
	public void inicializaMatriz() {

		for (Integer i = 0; i < 5; i++) {
			for (Integer j = 0; j < 5; j++) {

				jugada[i][j] = " ";
			}
		}
		jugada[0][3] = "aplasta";
		jugada[0][4] = "aplasta";
		jugada[1][4] = "destroza";
		jugada[1][0] = "vaporiza";
		jugada[2][1] = "refuta";
		jugada[2][0] = "cubre";
		jugada[3][1] = "envenena";
		jugada[3][2] = "come";
		jugada[4][3] = "decapita";
		jugada[4][2] = "corta";
	}

}
