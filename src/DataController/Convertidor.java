package DataController;

import java.util.Scanner;

public class Convertidor {
	Scanner sc = new Scanner (System.in);
	
	public void byteAmegabyte () {
		
		System.out.println("Ingrese la cantidad a convertir ");
		float Numero = sc.nextFloat();
		
		double conv1 = Numero * 0.001;
		System.out.println(+Numero +" son "+conv1 +" MegaBytes");
		
		
	}
	
public void KiloByteAMegabyte () {
		
		System.out.println("Ingrese la cantidad a convertir ");
		float Numero = sc.nextFloat();
		
		double conv2 = Numero * 1000;
		System.out.println(+Numero +" son "+conv2 +" KiloBytes");

		
		
	}
	
}
