package Sorting;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberDRuntime {
        static int runningTime(int[] arr) {
            int count=0;
            int k=0;
            for (int i = 0; i < arr.length - 1; i++) {
                int j = i + 1;
                k =i;
                while(k>=0) {
                    int var = arr[k];
                    if (arr[k] > arr[j]) {
                        count++;
                        arr[k] = arr[j];
                        arr[k + 1] = var;
                        //System.out.println("Elements are moved by one postion");
                        k--;
                        j--;
                    } else {
                        break;
                    }
                }
            }
            System.out.println("This is count "+count);
            return count;
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

            int result = runningTime(arr);

            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
            //bufferedWriter.close();

            scanner.close();
        }
    }
