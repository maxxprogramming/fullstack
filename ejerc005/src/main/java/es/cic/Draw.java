package es.cic;

import java.util.ArrayList;

public class Draw {
	
	public ArrayList<Punto> puntos;
	
	public void edit(Punto editValue, Punto newValue) {
		int initPosition =  puntos.indexOf(editValue);
		
		if (initPosition >=0) { 
			puntos.set(initPosition, newValue);
		}
	}

	public ArrayList<Punto> getPuntos() {
		return puntos;
	}

	public void setPuntos(ArrayList<Punto> puntos) {
		this.puntos = puntos;
	}
	

}
