package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	private Integer valorForma;
	private String nombreForma;
	private final Integer VALPARAM = 5;
	private String[][] jugada = new String[VALPARAM][VALPARAM];

	/**
	 * Toda Mano debe crearse con una forma dada, que sera la que determine su
	 * condicion en el juego.
	 * @param forma
	 *            , la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		valorForma = forma.getValor();
		nombreForma = forma.name();
	}

	/**
	 * Evaluara el resultado de la partida segun las reglas del juego.
	 * @param otra
	 *            , la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		inicializaMatriz();

		if (this.valorForma == otra.valorForma) {
			System.out.println(this.nombreForma + " " + Resultado.EMPATA
					+ " con " + otra.nombreForma);
			return Resultado.EMPATA;
		} else {

			if (" ".equals(jugada[this.valorForma][otra.valorForma])) {
				System.out.println(this.nombreForma + " " + Resultado.PIERDE
						+ " con " + otra.nombreForma);
				return Resultado.PIERDE;
			} else {
				System.out.println(this.nombreForma + " "
						+ jugada[this.valorForma][otra.valorForma] + " a "
						+ otra.nombreForma + "  " + Resultado.GANA + " "
						+ this.nombreForma);
				return Resultado.GANA;
			}
		}
	}

	/**
	 * Este metodo se utiliza para inicializar una matriz.
	 */
	public void inicializaMatriz() {

		for (Integer i = 0; i < VALPARAM; i++) {
			for (Integer j = 0; j < VALPARAM; j++) {

				jugada[i][j] = " ";
			}
		}
		jugada[Forma.PIEDRA.getValor()][Forma.LAGARTO.getValor()] = "aplasta";
		jugada[Forma.PIEDRA.getValor()][Forma.TIJERA.getValor()] = "aplasta";
		jugada[Forma.SPOCK.getValor()][Forma.TIJERA.getValor()] = "destroza";
		jugada[Forma.SPOCK.getValor()][Forma.PIEDRA.getValor()] = "vaporiza";
		jugada[Forma.PAPEL.getValor()][Forma.SPOCK.getValor()] = "refuta";
		jugada[Forma.PAPEL.getValor()][Forma.PIEDRA.getValor()] = "cubre";
		jugada[Forma.LAGARTO.getValor()][Forma.SPOCK.getValor()] = "envenena";
		jugada[Forma.LAGARTO.getValor()][Forma.PAPEL.getValor()] = "come";
		jugada[Forma.TIJERA.getValor()][Forma.LAGARTO.getValor()] = "decapita";
		jugada[Forma.TIJERA.getValor()][Forma.PAPEL.getValor()] = "corta";
	}

}
