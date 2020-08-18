package Sorting;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberGCountingSort2 {
        static int[] countingSort(int[] arr) {
            int[] returnarr = new int[100];
            int[] finalarr = new int[arr.length];
            for( int i: arr){
                returnarr[i]=returnarr[i]+1;
            }
            //System.out.println("THis is Original Array"+ Arrays.toString(arr));
            //System.out.println("THis is returnarr "+ Arrays.toString(returnarr));
            int finalArrEle=0;

            for(int i=0; i<arr.length; i++) {
            int x = 0;
            int currReturnElement=returnarr[i];
            int currArrElement= i;
            //System.out.println("THis is the value of begining i "+ currArrElement);
            if (currReturnElement> 0) {
                while (finalArrEle < arr.length && x < currReturnElement) {
                    //System.out.println("This is the value of i "+i);
                    finalarr[finalArrEle] = currArrElement;
                    //System.out.println("THis is new added number " + finalarr[i]);
                    x++;
                    finalArrEle++;
                    //System.out.println("This is the value of i at the end "+i);
                }
            }
        }
            //System.out.print("This is output array" + Arrays.toString(finalarr));
            return arr;
    }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int[] result = countingSort(arr);

//            for (int i = 0; i < result.length; i++) {
//                bufferedWriter.write(String.valueOf(result[i]));
//
//                if (i != result.length - 1) {
//                    bufferedWriter.write(" ");
//                }
//            }
//
//            bufferedWriter.newLine();
//            bufferedWriter.close();

            scanner.close();
        }
    }

