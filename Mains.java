

public class Mains {
    public static void main(String[] args) {
        int size = 3000;// Cantidad de números a generar
        int[] numbers = FileHandler.generateRandomNumbers(size); // Genera números aleatorios
        FileHandler.saveToFile(numbers, "numbers.txt"); // Guarda en archivo
        
        int[] data = FileHandler.loadFromFile("numbers.txt"); // Carga los datos desde el archivo
        
        // Aplica algoritmos de ordenamiento
        SortRunner.runSorts(data);
    }
}
