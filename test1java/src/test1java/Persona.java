package test1java;

public class Persona {
	private int edad;
	private String nombre;
	private String apellido;
	
	public Persona(int edad, String nombre, String apellido) {
		super();
		this.edad = edad;
		setEdad(edad);
		this.nombre = nombre;
		setNombre(nombre); 
		this.apellido = apellido;
		setApellido(apellido);
	}
	
	public void hola() 
	{
		System.out.print(" hola soy "+ this.nombre +", mi apellido es "+ this.apellido);
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
