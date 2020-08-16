package Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberMBeautifulBinaryString {
    static int beautifulBinaryString(String b) {
            int count =0;

        for(int i=0; i<b.length(); i++) {
            if (i + 3 <= b.length()) {

                String s = b.substring(i, i + 3);

                if (s.equals("010")) {
                    System.out.println("This is match " + s);
                    count++;
                    i=i+2;
                } else {
                    System.out.println(s);
                }
            }
        }
        System.out.println("The count value"+ count);
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String b = scanner.nextLine();

        int result = beautifulBinaryString(b);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
