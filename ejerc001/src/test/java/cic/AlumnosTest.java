package cic;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class AlumnosTest {

	@Test
	public void test() {
		Alumnos alu = new Alumnos();
	 
	 assertEquals("[al1, al2, al3, al4]", Arrays.toString(alu.addElement(alu.alumnos, "al4")));
	}

}
