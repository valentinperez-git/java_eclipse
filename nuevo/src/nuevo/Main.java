package nuevo;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("inserte una palabra: ");
		String palabra = entrada.nextLine();
		System.out.println("su palabra es: " + palabra);
		
		char letra;
		System.out.println("inserte una letra:");
		letra = entrada.next().charAt(0);
		System.out.println("su letra es: " + letra);
	}
}																																					
