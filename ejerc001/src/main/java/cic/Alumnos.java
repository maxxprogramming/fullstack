package cic;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Alumnos {

		public String alumnos[] = {"al1","al2","al3"};
		
	
	
	 public  String[] addElement(String[] array, String element) {
	        String[] newArray = Arrays.copyOf(array, array.length + 1);
	        newArray[newArray.length - 1] = element;
	        return newArray;
	    }

	public String[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(String[] alumnos) {
		this.alumnos = alumnos;
	}
	 
	 
	public void deleteAlumno(String [] alumnos) { 
		
		
	
	}
	

}




