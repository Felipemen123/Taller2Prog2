package co.edu.unbosque.model;

public class Ejercicio2 extends Thread {

	private static int[][] matriz;
	private int ini, fin;

	public Ejercicio2(int ini, int fin) {
		this.ini = ini;
		this.fin = fin;
	}

	public Ejercicio2() {

	}

	public void run() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
			}
		}
	}


	public static int[][] getMatriz() {
		return matriz;
	}

	public static void setMatriz(int[][] matriz) {
		Ejercicio2.matriz = matriz;
	}

	public int getIni() {
		return ini;
	}

	public void setIni(int ini) {
		this.ini = ini;
	}

	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

}
