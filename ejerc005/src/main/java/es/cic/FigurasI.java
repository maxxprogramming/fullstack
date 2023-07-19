package es.cic;

public interface FigurasI {
	
	
	  void deleteFigure( String arrayName, int indexOfFigure);
	  void moveFigure (String arrayName, int indexOfFigure, int coordX, int coordY);
	 void transformFigure(String arrayName, int indexOfFigure, int sizeFigureX , int sizeFigureY , int radius);

	void addFigure(int coordX, int coordY, String typeFigure, String color, int sizeFigureX, int sizeFigureY,
			int radius);
	
	

}

