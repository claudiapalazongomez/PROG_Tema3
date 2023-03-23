package es.studium.ordenarinsercion;

import java.util.Scanner;

public class OrdenarInsercion
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
		teclado.close();
		
		for(i = 0; i < MAX; i++) {
			j = i;
			aux = array[i];
			while(j > 0 && aux < array[j-1])
			{
				array[j] = array[j-1];
				j = j-1;
			}
			array[j] = aux;
		}
		
		System.out.println("La tabla ordenada queda así: ");
		for(i = 0; i < MAX; i++) {
			System.out.println(array[i]);
		}

	}

}
