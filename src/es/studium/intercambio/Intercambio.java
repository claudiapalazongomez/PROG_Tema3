package es.studium.intercambio;

import java.util.Scanner;

public class Intercambio
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
		
		for(i = 0; i < MAX-1; i++) { //MAX-1 debido a que el último número de la tabla no tenemos siguiente con el que compararlo
			for(j = i + 1; j < MAX; j++) { //j = i + 1 debido a que empezamos en el número siguiente de la i para compararlo y aquí si llegamos hasta el final de la tabla
				if(array[i] > array[j]) { //si lo queremos de mayor a menor le cambiamos el signo //comparamos el NÚMERO que se encuentre en la posición de la tabla[i] para almacenarla en la tabla[j]
					aux = array[i];
					array[i] = array[j];
					array[j] = aux; 
				}
			}
		}
		
		System.out.println("La tabla ordenada queda así: ");
		for(i = 0; i < MAX-1; i++) {
			System.out.println(array[i]);
		}
		teclado.close();

	}

}
