package es.studium.ejercicio8cadena;

import java.util.Scanner;

public class Ejercicio8Cadena
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String frase;
		char posicion;
		System.out.println("Inserte una frase: ");
		frase = teclado.nextLine();
		System.out.println("Inserte el c�racter: ");
		posicion = teclado.nextLine().charAt(0);
		if(frase.indexOf(posicion)+1 != 0) {
			System.out.println("La primera posici�n del car�cter '" + posicion +  "' es: "+ (frase.indexOf(posicion)+1));
		}
		else {
			System.out.println("Ese car�cter no se encuentra en la frase");
		}
		teclado.close();
		
		

	}

}
