package Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberQMakingAnagrams {
    static int makingAnagrams(String s1, String s2) {
        int finalint=0;
        int lens1=0, lens2=0;
        int count =0;
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i < alpha.length(); i++){

            String curr = String.valueOf(alpha.charAt(i));
            if(s1.contains(curr) && s2.contains(curr)){
                count++;
            }
        }
        System.out.println("this is count "+ count);
        lens1= s1.length() - count;

        lens2= s2.length() -count;
        System.out.println("This is lens1 "+ lens1 + " This is lens2 "+lens2);
        finalint = lens1+lens2;
        System.out.println("This is final int "+ finalint);

    return finalint;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
