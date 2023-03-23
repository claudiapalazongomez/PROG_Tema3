package es.studium.ejercicio6tablas;

import java.util.Scanner;

public class Ejercicio6Tablas
{

	public static void main(String[] args)
	{	
		final int MAX = 2;
		int contadores[] = new int[MAX]; 
		int numero;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Dime un número: ");
			numero = teclado.nextInt();
			if(numero>0) {
				contadores[0]++; //Sumamos 1 //POSICIONES: 0 de momento no hay nada guardado, no confundir
			}
			else if(numero<0){
				contadores[1]++; //POSICIONES: 1 de momento no hay nada guardado, no confundir
			}
		}while(numero!=0);
		System.out.println("Hay "+contadores[0]+" números positivos");
		System.out.println("Hay "+contadores[1]+" números negativos");
		teclado.close();	
	}

}


