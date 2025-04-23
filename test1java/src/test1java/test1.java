package test1java;

public class test1 {

	public static void main(String[] args) {
		Persona p1 = new Persona(-10, "Guido", "Armua");
		p1.hola();
		p1.getNombre();	
		
		Estudiante e1 = new Estudiante(20,"paul","fabre",6,14);
		e1.hola();
	}

}
