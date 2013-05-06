package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queLagartoComePapel() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("El papel es comido por el lagarto",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void ambasManosTijera() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Ambas manos eligieron tijera",
				Resultado.EMPATA, jugadorDos.jugarCon(jugadorUno));

	}
	
	@Test
	public void queTijeraDecapitaLagarto() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("El lagarto es decapitado por la tijera",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void quePapelRefutaSpock() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("El papel refuta al spock",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void ambasManosPiedra() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Ambas manos eligieron piedra",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

	}
	
	
	@Test
	public void quePiedraAplastaTijera() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("La piedra aplasta a la tijera",
				Resultado.GANA, jugadorDos.jugarCon(jugadorUno));

	}
	
	@Test
	public void queLagartoEnvenenaSpock() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("El lagarto envenena al spock",
				Resultado.PIERDE, jugadorDos.jugarCon(jugadorUno));

	}
}
