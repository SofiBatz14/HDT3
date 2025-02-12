import java.io.*;
import java.util.*;


    class FileHandler {
        public static int[] generateRandomNumbers(int size) {
            int[] numbers = new int[size];
            Random rand = new Random();
            for (int i = 0; i < size; i++) {
                numbers[i] = rand.nextInt(10000);
            }
            return numbers;
        }

        public static void saveToFile(int[] numbers, String filename) {
            try (PrintWriter writer = new PrintWriter(new File(filename))) {
                for (int num : numbers) {
                    writer.println(num);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static int[] loadFromFile(String filename) {
            List<Integer> list = new ArrayList<>();
            try (Scanner scanner = new Scanner(new File(filename))) {
                while (scanner.hasNextInt()) {
                    list.add(scanner.nextInt());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return list.stream().mapToInt(i -> i).toArray();
        }
    }
