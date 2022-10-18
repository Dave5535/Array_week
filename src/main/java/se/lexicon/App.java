package se.lexicon;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {


    public static void main(String[] args) {
        String[] stringArray = new String[3];
        int[] numbers = new int[]{2, 4, 6, 8};
        char[] letters = {'J', 'A', 'V', 'A'};

        ex6();

    }


    public static void ex1() {
//Write a program which will store elements in an array of type ‘int’
        //and print it out. Expected output:11 23 39 etc.
        // Declaring and defining an int array
        int[] numbers = {11, 23, 39};
        Printing.printArraySideWay(numbers);


    }

    public static void ex2() {
        //Create a program and create a method with name ‘indexOf’ which will
        //find and return the index of an element in the array. If the element
        //doesn’t exist your method should return -1 as value.
        //Expected output:Index position of number 5 is: 2.
        String result = NameStorage.findName("noel");
        System.out.println("----------");
        System.out.println("Results " + result);
        System.out.println("----------");

    }

    public static void ex3() {
        //Write a program which will sort string array.
        //Expected output: String array: [Paris, London, New York, Stockholm]
        //Sort string array: [London, New York, Paris, Stockholm]
        String[] cities = {"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(cities);
        for (String city : cities) {
            System.out.println(city);
        }
        ;


    }

    public static void ex4() {
        //Write a program which will copy the elements of one array intoanother array.
        //Expected output:Elements from first array: 1 15 20
        //                Elements from second array: 1 15 20
        int[] array1 = {1, 15, 20};
        Printing.printArraySideWay(array1);
        System.out.println(" "); // I did not know If the first and the second should be on the same line but I made them on different so it would be easier to spot the similarity.
        int[] array2 = Arrays.copyOf(array1, 3);

        Printing.printArraySideWay(array2);


    }

    public static void ex5() {
// Create a two-dimensional string array [2][2]. Assign values to the 2-dimentionalarray containing any Country and City.
// Expected output: France Paris
//                  Sweden Stockholm

        String[][] cityToCountry = new String[2][2];
        cityToCountry[0][0] = "France";
        cityToCountry[0][1] = "Paris";
        cityToCountry[1][0] = "Sweden";
        cityToCountry[1][1] = "Stockholm";
        for (int i = 0; i < cityToCountry.length; i++) {
            for (int j = 0; j < cityToCountry[i].length; j++) {
                System.out.println(cityToCountry[i][j] + "\t");
/*      This code is if you want the text to be like   France Paris
//                                                     Sweden Stockholm
        System.out.println(cityToCountry[0][0] + " " + cityToCountry[0][1] );
        System.out.println(cityToCountry[1][0] + " " + cityToCountry[1][1] );
        */
            }
            System.out.println("\n");
        }


    }

    public static void ex6() {

System.out.println("hello");
    }
}