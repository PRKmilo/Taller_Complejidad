package co.edu.unbosque.model;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {

  
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); 
        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;
           
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
  
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    public static void sort(int arr[], int low, int high) {
        if (low < high) {
  
            int pi = partition(arr, low, high);
          
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
    
    /* Imprimir array */
    public static  void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
	public   int generarAleatorio() {
		int min = 1;
		int max = 1000;
		Random random = new Random();
		int numero= random.nextInt(max + min) + min;

		return numero;
	}
	
	

    public  void funcionar() {
    	int arr[];
    	
    	Scanner sc=new Scanner (System.in);
    	System.out.println("Cuantos numeros desea que contenga el arreglo ?");
    	int a=sc.nextInt();
    	int tam=a;
    	arr = new int[tam];
    	for(int i = 0; i < arr.length ; i++) {
    		
    		arr[i] =generarAleatorio();
    	
    		}
        int n = arr.length;
        sort(arr, 0, n - 1);
        System.out.println("Array ordenado");
        printArray(arr);
    }
}
