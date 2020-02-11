package co.edu.unbosque.model;

public class Ejercicio2  {

	private static int n;
	private static int d;
	private static int[][] matriz = new int[n][d];

	public Ejercicio2(int n, int d) {
		this.n = n;
		this.d = d;
	}

	public Ejercicio2() {

	}



	public static int getN() {
		return n;
	}

	public static void setN(int n) {
		Ejercicio2.n = n;
	}

	public static int getD() {
		return d;
	}

	public static void setD(int d) {
		Ejercicio2.d = d;
	}

	public static int[][] getMatriz() {
		return matriz;
	}

	public static void setMatriz(int[][] matriz) {
		Ejercicio2.matriz = matriz;
	}
	
	
	
}
