package cic;


import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class ContactosTest {

    private Contactos contactos;
    private Personas contactOne, contactTwo , contactThree;

    @BeforeEach
    public void settings() throws Exception {
        contactos = new Contactos();
        
        contactOne = new Personas("Alumno1", "Apellido1");
        contactTwo = new Personas("Alumno5", "Apellido5");
        contactThree = new Personas("EditedAlumno", "EditedApellido");
        contactos.add(contactTwo);
        contactos.add(contactOne);
    }

    @Test
	void testViewContent() {
		assertNotNull(contactos.showContacts());
		
	}
    
    
    @Test 
    void testAdd () {
    	contactos.add(contactOne);
    	contactos.add(contactTwo);
    	assertEquals(2, contactos.totalContactos());
    }
    
    @Test
    
    void testDelete() {
    	contactos.add(contactOne);
    	contactos.add(contactTwo);
    	contactos.remove(contactOne);
    	assertEquals(1, contactos.totalContactos());
    	
    }
    
    @Test
    
    void testEdit () {
    	contactos.add(contactOne);
    	contactos.edit(contactOne, contactThree);
    	String dataCheck = contactos.showContacts();    	
    	assertEquals("Persona [ Name: EditedAlumno, Surname:EditedApellido]", dataCheck);
    	
    }
}
