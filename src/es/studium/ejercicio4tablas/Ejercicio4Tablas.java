package es.studium.ejercicio4tablas;

public class Ejercicio4Tablas
{

	public static void main(String[] args)
	{
		final int MAX = 3;
		int Ceros[] = new int [MAX];
		for(int i = 0; i < MAX; i++) {
			Ceros[i] = 0;
		}
		for(int numero: Ceros) {
			System.out.print(numero);
		}
	
	}

}
