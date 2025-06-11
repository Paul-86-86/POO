package figuras;

public class Figura{
	private String codigo;
	private float precio;
	private Superheroe superheroe;
	private Dimension dimension;
	public Figura(String codigo, float precio, Superheroe superheroe, Dimension dimension) {
		this.codigo = codigo;
		this.precio = precio;
		this.superheroe = superheroe;
		this.dimension = dimension;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Superheroe getSuperheroe() {
		return superheroe;
	}
	public void setSuperheroe(Superheroe superheroe) {
		this.superheroe = superheroe;
	}
	public Dimension getDimension() {
		return dimension;
	}
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	public void subirPrecio(float cantidad) {
		precio = precio+cantidad;
	}
	@Override
	public String toString() {
		return "Figura [codigo=" + codigo + ", precio=" + precio + ", superheroe=" + superheroe + ", dimension="
				+ dimension + "]";
	}
	
}
