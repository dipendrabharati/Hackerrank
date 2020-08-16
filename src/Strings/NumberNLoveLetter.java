package Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberNLoveLetter {
    static int theLoveLetterMystery(String s) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Character, Integer> map = new HashMap<>();
        int palv = 0;
        String s1 = "";
        String s2 = "";
        int n = s.length();
        int count =0;
        for( int i=0; i<alpha.length(); i++){
            map.put(alpha.charAt(i),i+1);
        }
        System.out.println("This is map "+ map);
        if (s.length() % 2 == 1) {
            int n1 = (n+1) / 2 -1;
            s1 = s.substring(0,n1);
        }
        if (n% 2 == 0) {
            int n1 = n / 2;
            s1 = s.substring(0, n1);
        }
        for (int i = 0; i < s1.length(); i++) {
            String a = String.valueOf(s.charAt(i));
            String b = String.valueOf(s.charAt(n - 1 - i));

            if (!a.equals(b)) {
                palv++;
                System.out.println("Change needed position " + i);
                System.out.println("This is req changes " + palv);
            }
        }
        if ( palv!=0){
                for(int i=0; i<s1.length(); i++) {
                     int j = (s.length()-1) -i;

                     if (s.charAt(i) != s.charAt(j)) {

                         if (map.get(s.charAt(i)) > map.get(s.charAt(j))) {
                             count += map.get(s.charAt(i)) - map.get(s.charAt(j));
                             System.out.println(" s1 " + String.valueOf(s.charAt(i)) + " s2 " + String.valueOf(s.charAt(j)));
                         }else{
                             count += map.get(s.charAt(j)) - map.get(s.charAt(i));
                             System.out.println(" s1 " + String.valueOf(s.charAt(i)) + " s2 " + String.valueOf(s.charAt(j)));
                         }
                     }
                 }
        }
            System.out.println("This is value "+ count);
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            int result = theLoveLetterMystery(s);
            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }
        //bufferedWriter.close();
        scanner.close();
    }
}
//Easy Problem2: Approach: 8:50 am
// d to c, single operation, minimum operation to change it into a palindrome
// cde , e to d, d to c
// return integer

// map the letters from a to c
//Check if it is palindrome or not , if it return 0 else
// odd : create substrings , even: create substrings
// Compare element, ele1val > ele2val, then ele1 = ele2 , count =ele1val - ele2val

//values: d=4, c=3, diff =4-3
// d > a, d ==> a , diff = 4- 1= 3
