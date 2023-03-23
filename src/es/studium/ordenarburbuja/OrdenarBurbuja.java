package es.studium.ordenarburbuja;

import java.util.Scanner;

public class OrdenarBurbuja
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int MAX = 10;
		int array[] = new int [MAX];
		int i, j, aux;
		
		for(i = 0; i < MAX; i++) {
			System.out.println("Dame un número entero: ");
			array[i] = teclado.nextInt();
		}
		
		for(i = 0; i < MAX-1; i++) {
			for(j = 0; j < MAX-i-1; j++) {
				if(array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1]= aux;
				}
			}
		}
		
		System.out.println("La tabla ordenada queda así: ");
		for(i = 0; i < MAX; i++) {
			System.out.println(array[i]);
		}

	}

}
