package es.studium.PrimerEjemploTablas;

public class PrimerEjemploTablas
{

	public static void main(String[] args)
	{
		//Declaración de la tabla
		//Dando contenido
		int tablaEnteros[] = new int[6]; //otra forma pero NO es la habitual: int tablaEnteros[] = {-2, 3, 5, 0, 33, 100}
		tablaEnteros[0] = -2;
		tablaEnteros[1] = 3;
		tablaEnteros[2] = 5;
		tablaEnteros[3] = 0;
		tablaEnteros[4] = 33;
		tablaEnteros[5] = 100;
		//Mostrar contenido
		for(int i = 0; i < tablaEnteros.length; i++) {
			System.out.println(tablaEnteros[i]);
		}

	}

}
