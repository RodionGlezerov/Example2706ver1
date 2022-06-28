import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int[] mas = inputArray(10);
        for (int i = 0; i <mas.length; i++){
            System.out.println(mas[i]);
        }
        System.out.println(Arrays.toString(mas)); // Вывод массива в виде строки
        Arrays.sort(mas); // сортировка массива mas по возрастанию элементов
        System.out.println(Arrays.toString(mas));
        int[] mas2 =  Arrays.copyOf(mas, 5); // копирование массива mas в новый массив mas2
        System.out.println(Arrays.toString(mas2));
        int[] mas3 = Arrays.copyOfRange(mas, 2,5);
        System.out.println(Arrays.toString(mas3));

    }

    // Написать метод, который создает массив, указанной длинны и заполняют его
    // элемент с клавиатуры

    private static int[] inputArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
