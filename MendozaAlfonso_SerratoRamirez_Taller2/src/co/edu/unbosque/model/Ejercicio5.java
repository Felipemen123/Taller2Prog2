package co.edu.unbosque.model;
import java.util.Scanner;

public class Ejercicio5 {

	public void invertirPalabra() {
		Scanner s = new Scanner(System.in);
		String palabra;
		String palabrainvertida = "";
		System.out.println("Ingresa una palabra y se mostrara a la inversa:\n");
		palabra = s.nextLine();
		
		for (int i = palabra.length()-1; i >= 0; i--) {
			palabrainvertida = palabrainvertida + palabra.charAt(i);
		}

		System.out.println("La palabra invertida es:\n" + palabrainvertida);
	}
	
	
	
}
