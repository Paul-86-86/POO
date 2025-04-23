package test1java;

public class Estudiante extends Persona {
	private int curso;
	private int divicion;
	
	public Estudiante(int edad, String nombre, String apellido, int curso, int divicion) {
		super(edad, nombre, apellido);
		this.curso = curso;
		this.divicion = divicion;
	}
	
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	public int getDivicion() {
		return divicion;
	}
	public void setDivicion(int divicion) {
		this.divicion = divicion;
	}
	
	
}
