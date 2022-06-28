import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        //Демонстрация передачи параметров в метод по ссылке
        int[] array = {1, 2, 3};
        System.out.println("In main before" + Arrays.toString(array));
        changeArray(array);
        System.out.println("In main after" + Arrays.toString(array));
    }

    private static void changeArray(int[] mas) {
        System.out.println("In change before" + Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            mas[i] = mas[i] * mas[i];
        }
        System.out.println("In change after" + Arrays.toString(mas));
    }
}
