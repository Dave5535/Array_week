package se.lexicon;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {


        ex10();
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
// Write a program which will set up an array to hold the next values in this
//order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
//Expected output:Average is: 17.3
        double[] numArray = {43, 5, 23, 17, 2, 14};

        Printing.printNumbersAverage(numArray);
        //^^ This code is found in Printing.Java in the public static printNumbersAverage
    }

    public static void ex7() {
        //Write a program which will set up an array to hold 10 numbers and print
        //out only the uneven numbers.
        //Expected output:Array: 1 2 4 7 9 12
        //                Odd Array: 1 7 9
        int[] numArray = {43, 5, 23, 17, 2, 14, 1, 7, 3, 4};

        Arrays.sort(numArray);
//even Array 2 4 14
        Printing.printArrayEven(numArray);

        System.out.println("   ");
//odd Array 1 3 5 7 17 23 43
        Printing.printArrayOdd(numArray);

    }

    public static void ex8() {
        //Write a program which will remove the duplicate elements of a given
        //array [20, 20, 40, 20, 30, 40, 50, 60, 50].
        //Expected output:Array: 20 20 40 20 30 40 50 60 50
        //                Array without duplicate values: 20 40 30 50 60

        int[] numArray = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        Printing.printArraySideWay(numArray);
        System.out.println(" ");

        // This is the copy and I modified and changed the value on each "box"
        int[] numArray2 = Arrays.copyOf(numArray, numArray.length - 4);
        numArray2[0] = 20;
        numArray2[1] = 40;
        numArray2[2] = 30;
        numArray2[3] = 50;
        numArray2[4] = 60;
        Printing.printArraySideWay(numArray2);

    }

    public static void ex9() {
        //Write a method which will add elements in an array.
        // Remember that arrays are fixed in size so you need to come up with a
        //solution to “expand” the array.

        String[] names = new String[0]; // This is an empty Array
        Printing.addArrayExName(names, "Marcus"); // This create a new Array whit in this case a new name.
        Printing.addArrayExName(names, "Mikael");
        Printing.addArrayExName(names, "Mathias");
    }

    public static void ex10() {
        //Write a program which will represent multiplication table stored in
        //multidimensional array. Hint: You have two-dimensional array with values
        //[[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
        int[][] bordNumbers = new int[10][10];
        Multiplication_Table.infoMultibord(bordNumbers);

    }

    public static void ex11() {
        //Write a program that ask the user for an integer and repeat that
        //question until user give you a specific value that user already has been
        //told about as a message in your program. Store these values in an array
        //and print that array. After that reverse the array elements so that the
        //first element becomes the last element, the second element becomes
        //the second to last element, etc. Do not just reverse the order in which
        //they are printed. You need to change the way they are stored in the array.


    }
}















