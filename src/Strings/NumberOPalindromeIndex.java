package Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberOPalindromeIndex{
    static int palindromeIndex(String s) {
        String s1 = "";
        String s2 = "";
        int count = 0;
        int n = s.length();
        //System.out.println("this is length "+n);
        // System.out.println("This char to be removed "+ String.valueOf(s.charAt(44)));
        int palv = 0;

        if (s.length() % 2 == 1) {
            int n1 = (n + 1) / 2 - 1;
            s1 = s.substring(0, n1);
        }
        if (n % 2 == 0) {
            int n1 = n / 2;
            s1 = s.substring(0, n1);
        }
        for (int i = 0; i < s1.length(); i++) {
            String a = String.valueOf(s.charAt(i));
            String b = String.valueOf(s.charAt(n - 1 - i));

            if (!a.equals(b)) {
                palv++;
                // System.out.println("Change needed position " + i);
                // System.out.println("This is req changes " + palv);
            }
        }
        if (palv == 0) {
            count = -1;
        }
        if (palv != 0) {
            for (int i = 0; i < s1.length(); i++) {
                int j = (s.length() - 1) - i;

                if (s1.charAt(i) != s.charAt(j)) {
                    if (s1.charAt(i) == s.charAt(i + 1)) {
                        count = j;
                    } else {
                        count = i;
                        break;
                    }
                    System.out.println("The postion of char " + count);
                }
            }
        }
        System.out.println("This is value " + count);

        return count;

    }
    // Copied correct answer
//    static int palindromeIndex(String s) {
//        int l = s.length();
//        int i,j,a,b;
//        for (i=0, j=l-1; i<l; i++,j--){
//            if (s.charAt(i)!=s.charAt(j))
//                break;
//        }
//        if (i>j) return -1;
//
//        for (a = i+1, b = j;a<j && b>i+1; a++,b--){
//            if (s.charAt(a)!=s.charAt(b))
//                return j;
//        }
//        return i;
//    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}
