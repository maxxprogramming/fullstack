package es.cic;

import static org.junit.Assert.*;

import org.junit.Test;

public class PuntoTest {

	@Test
	public void test() {
		Punto punto = new Punto("punto1", "red", 130, 120);
		Lienzo.draws.add(punto.toString());
		assertEquals("[Punto [coordX=130, coordY=120, typeFigure=punto1, color=red]]", Lienzo.getDraws().toString());
	}

	
	
	
}
