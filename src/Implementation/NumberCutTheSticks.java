package Implementation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberCutTheSticks {
    static int[] cutTheSticks(int[] arr) {
        List<Integer>intlist= new ArrayList<>();
        intlist.add(arr.length);

        List<Integer> intlist1 = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            intlist1.add(arr[i]);
        }
        Collections.sort(intlist1);
        System.out.println("This is sorted list1 "+ intlist1);

            int sticksLeft = arr.length;
            int currCount =0;
            int curr = intlist1.get(0);
            System.out.println("this is addlist "+sticksLeft);

            for (int i = 0; i < intlist1.size(); i++) {  // go through each element

                if (curr == intlist1.get(i)) {                  // whenever the value of the position becomes zero, remember that postion
                    currCount++;
                } else{
                    sticksLeft -= currCount;
                    currCount=1;
                    curr = intlist1.get(i);
                    System.out.println("this is addlist "+sticksLeft);
                    intlist.add(sticksLeft);
                }
            }
        int[] a =new int[intlist.size()];
            for(int i=0; i <intlist.size(); i++){
                a[i] = intlist.get(i);
            }
            System.out.println("This is array "+ Arrays.toString(a));
    return a;
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

        int[] result = cutTheSticks(arr);

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }

      //  bufferedWriter.newLine();

       // bufferedWriter.close();

        scanner.close();
    }
}
