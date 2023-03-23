package es.studium.ejercicio11tablas;

import java.util.Scanner;

public class Ejercicio11Tablas
{

	public static void main(String[] args)
	{
		final int TAM = 3;
		Scanner teclado = new Scanner(System.in);
		int tabla[][] = new int[TAM][TAM];
		boolean simetrica = true;
		
		for(int i = 0; i<TAM; i++) {
			for(int j = 0; j<TAM; j++) {
				System.out.println("Indique el n�mero de la posici�n "+i+","+j);
				tabla[i][j] = teclado.nextInt();
			}
		}
		teclado.close();
		for(int i = 0; i<TAM; i ++) {
			for(int j = 0; j<TAM; j++) {
				System.out.println(" "+tabla[i][j]);
			}
			System.out.println("");
		}
		for(int i = 0; i<TAM; i++) {
			for(int j = 0; j<TAM; j++) {
				if((tabla[i][j]!=tabla[j][i])){
					simetrica = false;
				}
			}	
		}
		if(simetrica) {
			System.out.println("La matriz SI es sim�trica.");
		}
		else {
			System.out.println("La matriz NO es sim�trica.");
		}

	}

}
