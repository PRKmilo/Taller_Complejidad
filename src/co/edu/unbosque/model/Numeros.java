package co.edu.unbosque.model;


import java.util.Random;

public class Numeros {
	

	private int numeros[];

	public Numeros() {
		numeros= new int[6];
	}
	
	public void inicializarArreglo() {
		for(int i = 0; i < numeros.length ; i++) {
		
		numeros[i] =generarAleatorio();
	
		}
	}

	public int generarAleatorio() {
		
		int min = 1;
		int max = 1000;

		Random random = new Random();

		int numero= random.nextInt(max + min) + min;

		return numero;
	}
	

	
	
}
