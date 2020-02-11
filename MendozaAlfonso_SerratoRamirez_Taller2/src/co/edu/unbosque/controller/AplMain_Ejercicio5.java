package co.edu.unbosque.controller;

import java.util.Scanner;

public class AplMain_Ejercicio5 {
	public static void main(String[] args) {

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
