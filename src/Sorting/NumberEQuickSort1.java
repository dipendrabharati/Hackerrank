package Sorting;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    public class NumberEQuickSort1 {
        static int[] quickSort(int[] arr) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            int pivot = arr[0];

            for(int i=1; i<arr.length; i++){
            if(arr[i]<pivot) {
                if (list1.isEmpty()) {
                    list1.add(arr[i]);
                } else {
                    int n = list1.size();
                    int k = n - 1;
                    int lastele = list1.get(k);
                    int currele = arr[i];

                    while (k >= 0) {
                        if (currele >= lastele) {
                            
                            break;
                        }else {
                            k--;
                        }
                    }
                }
            }
            if(arr[i]>pivot){
                list2.add(arr[i]);
            }
        }
            list1.add(pivot);
            list1.addAll(list2);
            for(int i=0; i<list1.size();i++){
                arr[i]=list1.get(i);
            }
            System.out.println("This is final arrray "+ Arrays.toString(arr));
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

            int[] result = quickSort(arr);

//            for (int i = 0; i < result.length; i++) {
//                bufferedWriter.write(String.valueOf(result[i]));
//
//                if (i != result.length - 1) {
//                    bufferedWriter.write(" ");
//                }
//            }
//
//            bufferedWriter.newLine();
//
//            bufferedWriter.close();

            scanner.close();
        }
    }

