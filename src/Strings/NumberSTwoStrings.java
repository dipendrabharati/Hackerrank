package Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberSTwoStrings {
        static String twoStrings(String s1, String s2) {
          String returnstr="NO";
//            for(int i=0; i<s1.length();i++){
//                String checkstr = String.valueOf(s1.charAt(i));
//                if(s2.contains(checkstr)){
//                    returnstr="YES";
//                    break;
//                }
//            }
            Set<String> set1 = new TreeSet<String>();
            Set<String> set2 = new TreeSet<String>();
            for(int i=0; i<s1.length();i++){
                String checkstr = String.valueOf(s1.charAt(i));
                set1.add(checkstr );
            }
            for(int i=0; i<s2.length();i++){
                String checkstr = String.valueOf(s2.charAt(i));
                set2.add(checkstr);
            }
            set1.retainAll(set2);

            if(set1.isEmpty()){
                returnstr="NO";
            }
            return returnstr;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int q = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int qItr = 0; qItr < q; qItr++) {
                String s1 = scanner.nextLine();

                String s2 = scanner.nextLine();

                String result = twoStrings(s1, s2);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

            scanner.close();
        }
    }

