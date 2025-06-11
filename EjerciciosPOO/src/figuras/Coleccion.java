package figuras;

import java.util.ArrayList;

public class Coleccion{
	private String nombreColeccion;
	private ArrayList<?> listaFiguras;
	public Coleccion(String nombreColeccion, ArrayList<?> listafiguras) {
		this.nombreColeccion = nombreColeccion;
		this.listaFiguras = listaFiguras;
	}
	public String getNombreColeccion() {
		return nombreColeccion;
	}
	public void setNombreColeccion(String nombreColeccion) {
		this.nombreColeccion = nombreColeccion;
	}
	
	@Override
	public String toString() {
		return "Coleccion [nombreColeccion=" + nombreColeccion + ", listaFiguras=" + listaFiguras + "]";
	}
	
}
