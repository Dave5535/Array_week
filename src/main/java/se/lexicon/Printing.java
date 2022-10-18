package se.lexicon;

import java.lang.reflect.Array;
import java.util.Arrays;


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

    public static void printNumbersAverage(double[] numbers) {
        double sum = 0.0;

        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        System.out.format("The average is: %.2f", average);

    }

    public static void printArrayEven(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 == 0)
                System.out.println(numArray[i] + " ");
        }
    }

    public static void printArrayOdd(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 != 0)
                System.out.println(numArray[i] + " ");
        }
    }

    public static void addArrayExName(String[] source, String name) {

        String[] newArray = Arrays.copyOf(source, source.length + 1);
        newArray[newArray.length - 1] = name;
        for (String element : newArray) {
            System.out.println(element);
        }

    }




    }













