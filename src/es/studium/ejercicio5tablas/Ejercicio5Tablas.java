package es.studium.ejercicio5tablas;

import java.util.Scanner;

public class Ejercicio5Tablas
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Dime un número: ");
		numero = teclado.nextInt();
		final int MAX = 10;
		int tabla[] = new int[MAX];
		for(int i = 0; i < MAX; i++) {
			tabla[i] = (numero + 1) * (numero + 1);
			numero++; //numero = numero + 1
		}
		for(int mostrar: tabla) {
			System.out.println(mostrar);
		}

	}

}
