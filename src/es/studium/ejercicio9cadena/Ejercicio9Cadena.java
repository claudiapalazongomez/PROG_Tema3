package es.studium.ejercicio9cadena;

import java.util.Scanner;

public class Ejercicio9Cadena
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String cadena;
		int posicion, longitud;
		System.out.println("Inserte una cadena: ");
		cadena = teclado.nextLine();
		System.out.println("Elige una posición: ");
		posicion = teclado.nextInt();
		System.out.println("Elige una longitud: ");
		longitud = teclado.nextInt();
		if(cadena.length()<(posicion+longitud)) {
			System.out.println("No es posible realizarlo");
		}
		else {
		System.out.println(subcadena(cadena, posicion, longitud));
		}
		teclado.close();
	}
	
	public static String subcadena (String cadena, int p, int l) {
		String subcadena;
		subcadena = cadena.substring(p,p+l); //p+l te coge desde la posición deseada (ej 6) hasta la longitud deseada (ej 6): si ponemos ayuntamiento nos cogería miento. La suma es 12, PERO el método en si te quita -1
		return(subcadena);
	}

}
