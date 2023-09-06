package unlam.c2023.ej002;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola soy Main");
		
		boolean pregunta = true;
		
		if(pregunta && 1 != 1)
		{
		//Codigo por True
			
			System.out.println("La respuesta es verdadera");
			//ANIDAR (se puede simplificar con un AND (&&))	
			if (1 == 1)

			{
				System.out.println("La respuesta due verdadera adentro");
			}
		}
		else
		{
		//Codigo por false
			System.out.println("La respuesta es falsa");
		}
	}

}
