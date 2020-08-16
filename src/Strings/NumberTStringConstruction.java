package Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberTStringConstruction {
        static int stringConstruction(String s) {
            Set<String> set1 = new TreeSet<String>();

            for(int i=0; i<s.length();i++){
                String checkstr = String.valueOf(s.charAt(i));
                if(!set1.contains(checkstr)) {
                    set1.add(checkstr);
                }
            }
            System.out.println("This is final value "+set1.size());
        return set1.size();
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int q = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int qItr = 0; qItr < q; qItr++) {
                String s = scanner.nextLine();

                int result = stringConstruction(s);

                //bufferedWriter.write(String.valueOf(result));
                //bufferedWriter.newLine();
            }
            //bufferedWriter.close();

            scanner.close();
        }
    }

