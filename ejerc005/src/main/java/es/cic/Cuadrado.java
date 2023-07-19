package es.cic;

import java.util.ArrayList;
import java.util.List;

public class Cuadrado implements FigurasI {
	 
    private static List<Cuadrado> existingFigures = new ArrayList<>();

	 
	int coordX;
	int coordY;
	String typeFigure;
	String color;
	int sizeFigureX;
	int sizeFigureY;

	
	

	 public Cuadrado() {
        super ();
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






	@Override
	public void deleteFigure(String arrayName, int indexOfFigure) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void moveFigure(String arrayName, int indexOfFigure, int coordX, int coordY) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void transformFigure(String arrayName, int indexOfFigure, int sizeFigureX, int sizeFigureY, int radius) {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void addFigure(int coordX, int coordY, String typeFigure, String color, int sizeFigureX, int sizeFigureY,
			int radius) {
		
		
		
		
		 boolean coordXExists = false;

	      
	        for (Cuadrado existingFigure : existingFigures) {
	            if (existingFigure.coordX == this.coordX && existingFigure.coordY == this.coordY || this.coordX > Lienzo.getCoordXLienzo() || this.coordX > Lienzo.getCoordYLienzo()) {
	                coordXExists = true;
	                break;
	            } 
	        }

	      
	        if (!coordXExists) {
	            existingFigures.add(this);
	            System.out.println(existingFigures.toString());
	            Lienzo.setDraws(this.toString());
	            System.out.println("Figure added successfully." + Lienzo.getDraws() + existingFigures);
	            System.out.println(Lienzo.getCoordYLienzo());
	        } else {
	            System.out.println("A figure with the same coordX already exists. Figure not added.");
	        }
	    }
		
	}








