package es.studium.EjemploSplit;

public class EjemploSplit
{

	public static void main(String[] args)
	{
		String texto = "En un lugar de La Mancha ...";
		String tabla[] = texto.split(" "); //se quiere separar por cada espacio en blanco y te elimina los espacios. SI yo pusiese una n x ej, me quitar�a las n y me dar�a un salto de l�nea
		for(String cadena: tabla) {
			System.out.println(cadena);
		}
		String fecha = "23/11/2022";
		String tabla1[] = fecha.split("/");
		for(String cadena: tabla1) {
			System.out.println(cadena);
		}

	}

}
