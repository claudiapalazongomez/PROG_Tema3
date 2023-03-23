package es.studium.ordenacionybusqueda;

import java.util.Scanner;

public class OrdenacionYBusqueda
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int MAX = 10;
		int tabla[] = new int[MAX];
		int i;
		boolean encontrado = true;
		int elemento;
		
		for(i = 0; i < MAX; i++) {
			System.out.println("Dame un número entero: ");
			tabla[i] = teclado.nextInt();
		}
		
		System.out.println("Dame el número a buscar: ");
		elemento = teclado.nextInt();
		
		encontrado = false;
		i = 0;
		do {
			if(tabla[i] == elemento) {
				encontrado = true;
			}
			else {
				i++;
			}
		}while(!encontrado && i<MAX);
		
		if(encontrado==true) {
			System.out.println("El elemento se encontró en la posición: "+ i);
		}
		else {
			System.out.println("El elemento NO se ha encontrado");
		}
		teclado.close();
		
		

	}

}
