public class Main {
    public static void main(String[] args) {
//        Write a method that takes a String and a two chars.
//        As the result it returns the given String, where each
//        the first char was replaced by the second char. You have to use only length() and charAt()
//        methods of String class.For example:  “I always do my homework”, ‘a’, ‘A’ -> “I AlwAys do my homework”
        String str = "I always do my homework";
        System.out.println(str.replace('a', 'A')); // встроенный метод replace
        System.out.println(replace(str, 'a', 'A'));
//  Write method that checks whether a given string is a palindrome.
//  A palindrome is a phrase that reads the same from the front and the back.
        System.out.println(isPalindrom("1234321"));
//  Implement a method that returns the index of the biggest
//  element of a given array of int{10, 33, 3, 5, -9} -> 1
        int[] array = {10, 33, 3, 5, -9};
        System.out.println(indexOfMaxElement(array));
//        Implement a method that returns the sum of elements
//       of the given array of int{10, 3, 23, 5, -9} -> 32
        System.out.println(sumOfArray(new int [] {10, 3, 23, 5, -9} ));
        System.out.println(sumOfArray(array));
    }

    private static int sumOfArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    private static int  maxElement(int[] array) {
        int max = array[0];
        for (int i = 1; i <array.length; i++){
            if (array[i] > max ){
                max = array[i];
            }
        }
        return max;
    }

    private static int  indexOfMaxElement(int[] array) {
        int idx = 0;
        for (int i = 1; i <array.length; i++){
            if (array[i] > array[idx] ){
                idx = i;
            }
        }
        return idx;
    }

    private static boolean isPalindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            char leftChar = str.charAt(i); // 0,1
            char rightChar = str.charAt(str.length() - i -1); //6,5
            if (leftChar != rightChar) {
                return false;
            }
        }
        return true;
    }

    private static String replace(String oldString, char oldChar, char newChar) {
        String s = "";
        for (int i = 0; i < oldString.length(); i++) {
            char c = oldString.charAt(i);
            if (c == oldChar) {
                s = s + newChar;
            } else {
                s = s + c;
            }
        }
        return s;
    }
}
