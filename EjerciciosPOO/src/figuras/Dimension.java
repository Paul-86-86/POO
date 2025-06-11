package figuras;

public class Dimension {
	private float alto;
	private float ancho;
	private float profundidad;
		public Dimension(float alto, float ancho, float dimension) {
			this.alto = 0;
			this.ancho = 0;
			this.profundidad = 0;
		}
		public float getAlto() {
			return alto;
		}
		public void setAlto(float alto) {
			this.alto = alto;
		}
		public float getAncho() {
			return ancho;
		}
		public void setAncho(float ancho) {
			this.ancho = ancho;
		}
		public float getProfundidad() {
			return profundidad;
		}
		public void setProfundidad(float profundidad) {
			this.profundidad = profundidad;
		}
		public void getVolumen() {
			float volumen = alto*ancho*profundidad;
		}
		@Override
		public String toString() {
			return "Dimension [alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad + "]";
		}
	
}
