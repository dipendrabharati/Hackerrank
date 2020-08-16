package Strings.NumberI;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberIDiscussionSolution {

    static void separateNumbers(String s) {
        boolean valid = false;
        long firstx = -1;


        for (int i=1; i<=s.length()/2; ++i) {          // when i =1, you take 9, when i=2, you take 99
            long x = Long.parseLong(s.substring(0,i));
            firstx = x;                                //first element


            String test = Long.toString(x);             // same element as new string

            while (test.length() < s.length()) {
                test += Long.toString(++x);             // 9 , 9+10 = 910, 910+11, 91011,.....
            }

            if (test.equals(s)) {                        // if the new string is equal to original string
                valid = true;
                break;
            }
        }
        System.out.println(valid ? "YES " + firstx : "NO");
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            separateNumbers(s);
        }
        scanner.close();
    }
}

