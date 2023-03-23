package es.studium.ejercicio6cadena;

import java.util.Scanner;

public class Ejercicio6Cadena
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String cadena1, cadena2;
		System.out.println("Dime tu primera cadena: ");
		cadena1 = teclado.nextLine();
		System.out.println("Dime tu segunda cadena: ");
		cadena2 = teclado.nextLine();
		teclado.close();
		if(cadena1.equals(cadena2))
		{
			System.out.println("Son iguales");
		}
		else 
		{
			System.out.println("Son distintas");
		}

	}

}
