package Main;

import java.awt.Menu;
import java.util.Scanner;

import DataController.Convertidor;

public class Principal {

	public static void main (String [] args ) {
		
		Convertidor x = new Convertidor();
		System.out.println("Hola mundo ");
		Scanner sc = new Scanner (System.in);
		
		System.out.println("******* Menu de convertidor *********");
		
		
		int opc = 0;
	    do {
	       
	    	System.out.println("Ingrese 1 si desea convertir de byte a kilobytes"); 
	        System.out.println("Ingrese 2 si desea convertir de Kilobytes a Megabytes");
	        int opcElegir = sc.nextInt();
	        switch (opcElegir ) {
	        
	        case 1: 
	        	System.out.println("Opcion 1 elegida ");
	        	x.byteAmegabyte();
	        	
	        break;
	        
	        case 2:
	        	System.out.println("Opc 2 elegida");
	        	x.KiloByteAMegabyte();
	        break;
	        
	        
	        
	        }
	    System.out.println("Ingrese 3 si desea salir y cualquier otra para continuar ");
	    opc = sc.nextInt();
	    //System.out.println("Usted eligio "+opc);
	    }while (opc != 3);
	}
		
		 
	}


