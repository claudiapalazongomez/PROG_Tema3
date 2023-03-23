package es.studium.ejercicio3cadena;

import java.util.Scanner;

public class Ejercicio3Cadena
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
		if(cadena1.length() == cadena2.length())
		{
			System.out.println("Tienen la misma longitud");
		}
		else if(cadena1.length() > cadena2.length())
		{
			System.out.println("La primera cadena tiene mayor longitud que la segunda");
		}
		else
		{
			System.out.println("La primera cadena tiene menor longitud que la primera");
		}
		

	}

}
