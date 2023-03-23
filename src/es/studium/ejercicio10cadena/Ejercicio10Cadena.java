package es.studium.ejercicio10cadena;

import java.util.Scanner;

public class Ejercicio10Cadena
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String cadena;
		int longitud;
		System.out.println("Inserte una cadena: ");
		cadena = teclado.nextLine();
		System.out.println("Elige una longitud: ");
		longitud = teclado.nextInt();
		for(int i = cadena.length()-longitud; i<cadena.length(); i++) {
			System.out.print(cadena.charAt(i));
		}
		teclado.close();

	}

}
