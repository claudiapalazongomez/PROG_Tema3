package es.studium.TercerEjemploTablas;

public class TercerEjemploTablas
{

	public static void main(String[] args)
	{
		String paises[] = {"Alemania", "Bélgica", "Canadá", "Dinamarca", "España", "Finlandia"};
		System.out.println("**Paises**");
		//for(int i = 0; i < paises.length; i++)
		for(String pais: paises) {
			System.out.println(pais);
		}

	}

}
