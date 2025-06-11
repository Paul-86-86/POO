package Autos;

public class Pista {
	
	private int pista;
	private int distancia = 0;
	
	public Pista(int pista, int distancia) {
		super();
		setPista(pista);
		setDistancia(distancia);
	}

	public int getPista() {
		return pista;
	}

	public void setPista(int pista) {
		this.pista = pista;
	}

	public  int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

}
