package Super;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coleccion c1 = new Coleccion("Clase Olympic");
		c1.addfigura((char) 1,"Titanic1","se hunde1",false,700,46,65,45);
		c1.addfigura((char) 2,"Titanic2","se hunde2",true,800,46,75,45);
		c1.addfigura((char) 3,"Titanic3","se hunde3",false,600,46,55,45);
		c1.addfigura((char) 4,"Titanic4","se hunde4",true,1000,46,85,45);
		c1.subirPrecio(5000, (char) 1);
		c1.bajarPrecio(2000, (char) 1);
		c1.Concapa();
		c1.Mayorvalor();
		c1.Valor();
		c1.Volumentotal();
	}

}
