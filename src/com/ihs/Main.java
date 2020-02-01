package com.ihs;

public class Main {

    public static void main(String[] args) {

// Print all subarrays of a given array

        int[] ar = {1, 2, 3, 4, 5};

        int array = ar.length;

        for (int starter = 0; starter < array; starter++) {
            for (int grouper = starter; grouper <= array; grouper++) { // grouping numbers.
                for (int toScreen = starter; toScreen < grouper; toScreen++) { // print nums.
                    System.out.print(ar[toScreen] + " ");
                }
                System.out.println("");
            }
        }
    }
}
