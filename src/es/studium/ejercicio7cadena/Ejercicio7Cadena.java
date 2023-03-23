package es.studium.ejercicio7cadena;

import java.util.Scanner;

public class Ejercicio7Cadena
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String frase;
		System.out.println("Inserte una frase: ");
		frase = teclado.nextLine();
		System.out.println("La longitud de la frase con espacios es: "+ longitud1(frase));
		System.out.println("La longitud de la frase sin espacios es: "+ longitud2(frase));
		teclado.close();
	}
		
		public static int longitud1(String frase) {
			return(frase.length());
		}
		
		public static int longitud2(String frase) {
			return(frase.replace(" ", "").length());
			/*int contadorEspacios = 0
			 * for(int i=0;i<frase.length();i++)
			 * if(frase.charAt(i)==' '){
			 * contadorEspacios++; //contadorEspacios = contadorEspacios + 1
			 * }
			 * return(frase.length()-contadorEspacios);
			*/
		}
}
	
	


