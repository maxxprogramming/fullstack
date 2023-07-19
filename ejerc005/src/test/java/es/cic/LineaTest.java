package es.cic;

import static org.junit.Assert.*;

import org.junit.Test;

public class LineaTest {

	@Test
	public void test() {
		Linea li = new Linea("linea", "red", 130, 124, 30, 20);
		
		Lienzo.draws.add(li.toString());
		assertEquals("[Linea [coordX=130, coordY=124, typeFigure=linea, color=red, sizeFigureX=30, sizeFigureY=20]]", Lienzo.getDraws().toString());
	}

}
