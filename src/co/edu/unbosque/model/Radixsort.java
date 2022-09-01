package co.edu.unbosque.model;

import java.util.Arrays;

public class Radixsort {
 
    // A utility function to get maximum value in arr[]
    static int getMax(int arr[], int n)
    {
        int mayor = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mayor)
                mayor = arr[i];
        return mayor;
    }
 
    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(int arr[], int n, int mod)
    {
        int salida[] = new int[n]; // output array
        int ilocal;
        int store[] = new int[10];
        Arrays.fill(store, 0);
         // Store count of occurrences in count[]
        for (ilocal = 0; ilocal < n; ilocal++) {
            store[(arr[ilocal] / mod) % 10]++;
        }
      
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (ilocal = 1; ilocal < 10; ilocal++)
            store[ilocal] += store[ilocal - 1];
 
        // Build the output array
        for (ilocal = n - 1; ilocal >= 0; ilocal--) {
            salida[store[(arr[ilocal] / mod) % 10] - 1] = arr[ilocal];
            store[(arr[ilocal] / mod) % 10]--;
        }
 
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current
        // digit
        for (ilocal = 0; ilocal < n; ilocal++)
            arr[ilocal] = salida[ilocal];
    }
 
    // The main function to that sorts arr[] of
    // size n using Radix Sort
    public static void radixsort(int arreglo[], int n)
    {
        // Find the maximum number to know number of digits
    	long startTime = System.currentTimeMillis();
        int m = getMax(arreglo, n);
 
        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arreglo, n, exp);
            
        long endTime = System.currentTimeMillis() - startTime;
        radixsort(arreglo, n);
        print(arreglo, n);
        System.out.println("tiempo de ejecucion "+endTime);
    }
 
    // A utility function to print an array
    public static void print(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "este es elemento ");
    }
 
    // Main driver method
    
}
