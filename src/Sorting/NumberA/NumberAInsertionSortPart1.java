package Sorting.NumberA;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberAInsertionSortPart1 {
        static void insertionSort1(int n, int[] arr) {
                for(int i=0; i<arr.length; i++){
                    int currlast = arr.length-2-i;
                    n = arr[arr.length-1];
                    System.out.println("This is currlast " + currlast + " value "+ arr[currlast] + " n "+ n);
                    if (n > arr[currlast]){
                       // arr[currlast+1]= arr[currlast];
                        System.out.println("THis is print n greater" + Arrays.toString(arr) );
                        break;
                    }
                    else{
                         arr[arr.length-1-i]= arr[arr.length-2-i];
                        System.out.println("THis is print" + Arrays.toString(arr) );
                    }
                }

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            insertionSort1(n, arr);

            scanner.close();
        }
    }

//Easy Problem1: 8:10 am
// Insert an element in the middle
//
//Approach: Iterate through the loop and see which array element is less than
// the given value and add it next to it.
//

// Class Arrays , toString method
// Class Solution
// Arrays.toString(arr);

