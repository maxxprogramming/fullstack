package es.cic;

import static org.junit.Assert.*;

import java.sql.Array;
import java.util.ArrayList;

import org.junit.Test;

public class CuadradoTest {

	@Test
	public void test() {

		
		Cuadrado cut = new Cuadrado();
		
		cut.addFigure(502, 502, "red", "red", 0, 0, 0);

		Lienzo.draws.add(cut.toString());
		assertEquals("[Cuadrado [coordX=120, coordY=150, typeFigure=cuadrado, color=red, sizeFigureX=20, sizeFigureY=50]]", Lienzo.getDraws().toString());
		
	}

}
