package Sorting.NumberA;

import java.util.Arrays;
import java.util.Scanner;

public class NumberAInsertionAnswer {
        static void insertionSort1(int n, int[] arr) {
            {
                int a=arr[n-1];         // last element
                for(int i=n-2;i>=0;i--)
                {
                    if(arr[i]<a)         // second last element
                    {                    // i.e. a is the greatest element
                        arr[i+1]=a;
                        print(arr);
                        break;
                    }
                    else
                    {
                        arr[i+1]=arr[i];  // now 8 moves one postion to the right
                        print(arr);
                        if(i==0)
                        {
                            arr[i]=a;
                            print(arr);
                        }
                    }
                }
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

            insertionSort1(n, arr);

            scanner.close();
        }
    }


