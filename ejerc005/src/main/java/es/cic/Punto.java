package es.cic;

public class Punto {
	
	

	int coordX;
	int coordY;
	String typeFigure;
	String color;

	
	

	public Punto(String typeFigure, String color, int coordX, int coordY) {
		
		this.coordX = coordX;
		this.coordY = coordY;
		this.typeFigure = typeFigure;
		this.color = color;
		
		
		
	}




	public int getCoordX() {
		return coordX;
	}




	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}




	public int getCoordY() {
		return coordY;
	}




	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}




	public String getTypeFigure() {
		return typeFigure;
	}




	public void setTypeFigure(String typeFigure) {
		this.typeFigure = typeFigure;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	@Override
	public String toString() {
		return "Punto [coordX=" + coordX + ", coordY=" + coordY + ", typeFigure=" + typeFigure + ", color=" + color
				+ "]";
	}


}
