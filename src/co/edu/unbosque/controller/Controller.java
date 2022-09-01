package co.edu.unbosque.controller;


import co.edu.unbosque.model.QuickSort;
import co.edu.unbosque.model.Radixsort;
import co.edu.unbosque.model.TreeSort;
import co.edu.unbosque.view.VistaVentanas;

public class Controller {
	
	private VistaVentanas vista;
	private QuickSort quick;
	private Radixsort radix;
	private TreeSort tree;

	
	public Controller() {
		vista = new VistaVentanas();
		tree=new TreeSort();
		//quick=new QuickSort();
		radix=new Radixsort();
		//funcionar();
		//int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        //int n = arr.length;
        //System.out.println("numero aleatorio "+ (int) (Math.random() * 900) + 1);
        //int arr2[]=new int[60000000];
        //for(int i=0;i<60000000;i++) {
        	//arr2[i]=(int) (Math.random() * 900) + 1;
        //}
        // Function Call 
        //System.out.println("antes de funcion");
        //radix.radixsort(arr2, 60000000);
        //radix.print(arr2, 60000000);
        //System.out.println("despues de la funcion");
		int arr3[]=new int[60000000];
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=(int) (Math.random() * 900) + 1;
		}
		long startTime = System.currentTimeMillis();
       for(int i=0;i<60000000;i++) {
    	   tree.insertar(arr3[i]," ");
       }
       tree.recorrer(tree.raiz);
        tree.regreso();
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("tiempo de ejecucion "+endTime);
        	
	}
	
	public void funcionar() {

		
// System.out.println(num.generarAleatorio());
 
	System.out.println("----------------------------");

	}

}
