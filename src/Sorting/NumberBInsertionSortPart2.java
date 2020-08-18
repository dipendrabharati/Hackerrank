package Sorting;

import java.util.*;
public class NumberBInsertionSortPart2 {
        static void insertionSort2(int n, int[] arr) {
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
                print(arr);
            }
        }
    static void print(int a[])
    {
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
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
            insertionSort2(n, arr);
            scanner.close();
        }
    }

// EasyPb2 : 10:35am
// Details: build up a sorted array one at a time
// print whenever the next element has been inserted at the correct position
// Approach:
// 3 4 7 5 6 2 1
// 4 comp 3 , 4 is greater so go to next
// 7 comp 4 , 7 is greater so got to next
// 5 comp 7,  swap their postion
// 6 comp 7, swap their position
// 2 comp 7, 2 comp 6, 2 comp 5, 2 comp 4, 2 comp 3
// same for 1 as well