package es.studium.ejercicio2tablas;

public class Ejercicio2Tablas
{

	public static void main(String[] args)
	{
		int cont = 0;
		final int MAX = 20;
		int Pares[] = new int[MAX];
		for(int i = 0; i < MAX; i++) { //MAX es lo mismo que Pares.lenght
			Pares[i] = i * 2;
		}
		for(int numero: Pares) {
			System.out.println(numero);
		}

	}

}
