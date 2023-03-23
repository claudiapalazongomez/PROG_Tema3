package es.studium.ejercicio3tablas;

public class Ejercicio3Tablas
{

	public static void main(String[] args)
	{
		final int MAX = 20;
		int tabla[] = new int[MAX];
		for(int i = 0; i < MAX; i++) { //MAX es lo mismo que Pares.lenght
			tabla[i] = i * 2;		
		}
		for(int i = MAX-1; i>=0; i--) { //MAX-1 es 19 y como queremos empezar por atrás por eso lo cogemos
			System.out.println(tabla[i]);
		}

	}

}
