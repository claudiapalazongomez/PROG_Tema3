package es.studium.SegundoEjemploCadena;

import java.util.Scanner;

public class SegundoEjemploCadena
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String nombre, primerApellido, segundoApellido;
		String nombreCompleto;
		System.out.println("Dame tu nombre: ");
		nombre = teclado.nextLine(); //al ser un String ponemos Line
		System.out.println("Dame tu primer apellido: ");
		primerApellido = teclado.nextLine();
		System.out.println("Dame tu segundo apellido: ");
		segundoApellido = teclado.nextLine();
		teclado.close();
		nombreCompleto = nombre + " " + primerApellido + " " + segundoApellido;
		for(int i = 0; i < nombreCompleto.length(); i++)
		{
			System.out.println(nombreCompleto.charAt(i));
			
		}
		for(int i = 0; i < nombreCompleto.length(); i+=2)
		{
			System.out.print(nombreCompleto.charAt(i)); //no hacemos salto de línea
			if(i<nombreCompleto.length()-1) {
				System.out.println(nombreCompleto.charAt(i)+""+nombreCompleto.charAt(i));
			}
			
		}
		
	}
}
