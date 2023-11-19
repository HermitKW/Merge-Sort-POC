package org.example;

public class OlogNBinarySearch {
    int OlogNBinarySearch(int[] orderedNumberArray, int left, int right, int value) {
        if(right >= 1){
            int mid = left + (right - left )/ 2;
            if (orderedNumberArray[mid] == value){
                return mid;
            }
            if (orderedNumberArray[mid] > value)
                return OlogNBinarySearch(orderedNumberArray, left, mid -1, value);
            if (orderedNumberArray[mid] < value)
                return OlogNBinarySearch(orderedNumberArray, mid+1, right, value );
        }
        return -1;

    }
    public static void getValuePlaceBinarySearch(int[] orderedNumberArray, int value){
        OlogNBinarySearch BinS = new OlogNBinarySearch();
        int length = orderedNumberArray.length;
        int result = BinS.OlogNBinarySearch(orderedNumberArray, 0, length-1, value);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println(
                    "Element is present at index " + result);
    }

}

//public class OlogNBinarySearch {
//
//    public OlogNBinarySearch(int[] orderedNumberArray, int value) {
//
//        int lengthOfArray = orderedNumberArray.length;
//        int indexOfMiddleNumber = (lengthOfArray / 2) - 1;
//
//        int valuePlace = 0;
//        if (orderedNumberArray[indexOfMiddleNumber] == value) {
//            System.out.print("Binary Search Value " + value + " ordered in " + (indexOfMiddleNumber + 1) + "  place");
//        } else if (orderedNumberArray[indexOfMiddleNumber] > value) {
//            for (int i = 0; i < indexOfMiddleNumber; i++) {
//                if (orderedNumberArray[i] == value) {
//                    valuePlace = i + 1;
//                    System.out.print("Binary Search Value " + value + " ordered in " + valuePlace + "  place");
//                }
//            }
//        } else if (orderedNumberArray[indexOfMiddleNumber] < value) {
//            for (int i = indexOfMiddleNumber; i < lengthOfArray; i++) {
//                if (orderedNumberArray[i] == value) {
//                    System.out.print("Binary Search Value " + value + " ordered in " + (i + 1) + "  place");
//                }
//            }
//        } if (valuePlace <= 0){
//            System.out.print("Cannot find value " + value + " in the array");
//        }
//    }
//}