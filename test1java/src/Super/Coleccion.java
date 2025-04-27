package Super;

import java.util.ArrayList;
import java.util.List;

public class Coleccion{
	private String nombre;        
	private List<Figura> lista = new ArrayList<Figura>();
	
	public Coleccion(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void addfigura( char id,String nombre, String desc, boolean capa, double precio,double Alto,double Ancho,double Profundidad) 
	{
		lista.add(new Figura(id,nombre,desc,capa,precio,Alto,Ancho,Profundidad));
	}
	
	public void subirPrecio(double cantidad, char id)
	{
		for (Figura figura : lista) 
		{
			if(figura.getId() == id) 
			{
				figura.Subirprecio(cantidad);
				System.out.println("Precio actualizado para figura " + figura.getNombre() + " a " + figura.getPrecio());
				break;
			}
		}
	}
	
	public void bajarPrecio(double cantidad, char id)
	{
		for (Figura figura : lista) 
		{
			if(figura.getId() == id) 
			{
				figura.Bajarprecio(cantidad);
				System.out.println("Precio actualizado para figura " + figura.getNombre() + " a " + figura.getPrecio());
				break;
			}
		}
		
	}
	
	public void Concapa()
	{
		for (Figura figura : lista) 
		{
			if(figura.isCapa()) 
			{
				System.out.println("Figura con capa " + figura.getNombre());
			}
		}
	}
	
	public void Mayorvalor()
	{
		double precio1 = 0;
		Figura figuraMayorPrecio = null;
		
		for (Figura figura : lista) 
		{
			if(precio1 < figura.getPrecio()) {
			precio1 = figura.getPrecio();
			}
			figuraMayorPrecio = figura;
		}
		if (figuraMayorPrecio != null) {
		    System.out.println("La figura con mayor precio es: " + figuraMayorPrecio.getNombre());
		}
		
	}
	
	public void Valor()
	{
		double precio1 = 0;
		for (Figura figura : lista) 
		{
			precio1 = precio1 + figura.getPrecio();
		}
	    System.out.println("Precio total de la coleccion " + precio1);
	}
	
	public void Volumentotal()
	{
		double vol = 0;
		for (Figura figura : lista) 
		{
			vol = vol + figura.Volumen();
		}
		vol = vol + 200;
		System.out.println("Volumen total de la coleccion es " + vol);
	}

	@Override
	public String toString() {
		return "Coleccion [nombre=" + nombre + ", lista=" + lista + "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Figura> getLista() {
		return lista;
	}

	public void setLista(List<Figura> lista) {
		this.lista = lista;
	}
	
	
	
}
