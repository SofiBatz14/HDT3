

public class Mains {
    public static void main(String[] args) {
        int size = 3000;
        int[] numbers = FileHandler.generateRandomNumbers(size);
        FileHandler.saveToFile(numbers, "numbers.txt");
        
        int[] data = FileHandler.loadFromFile("numbers.txt");
        
        // Aplicando algoritmos de ordenamiento
        SortRunner.runSorts(data);
    }
}