package es.studium.ejercicio5cadena;

import java.util.Scanner;

public class Ejercicio5Cadena
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String palabra;
		System.out.println("Inserte una palabra: ");
		palabra = teclado.nextLine();
		teclado.close();
		System.out.println(palabra.toUpperCase());
		System.out.println(palabra.toLowerCase());
				

	}

}
