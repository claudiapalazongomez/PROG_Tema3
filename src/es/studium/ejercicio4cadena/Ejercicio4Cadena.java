package es.studium.ejercicio4cadena;

import java.util.Scanner;

public class Ejercicio4Cadena
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String cadena1, cadena2, cadena3;
		System.out.println("Dime tu primera cadena: ");
		cadena1 = teclado.nextLine();
		System.out.println("Dime tu segunda cadena: ");
		cadena2 = teclado.nextLine();
		teclado.close();
		cadena3 = cadena1  + " " + cadena2;
		System.out.println(cadena3);
		

	}

}
