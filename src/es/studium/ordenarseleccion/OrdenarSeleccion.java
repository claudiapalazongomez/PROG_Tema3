package es.studium.ordenarseleccion;

import java.util.Scanner;

public class OrdenarSeleccion
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int MAX = 10;
		int array[] = new int [MAX];
		int i, j, indice_menor, aux;
		
		for(i = 0; i < MAX; i++) {
			System.out.println("Dame un número entero: ");
			array[i] = teclado.nextInt();
		}
		
		for(i = 0; i < MAX-1; i++) {
			indice_menor = i;
			for(j = i + 1; j < MAX; j++) {
				if(array[j] < array[indice_menor]) {
					indice_menor = j;
				}
			}
			
			aux = array[i];
			array[i] = array[indice_menor];
			array[indice_menor] = aux;	
		}
		
		System.out.println("La tabla ordenada queda así: ");
		for(i = 0; i < MAX; i++) {
			System.out.println(array[i]);
		}

	}

}
