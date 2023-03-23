package es.studium.ejercicio8tablas;
import java.util.Scanner;

public class Ejercicio8Tablas
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int maximo;
		final int MAX = 10;
		int tabla[] = new int[MAX];
		maximo = tabla[0];
		for(int i =  0; i < MAX; i++) {
			System.out.println("Dime un número: ");
			tabla[i] = teclado.nextInt();
			if(tabla[i]>maximo) {
				maximo = tabla[i]; //Garantizar el máximo de tabla[]
			}
		
		} //Relleno la tabla entera antes de preguntar por el máximo en distintas posiciones
		System.out.println("El número máximo es: "+maximo);
		System.out.println("Y se encuentra en las posiciones siguientes:");
		for(int i =  0; i < MAX; i++) {
			if(tabla[i] == maximo) {
				System.out.println(i);
			}
		}
		teclado.close();

		
	}

}
