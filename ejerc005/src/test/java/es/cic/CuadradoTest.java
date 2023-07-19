package es.cic;

import static org.junit.Assert.*;

import java.sql.Array;
import java.util.ArrayList;

import org.junit.Test;

public class CuadradoTest {

	@Test
	public void test() {

		
		Cuadrado cut = new Cuadrado("cuadrado", "red", 120, 150, 20, 50);
		
		Lienzo.draws.add(cut.toString());
		assertEquals("[Cuadrado [coordX=120, coordY=150, typeFigure=cuadrado, color=red, sizeFigureX=20, sizeFigureY=50]]", Lienzo.getDraws().toString());
		
	}

}
