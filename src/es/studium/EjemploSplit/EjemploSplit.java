package es.studium.EjemploSplit;

public class EjemploSplit
{

	public static void main(String[] args)
	{
		String texto = "En un lugar de La Mancha ...";
		String tabla[] = texto.split(" "); //se quiere separar por cada espacio en blanco y te elimina los espacios. SI yo pusiese una n x ej, me quitaría las n y me daría un salto de línea
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
