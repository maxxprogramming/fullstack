package es.cic;

import java.util.ArrayList;

public class Lienzo {
	
	public int coordXLienzo = 500;
	public int coordYLienzo = 500;
	
	public static ArrayList<String> draws = new ArrayList<String>();

	public static ArrayList<String> getDraws() {
		return draws;
	}

	public static void setDraws(ArrayList<String> draws) {
		Lienzo.draws = draws;
	}

}
