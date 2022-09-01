package co.edu.unbosque.controller;


import co.edu.unbosque.model.QuickSort;
import co.edu.unbosque.model.Radixsort;
import co.edu.unbosque.model.TreeSort;
import co.edu.unbosque.view.VistaVentanas;
import co.edu.unbosque.model.CocktailSort;

public class Controller {
	
	private VistaVentanas vista;
	private QuickSort quick;

	private CocktailSort Cocktail;
	
	public Controller() {
			vista = new VistaVentanas();
			Cocktail = new CocktailSort();
			quick=new QuickSort();
			funcionar();

	}
	
	public void funcionar() {


	
			quick.principal();
	// System.out.println(num.generarAleatorio());
	 
		System.out.println("----------------------------");
		int x=0;
		while(x!=1) {
		String opcion =	vista.leerDatoString("escoja el algoritmo que usara 1.CoctailSort 2.QuickSort 3.TreeSort");
		int cantidad = vista.leerDatoEntero("escoja la cantidad");
		if (cantidad >0 && cantidad<= 60000000) {
			switch (opcion) {
				case "1":
					
					
					Cocktail.llamarlista(cantidad);
					
					break;
				case "2":
					
					break;
				case "3":
					
					break;
				case "4":
					
					break;
		
				default:
					break;
			
			}
		}else {vista.mostrarInformacionError("cantidad invalida");}
		}


	}

}
