package co.edu.unbosque.controller;

import java.util.Random;

import co.edu.unbosque.model.Ejercicio2;

public class AplMain_Ejercicio2 {

	public static void main(String[] args) {
		
		Ejercicio2 x = new Ejercicio2();
		Ejercicio2 principal = new Ejercicio2();
		Runtime runtime = Runtime.getRuntime();
		int procesadoresLogicos = runtime.availableProcessors();

		Random rand = new Random(System.nanoTime());
		
		int[][] matriz = principal.getMatriz();
		
		for (int i = principal.getIni(); i < principal.getFin(); i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = rand.nextInt(10);
			}
		}
	}
	
}
