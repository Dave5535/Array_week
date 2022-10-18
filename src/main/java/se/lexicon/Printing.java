package se.lexicon;

import java.lang.reflect.Array;

public class Printing {

    public static void printArray(int[] numbers) {
        int size = numbers.length;
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
    public static void printArraySideWay(int[] numbers) {
        int size = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            int number = (int) Array.get(numbers, i);
            System.out.print(number + " ");
        }
    }

    /*public static void printAny(String[] name){
        System.out.print();

    }

     */
}
