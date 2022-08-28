package co.edu.unbosque.controller;

import co.edu.unbosque.model.Numeros;
import co.edu.unbosque.model.QuickSort;
import co.edu.unbosque.view.VistaVentanas;

public class Controller {
	
	private VistaVentanas vista;
	private QuickSort quick;
	private Numeros num;
	
	public Controller() {
		vista = new VistaVentanas();
		num=new Numeros();
		quick=new QuickSort();
		funcionar();
	}
	
	public void funcionar() {

// System.out.println(num.generarAleatorio());
 
		num.inicializarArreglo();
		
		quick.principal(null);
	System.out.println("----------------------------");

	}

}
