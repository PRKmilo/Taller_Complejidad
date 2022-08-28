package co.edu.unbosque.controller;

import co.edu.unbosque.model.Numeros;
import co.edu.unbosque.model.QuickSort;
import co.edu.unbosque.view.VistaVentanas;

public class Controller {
	
	private VistaVentanas vista;
	private QuickSort quick;

	
	public Controller() {
		vista = new VistaVentanas();

		quick=new QuickSort();
		funcionar();
	}
	
	public void funcionar() {

		quick.principal();
// System.out.println(num.generarAleatorio());
 
	System.out.println("----------------------------");

	}

}
