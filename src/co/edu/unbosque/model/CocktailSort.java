package co.edu.unbosque.model;
import java.lang.Math;
public class CocktailSort {
	 static void hacerlista(int lista[]) {
	        boolean caso = true;
	        int n;
	        int start = 0;
	        int end = lista.length;
	        while (caso == true) {
	            // Resetea la bandera intercambiada al entrar
	            // en el ciclo, porque puede ser true de la
	            // anterior iteración
	            caso = false;
	            // Ciclo del fondo a encima igual
	            // que bubble sort
	            for (int i = 0; i < end - 1; ++i) {
	                if (lista[i] > lista[i + 1]) {
	                  n  = lista[i];
	                  lista[i] = lista[i + 1];
	                  lista[i + 1] = n;
	                  caso = true;
	                }
	            }
	            // Si nada fue movido, array esta ordenado
	            if (caso == false) {
	                break;
	            }
	            // de otra forma, resetea la bandera intercambiada
	            // de tal forma que pueda ser usada en el
	            //siguiente proceso
	            caso = false;
	            // Mueve el punto final atras en uno, porque
	            // el item al final esta en la derecha completa
	            end = end - 1;
	            // from top to bottom, doing the
	            // same comparison as in the previous stage
	            for (int i = end - 1; i >= 0; i--) {
	                if (lista[i] > lista[i + 1]) {
	                    n = lista[i];
	                    lista[i] = lista[i + 1];
	                    lista[i + 1] = n;
	                    caso = true;
	                }
	            }
	            // Incrementa el punto inicial, por que
	            // la ultima fase pudo haber movido el siguiente
	            // más pequeño número en la derecha completa
	            start = start + 1;
	        }
	    }
	    /* Imprime el array*/
	    static void printArray(int a[]) {
	        int n = a.length;
	        for (int i = 0; i < n; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println();
	    }
	    public void llamarlista(int cantidad) {
	    	long start = System.nanoTime();
	      	int a[] = new int [cantidad];
	    	for(int i = 0;i<cantidad;i++) {
	    	a[i]= (int) (Math.random()*10+1);
	    	}
	    	//int a[] = {5, 1, 4, 2, 8, 0, 2};
	    	//System.out.println("Arreglo desordenado");
	    	//printArray(a);
	    	hacerlista(a);
	       // System.out.println("Arreglo ordenado");
	       // printArray(a);
	    	long end = System.nanoTime();
	    	long total = end - start;
	    	System.out.println(total);
	    }
	}