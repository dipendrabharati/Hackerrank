package Sorting;

import java.io.*;
import java.util.*;

public class NumberJFindTheMedian {
        static int findMedian(int[] arr) {
            int k=0;
            int med=0;
            for (int i = 0; i < arr.length - 1; i++) {
                int j = i + 1;
                k =i;
                while(k>=0){
                    int var = arr[k];
                    if(arr[k] > arr[j]){
                        arr[k]= arr[j];
                        arr[k+1]= var;
                        //System.out.println("Elements are moved by one postion");
                        k--; j--;
                    }else{
                        break;
                    }
                }
            }
            med = (arr.length -1)/2;
            System.out.println("THis is med "+ arr[med]);
        return med;
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

            int result = findMedian(arr);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//            bufferedWriter.close();
            scanner.close();
        }
    }
// EasyFindTheMedian:August 18
// Details: 08:03 am
// middle element after sorting, same number of elements occur after it as before
// Given odd number of elements,
// return an integer, median

// Approach: Step1 : Sort the array
//
// Step 2: Find the median
