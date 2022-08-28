package co.edu.unbosque.model;

public class QuickSort {
	
	  /* Esta función toma el ultimo elemento como
    pivote, coloca el pivote en la posición correcta
    en el array ordenado, y coloca todos los más 
    pequeñps (Más pequeños que el pivote) a la izquierda
    del pivote, y todos los más grandes a la derecha del
    pivote*/
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Indice del elemento más pequeño
        for (int j = low; j < high; j++) {
            /*Si el actual elemento es más pequeño
            p igual que el pivote*/
            if (arr[j] <= pivot) {
                i++;
                //intercambia arr[i] y arr[j] 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Intercambia arr[i+1] y arr[high] (o pivote) 
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /*arr[] --> Array que sera ordenado, 
      low  --> indice inicial, 
      high  --> indice final */
    static void sort(int arr[], int low, int high) {
        if (low < high) {
            /* pi esta particionando indices, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high);
            // Recursivamente ordena elementos antes de 
            // la partición y despues de la partición
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
    /* Imprimir array */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        sort(arr, 0, n - 1);
        System.out.println("Array ordenado");
        printArray(arr);
    }

}