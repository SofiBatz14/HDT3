import java.io.*;
import java.util.*;


    class FileHandler {
        public static int[] generateRandomNumbers(int size) {
            int[] numbers = new int[size]; // Crear arreglo para los números
            Random rand = new Random(); // Inicializar generador de números aleatorios
            for (int i = 0; i < size; i++) {
                numbers[i] = rand.nextInt(10000); // Asignar número aleatorio al arreglo
            }
            return numbers;
        }

        public static void saveToFile(int[] numbers, String filename) {
            try (PrintWriter writer = new PrintWriter(new File(filename))) {
                for (int num : numbers) {
                    writer.println(num); // Escribir cada número en una nueva línea
                }
            } catch (IOException e) {
                e.printStackTrace(); // Imprimir traza de la excepción en caso de error
            }
        }

        public static int[] loadFromFile(String filename) {
            List<Integer> list = new ArrayList<>(); // Lista para almacenar los números leídos
            try (Scanner scanner = new Scanner(new File(filename))) {
                while (scanner.hasNextInt()) {
                    list.add(scanner.nextInt()); // Agregar cada número leído a la lista
                }
            } catch (IOException e) {
                e.printStackTrace(); 
            }
            return list.stream().mapToInt(i -> i).toArray(); // Convertir lista a arreglo y devolver
        }
    }
