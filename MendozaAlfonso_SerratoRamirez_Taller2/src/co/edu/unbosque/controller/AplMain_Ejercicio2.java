package co.edu.unbosque.controller;

import java.util.Scanner;

import co.edu.unbosque.model.Ejercicio2;

public class AplMain_Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int n,d;
		System.out.print("Introduzca número de filas: ");
		n = teclado.nextInt(Ejercicio2.getN());

		System.out.print("Introduzca número de columnas: ");
		d = teclado.nextInt(Ejercicio2.getD());

		System.out.println(n + "-" + d);
	}

}
