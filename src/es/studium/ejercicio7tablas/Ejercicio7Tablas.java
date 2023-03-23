package es.studium.ejercicio7tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7Tablas
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero, maximo, minimo, suma;
		float media;
		final int MAX = 10;
		int tabla[] = new int[MAX];
		suma = 0;
		media = 0;
		for(int i =  0; i < MAX; i++) {
			System.out.println("Dime un número: ");
			numero = teclado.nextInt();
			tabla[i] = numero;
			suma = numero + suma; //el valor anterior			
		}
		media = (float)suma/(float)MAX; //MAX divide media entre el total de numeros ;)
		System.out.println("La media es: "+ media);
		Arrays.sort(tabla); //te lo ordena de manera ascendente
		maximo = tabla[MAX-1];
		minimo= tabla[0];
		System.out.println("El máximo es: "+ maximo);
		System.out.println("El mínimo es: "+ minimo);
		teclado.close();
		
		/*for(int i: tabla)
		{
			System.out.println(i); for each dato mostrarlo con i
		}
		*/
		
		/*Otra forma para el min y max:
		 * tabla[0] = minimo;
		 * for(int i =  0; i < MAX; i++){
		 * 		if(tabla[i] < minimo){
		 * 			minimo = tabla[i]
		 * }
		 * }
		 * System.out.println("El mínimo es: "+ minimo) LO MISMO PARA EL MÁXIMO
		 */
		
	}

}
