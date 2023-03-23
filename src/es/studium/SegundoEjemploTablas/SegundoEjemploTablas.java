package es.studium.SegundoEjemploTablas;

import java.util.Scanner;

public class SegundoEjemploTablas
{

	public static void main(String[] args)
	{
		int tablaEnteros[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		//Pedir los valores al usuario
		for(int i = 0; i < tablaEnteros.length; i++) {
			System.out.println("Dame el n�mero entero de la posici�n " + i);
			tablaEnteros[i] = teclado.nextInt();
		}
		//Tratamiendo de los valores
		for(int i = 0; i < tablaEnteros.length; i++) {
			tablaEnteros[i] = tablaEnteros[i] * 2; //para que salga el doble del n�mero que le has colocado en cada posici�n
		}
		//Mostrar valores de la tabla
		for(int i = 0; i < tablaEnteros.length; i++) { //<= no se puede poner porque llegar�a hasta el 10 y no hay posici�n 10 debido a que empezamos en 0
			System.out.println("Valor de " + i + ": " + tablaEnteros[i]);
		}
		teclado.close();

	}

}
