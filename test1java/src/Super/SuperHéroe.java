package Super;

public class SuperHéroe {
	private String Nombre;
	private String Desc;
	private boolean Capa;
	
	public SuperHéroe(String nombre, String desc, boolean capa) {
		super();
		this.Nombre = nombre;
		this.Desc = desc;
		this.Capa = capa;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		this.Desc = desc;
	}
	public boolean isCapa() {
		return Capa;
	}
	public void setCapa(boolean capa) {
		this.Capa = capa;
	}

	@Override
	public String toString() {
		return "SuperHéroe [Nombre=" + Nombre + ", desc=" + Desc + ", capa=" + Capa + "]";
	}
	
	
}

