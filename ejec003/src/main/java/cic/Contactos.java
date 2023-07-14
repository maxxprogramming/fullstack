package cic;
import java.util.*;

public class Contactos {
	
	ArrayList<Personas> contactos;
	
	public Contactos() {
		this.contactos = new ArrayList<Personas>();
	}
	
	
	public void add(Personas persona) {
		//**search by index**
		
		if(contactos.indexOf(persona) < 0 ) {
			contactos.add(persona);
		}
	}
	
	public void edit(Personas editValue, Personas newValue) {
		int initPosition =  contactos.indexOf(editValue);
		
		if (initPosition >=0) { 
		contactos.set(initPosition, newValue);
		}
	}
	
	public void remove(Personas persona2Delete ) {
		int initPosition = contactos.indexOf(persona2Delete);
		
		if (initPosition >=0) {
			contactos.remove(initPosition);
		}
	}
	

		public String showContacts() {
			String info = "";
			
			for (Personas persona : contactos) {
				info = persona.toString();
			}
				return info;
		}
		
		
		public int totalContactos() {
			return contactos.size();
		}
		
		public int searchPerson(Personas persona) {
			return contactos.indexOf(persona);
		}
}
