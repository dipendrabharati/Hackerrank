package Strings.NumberUSherlockAndValid;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberUSherlockAndValid {
    static String isValid(String s) {
            HashMap<String, Integer> map = new HashMap<>();
            int maxfreq = 1;
            map.put(String.valueOf(s.charAt(0)),1);
            int counter = 0;
            String returnstring = "";

        for(int i=1; i<s.length();i++) {
            String s1 = String.valueOf(s.charAt(i));
            String s2 = String.valueOf(s.charAt(i-1));

            if (map.containsKey(s1)) {
                map.put(s1, map.get(s1) + 1);
            } else {
                map.put(s1, 1);
            }

            if (map.get(s1) > maxfreq){
                maxfreq = map.get(s1);
            }

            if(!s1.equals(s2)){
                System.out.println("This is s1 "+ s1 + "  and s2 "+ s2);
                counter= counter + (maxfreq- map.get(s2));
                System.out.println("This is the value of counter "+ counter);

               if (counter > 1) {
                    returnstring = "NO";
                    break;
                }
            }
            if(i == s.length()-1) {
                counter = counter + maxfreq - map.get(String.valueOf(s.charAt(s.length() - 1)));
                System.out.println("This is last counter " + counter);
                if (counter > 1) {
                    returnstring = "NO";
                } else {
                    returnstring = "YES";
                }
            }
        }
        System.out.println("This is max freq "+ maxfreq);
        System.out.println("This is map "+ map);

    return returnstring;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
