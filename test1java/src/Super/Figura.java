package Super;

public class Figura extends SuperHéroe {
	private char id;
	private double precio;
	private Dimension dimension;
	
	public Figura( char id,String nombre, String desc, boolean capa, double precio,double Alto,double Ancho,double Profundidad) {
		super(nombre, desc, capa);
		this.id = id;
		this.precio = precio;
		this.dimension = new Dimension(Alto, Ancho, Profundidad);
		System.out.println("El volumen de la figura "+ getNombre() + " es "+ Alto +", "+Ancho+" y "+Profundidad+" es "+ this.dimension.Volumen());
	}
	
	public char getId() {
		return id;
	}
	public void setId(char id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Dimension getDimension() {
		return dimension;
	}
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	
	@Override
	public String toString() {
		return "Figura [id=" + id + ", precio=" + precio + ", dimension=" + dimension + "]";
	}

	public void Subirprecio(double cantidad) {
	    this.precio += cantidad;
	}
	
	public void Bajarprecio(double cantidad) {
	    this.precio -= cantidad;
	}
	
	public double Volumen() 
	{
		double vol = this.dimension.Volumen();
		return vol;
	}
	
}
