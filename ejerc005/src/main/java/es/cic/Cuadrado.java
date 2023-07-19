package es.cic;

import java.util.ArrayList;

public class Cuadrado implements FigurasI {
	 
	 
	 
	int coordX;
	int coordY;
	String typeFigure;
	String color;
	int sizeFigureX;
	int sizeFigureY;

	
	

	public Cuadrado(String typeFigure, String color, int coordX, int coordY,  int sizeFigureX, int sizeFigureY) {
		// TODO Auto-generated constructor stub
		this.coordX = coordX;
		this.coordY = coordY;
		this.typeFigure = typeFigure;
		this.color = color;
		this.sizeFigureX = sizeFigureX;
		this.sizeFigureY = sizeFigureY;
		
		
	}

	




	@Override
	public void addFigure() {
		// TODO Auto-generated method stub
		
		
	}

	





	@Override
	public String toString() {
		return "Cuadrado [coordX=" + coordX + ", coordY=" + coordY + ", typeFigure=" + typeFigure + ", color=" + color
				+ ", sizeFigureX=" + sizeFigureX + ", sizeFigureY=" + sizeFigureY + "]";
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






	public int getSizeFigureX() {
		return sizeFigureX;
	}






	public void setSizeFigureX(int sizeFigureX) {
		this.sizeFigureX = sizeFigureX;
	}






	public int getSizeFigureY() {
		return sizeFigureY;
	}






	public void setSizeFigureY(int sizeFigureY) {
		this.sizeFigureY = sizeFigureY;
	}






	public static void set(int initPosition, Cuadrado newValue) {
		// TODO Auto-generated method stub
		
	}







}
