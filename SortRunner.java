import java.util.Arrays;

class SortRunner {
    public static void runSorts(int[] data) {
        int[] copy;
        
        copy = Arrays.copyOf(data, data.length);
        long start = System.nanoTime();
        Sorts.insertionSort(copy);
        long end = System.nanoTime();
        System.out.println("Insertion Sort: " + (end - start) / 1e6 + " ms");
        
        copy = Arrays.copyOf(data, data.length);
        start = System.nanoTime();
        Sorts.mergeSort(copy);
        end = System.nanoTime();
        System.out.println("Merge Sort: " + (end - start) / 1e6 + " ms");
        
        copy = Arrays.copyOf(data, data.length);
        start = System.nanoTime();
        Sorts.quickSort(copy, 0, copy.length - 1);
        end = System.nanoTime();
        System.out.println("Quick Sort: " + (end - start) / 1e6 + " ms");
        
        copy = Arrays.copyOf(data, data.length);
        start = System.nanoTime();
        Sorts.radixSort(copy);
        end = System.nanoTime();
        System.out.println("Radix Sort: " + (end - start) / 1e6 + " ms");
    }
}