package Autos;

import java.util.ArrayList;

public class Prueba extends Thread {
	private Auto Auto;
	private Pista pista;
	
	 public Prueba(int auto, int vel, int pista, int distancia) {
		super();
		this.Auto = new Auto(auto,vel);
		this.pista = new Pista(pista,distancia);
	}

	public void run() {
		long inicio = System.currentTimeMillis();
	    System.out.println("Auto:"+Auto.getAuto()+" Iniciado");
	try 
	{
		sleep((long)(1000*Math.random()));
	} catch (InterruptedException e) { return; }
		for(int i = 0; i<this.pista.getDistancia(); i = i + this.Auto.getVel()) 
		{		
		}
		
		long fin = System.currentTimeMillis();     // ⏱ Marca el final
	    long duracion = fin - inicio;
	    
		System.out.println("Auto:"+Auto.getAuto()+" Finalizado en pista"+this.pista.getPista());
		System.out.println("tiempo en la pista: "+duracion+"ms");
	}
}
