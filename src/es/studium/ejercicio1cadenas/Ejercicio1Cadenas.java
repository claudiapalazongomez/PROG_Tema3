package es.studium.ejercicio1cadenas;

import java.util.Scanner;

public class Ejercicio1Cadenas
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String nom1, nom2, nom3, nom4, nom5;
		//String nombres[] = new String[5]; se podría hacer con un array
		System.out.println("Inserte el primer nombre: ");
		nom1 = teclado.nextLine();
		System.out.println("Inserte el segundo nombre: ");
		nom2 = teclado.nextLine();
		System.out.println("Inserte el tercer nombre: ");
		nom3 = teclado.nextLine();
		System.out.println("Inserte el cuarto nombre: ");
		nom4 = teclado.nextLine();
		System.out.println("Inserte el quinto nombre: ");
		nom5 = teclado.nextLine();
		teclado.close();
		
		//Nuevo concepto para imprimir por pantalla todos los nombres
		System.out.println(String.format("%s %s %s %s %s", nom1, nom2, nom3, nom4, nom5));

	}

}
