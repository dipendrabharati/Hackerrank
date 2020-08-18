package Sorting;

import java.io.*;
import java.util.*;

public class NumberCCorrectness {

        public static void insertionSort(int[] A){
            int k=0;
            for(int i = 0; i < A.length-1; i++){
                    int j = i +1;
                    k =i;
                    while(k>=0){
                        int var = A[k];
                        if (A[k] > A[j]){
                            A[k] = A[j];
                            A[k+1]= var;
                            k--; j--;
                        }else{
                            break;
                        }
                    }
            }
            printArray(A);
        }


        static void printArray(int[] ar) {
            for(int n: ar){
                System.out.print(n+" ");
            }
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] ar = new int[n];
            for(int i=0;i<n;i++){
                ar[i]=in.nextInt();
            }
            insertionSort(ar);
        }
    }
