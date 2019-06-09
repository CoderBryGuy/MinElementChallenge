package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        int[] myArray = readIntegers(5);


        System.out.println(Arrays.toString(myArray));

        int minValue = findMin(myArray);

        printMinVal(minValue);
    }

    private static void printMinVal(int minValue) {
        System.out.println("The minimum value is :" + minValue);
    }

    private static int findMin(int[] array) {

        int minVal = array[0];

        for (int i = 1; i < array.length; i++) {
             if(array[i] < minVal){
               minVal = array[i];
             }
        }

        return minVal;
    }

    private static int[] readIntegers(int nElements) {

        int[] array = new int[nElements];

        System.out.println("Enter " +array.length+ " integers:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
