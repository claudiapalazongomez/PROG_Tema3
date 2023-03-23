package es.studium.ejercicio1tablas;

import java.util.Scanner;

public class Ejercicio1Tablas
{

	public static void main(String[] args)
	{
		int tablaEnteros[] = new int[4];
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < tablaEnteros.length; i++) { //.length reconoce la longitud del array en este caso, así si se cambia a lo largo del tiempo no hay que modificar el for
			System.out.println("Dame el número entero de la posición " + i);
			tablaEnteros[i] = teclado.nextInt();
		}
		for(int i = 0; i < tablaEnteros.length; i++) {
			System.out.println("Valor de " + i + ": " + tablaEnteros[i]);
		}
		teclado.close();

	}

}
