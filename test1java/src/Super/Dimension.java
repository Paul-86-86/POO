package Super;

public class Dimension {
	private double Alto;//Medida correspondiente al alto del objeto.
	private double Ancho;//Medida correspondiente al ancho del objeto.
	private double Profundidad;//Medida correspondiente a la profundidad del objeto
	
	public Dimension(double alto, double ancho, double profundidad) {
		super();
		this.Alto = alto;
		this.Ancho = ancho;
		this.Profundidad = profundidad;
	}
	
	public double getAlto() {
		return Alto;
	}
	public void setAlto(double alto) {
		Alto = alto;
	}
	public double getAncho() {
		return Ancho;
	}
	public void setAncho(double ancho) {
		Ancho = ancho;
	}
	public double getProfundidad() {
		return Profundidad;
	}
	public void setProfundidad(double profundidad) {
		Profundidad = profundidad;
	}
	@Override
	public String toString() {
		return "Dimension [Alto=" + Alto + ", Ancho=" + Ancho + ", Profundidad=" + Profundidad + "]";
	}
	
	public void Volumen(){
		double volumen = Alto * Ancho * Profundidad;
		System.out.println("El volumen de "+Alto+", "+Ancho+" y "+Profundidad+" es "+ volumen);
	}
}