package se.lexicon;

public class Multiplication_Table {



        public static void infoMultibord(int[][] bordNumbers) {
    for (int i = 0; i < bordNumbers.length; i++) {
        for (int j = 0; j < bordNumbers.length; j++) {
            bordNumbers[i][j] = (i + 1) * (j + 1);  // this is the multiplier between the y and x axis.
        }
    }
    for (int i = 0; i < bordNumbers.length; i++) {
        for (int j = 0; j < bordNumbers.length; j++) {


            System.out.print(bordNumbers[i][j] + " ");
        }
        System.out.println("");
    }
}
}
