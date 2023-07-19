package es.cic;

import java.util.ArrayList;

public class Lienzo {
	
	public  static int coordXLienzo = 500;
	public static int coordYLienzo = 500;
	
	public static ArrayList<String> draws = new ArrayList<>();

	public static ArrayList<String> getDraws() {
		return draws;
	}

	public static void setDraws(ArrayList<String> draws) {
		Lienzo.draws = draws;
	}

	public  static int getCoordXLienzo() {
		return coordXLienzo;
	}

	public  static int getCoordYLienzo() {
		return coordYLienzo;
	}

	public  void setCoordYLienzo(int coordYLienzo) {
		this.coordYLienzo = coordYLienzo;
	}

	public static void setDraws(String string) {
		
		
	}


}
