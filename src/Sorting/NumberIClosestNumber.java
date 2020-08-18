package Sorting;

import java.io.*;
import java.util.*;

public class NumberIClosestNumber {
        static int[] closestNumbers(int[] arr) {
            int k=0;
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
            System.out.println("This is sorted array "+Arrays.toString(arr));
            HashSet<Integer> set=new HashSet<>();
            int diff=Math.abs(arr[1] - arr[0]);
            for(int i=0; i<arr.length-1;i++){
                int currdiff =Math.abs(arr[i+1] - arr[i]);
                if( currdiff < diff){
                    diff = currdiff;
                    set.clear();
                    set.add(i);
                }
                if(currdiff==diff){
                    set.add(i);
                }
            }
            int n = 2 * set.size();
            int[] finalarray = new int[n];
            int j=0;
            for(int i: set){
                finalarray[j]= arr[i];
                finalarray[j+1]=arr[i+1];
                j+=2;
            }
            System.out.println("This is set "+set);
            System.out.println("This is finalarray "+ Arrays.toString(finalarray));
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

            int[] result = closestNumbers(arr);

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

//EasyPb4 : Aug 17 10:55 am closest numbers
// Details : smallest absolute difference

//Approach : Step1 Sort the array
// 	Step2 Iterate through the each element,
//	Don't have to do this once sorted .Keep while loop inside to find the difference of one element with the rest
//	Step3 Keep a counter for the minimum difference
// Try Again Aug 18 9:17 am