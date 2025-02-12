import java.util.Arrays;

class SortRunner {
    public static void runSorts(int[] data) {
        int[] copy; // Arreglo para almacenar copias de los datos originales
        
        copy = Arrays.copyOf(data, data.length);
        long start = System.nanoTime();
        Sorts.insertionSort(copy);
        long end = System.nanoTime();
        System.out.println("Insertion Sort: " + (end - start) / 1e6 + " ms"); // Variables para medir el tiempo de ejecución
        
        copy = Arrays.copyOf(data, data.length); // Crear una copia de los datos
        start = System.nanoTime(); // Registrar tiempo de inicio
        Sorts.mergeSort(copy); //  Insertion Sort ejecutar 
        end = System.nanoTime(); // Registrar tiempo de finalización
        System.out.println("Merge Sort: " + (end - start) / 1e6 + " ms");  //  Tiempo en milisegundos
        
        copy = Arrays.copyOf(data, data.length); // Nueva copia de los datos y con todos los demas pasos de antes
        start = System.nanoTime();
        Sorts.quickSort(copy, 0, copy.length - 1);
        end = System.nanoTime();
        System.out.println("Quick Sort: " + (end - start) / 1e6 + " ms");
        
        copy = Arrays.copyOf(data, data.length); // Nueva copia de los datos y con todos los demas pasos de antes
        start = System.nanoTime();
        Sorts.radixSort(copy);
        end = System.nanoTime();
        System.out.println("Radix Sort: " + (end - start) / 1e6 + " ms");
    }
}
