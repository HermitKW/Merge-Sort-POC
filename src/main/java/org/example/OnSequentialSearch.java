package org.example;

public class OnSequentialSearch {
    public OnSequentialSearch(int[] numberArray, int value) {
        for (int i = 0; i < numberArray.length; i++) {
            if(numberArray[i] == value){
                System.out.print("Sequential Search Value " + value + " ordered in " + i + "  place");
                break;
            }else{
                System.out.print("Cannot find value " + value + "in the array");
            }

        }
    }
}
