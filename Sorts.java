import java.util.Arrays;

class Sorts {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Elemento a insertar 
            int j = i - 1; // Mover elementos mayores que la clave una posición adelante
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; // Insertar la clave en la posición correcta
        }
    }
    
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2; // Encontrar punto medio del arreglo
        int[] left = Arrays.copyOfRange(arr, 0, mid); // Crear subarreglo izquierdo
        int[] right = Arrays.copyOfRange(arr, mid, arr.length); // Crear subarreglo derecho
        mergeSort(left); //Ordenar izquierdo
        mergeSort(right); // Ordenar derecho
        merge(arr, left, right); // Combinalos ya ordenados
    }
    
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0; // Combinar elementos de izquiero y derecho en arr
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Seleccionar el pivote
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
    
    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt(); }}
