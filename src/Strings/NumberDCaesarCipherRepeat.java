package Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class NumberDCaesarCipherRepeat {
    static String caesarCipher(String s, int k) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, String> map3 = new HashMap<>();
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String out = "";
        int pos = 0;

        for (int i = 1; i < lowercase.length(); i++) {
            String strval1 = String.valueOf(lowercase.charAt(i));
            String strval2 = String.valueOf(uppercase.charAt(i));
            map1.put(strval1, i);
            map2.put(strval2, i);
        }
        System.out.println("This is map1" + map1);
        System.out.println("This is map2 " + map2);

        for (int i = 0; i < s.length(); i++) {
            String s1 = String.valueOf(s.charAt(i));
            boolean b = !(lowercase.contains(s1)) && !(uppercase.contains(s1));

            if (k == 3) {
                if (lowercase.contains(s1)) {
                    if (map3.containsKey(s1)) {
                        out = out + map3.get(s1);
                    } else {
                        if (k > 26) {
                            k = k % 26;
                        }
                        pos = map1.get(s1) + k;
                        if (pos >= 26) {
                            pos = pos % 26;
                        }
                        //String addchar = map1.
                       // out = out + addchar;
                    }
                }

                if (uppercase.contains(s1)) {
                    if (map3.containsKey(s1)) {
                        out = out + map3.get(s1);
                    } else {
                        if (k > 26) {
                            k = k % 26;
                        }
                        pos = uppercase.indexOf(s1) + k;
                        if (pos >= 26) {
                            pos = pos % 26;
                        }
                        String addchar = String.valueOf(uppercase.charAt(pos));
                        out = out + addchar;
                    }
                }
                if (b) {
                    out = out + s1;
                }
                System.out.println("This is out " + out);
            }
        }
        return "hi";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
//EasyProblem: Caesar Cipher
// 0 = a , 1 = b, c =2 , d = 3.......z= 25
// z= 25 + k =3, total =28, 28 % 26 = 2 , c
// 16 = p, k = 62 , total =p + k= 88, 88% 26 =  88-78= 10, 10 = j
// 62 % 26 = 10
