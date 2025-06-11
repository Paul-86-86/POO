package Autos;

import java.util.ArrayList;

import threads.Threads2;

public class Main{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prueba p1 = new Prueba(1,10,1,100);
		Prueba p2 = new Prueba(2,10,2,100);
		Prueba p3 = new Prueba(3,10,3,100);
		
		p1.start();
		p2.start();
		p3.start();
	}

}
