package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        int[] numberArray = {72, 43, 19, 90, 16, 75, 41, 35, 66, 38};
        int[] orderedNumberArray = {5, 25, 26, 27, 30, 33, 34, 40, 49, 65, 66, 68, 75, 78, 85, 88, 90, 91, 94, 95};
        int n = 3;
        //int nLength = numberArray.length;

        //int value = numberArray[3];
        int value  =  95;
        //new O1Array(n, numberArray);
        //new OnSequentialSearch(numberArray, value);
        //new OlogNBinarySearch();
        OlogNBinarySearch.getValuePlaceBinarySearch(orderedNumberArray, value);
    }
}