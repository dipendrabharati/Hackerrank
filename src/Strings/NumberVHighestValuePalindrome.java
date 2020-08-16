package Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberVHighestValuePalindrome {
    // Complete the highestValuePalindrome function below.
    static String highestValuePalindrome(String s, int n, int k) {
        String s1 = "";
        String s2 = "";
        int value =0;
        int value1 = 0;
        int returnval=-1;
        String finalans="";
        int[] sarray= new int[s.length()];

        for(int i=0; i<s.length();i++){
            sarray[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
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
                value++;
                System.out.println("Change needed position " + i);
                System.out.println("This is req changes " + value);
            }
        }
//        if(value ==0 && k==0){
//            finalans=finalans+s;
//            System.out.println("This is value=0 and k=0 "+ finalans);
//        }
        if(value == s1.length()-1 && k==0){
            finalans = finalans+s;
            System.out.println("This is first val "+ finalans);

        }
        else if(n==1 && k==1) {
            finalans= finalans+"9";
            System.out.println("This is n==1 && k==1 "+ finalans);

        }else if (value > k) {
                finalans= "-1";
                System.out.println("This is val > k "+ finalans);

        } else if (value == k) {
                for (int i = 0; i < s1.length(); i++) {
                    String a = String.valueOf(s.charAt(i));
                    String b = String.valueOf(s.charAt(n - 1 - i));
                        System.out.println("This is a " + a + " and this is b " + b);
                    if (sarray[i] != sarray[n-1-i]) {
                        if (Integer.parseInt(a) > Integer.parseInt(b)) {

                            sarray[n-1-i]= sarray[i];
                            System.out.println("New Changed string " + Arrays.toString(sarray));
                        }
                        else if(Integer.parseInt(a) < Integer.parseInt(b)){
                            sarray[i]=sarray[n-1-i];
                        }

                    }
                }
                for(int i = 0; i < sarray.length; i++) {
                    finalans= finalans + Integer.toString(sarray[i]);
                }

        }else if (value < k && value != 0) {
                int diff = k - value;
                System.out.println("This is diff " + diff);

                for (int i = 0; i < s1.length(); i++) {
                    String a = String.valueOf(s.charAt(i));
                    String b = String.valueOf(s.charAt(n - 1 - i));

                    if (sarray[i] != sarray[n-1-i]) {

                        if(diff != 0 && sarray[i] != 9 && sarray[n-1-i] !=9) {
                          sarray[i] = 9;
                          sarray[n-1-i]=9;
                            System.out.println("This is s inside diff " + Arrays.toString(sarray));
                            diff--;
                            System.out.println("Value of diff "+ diff);
                        }else {
                            if (Integer.parseInt(a) > Integer.parseInt(b)) {
                                sarray[n-1-i]= sarray[i];
                                System.out.println("New Changed string a " + Arrays.toString(sarray));
                            } else {
                                sarray[i]= sarray[n-1-i];
                                System.out.println("New Changed string b " + Arrays.toString(sarray));
                            }
                        }
                    }
                }
                for(int i = 0; i < sarray.length; i++) {
                    finalans= finalans + Integer.toString(sarray[i]);
                }
            } else if (value == 0 && k % 2 == 0) {
            for (int i = 0; i < sarray.length; i++) {
                while (k != 0 && sarray[i] !=9) {
                    sarray[i] = 9;
                    sarray[n - 1 - i] = 9;
                    k = k - 2;
                    System.out.println("This is sarray[i] " + sarray[i] + " this is i " + i);
                    System.out.println("This is value equals 0 and k % 2 = 0 " + Arrays.toString(sarray));

                }

            }

            for(int i = 0; i < sarray.length; i++) {
                finalans= finalans + Integer.toString(sarray[i]);
            }
        }
        System.out.println("Finalans "+ finalans);
        return finalans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String s = scanner.nextLine();

        String result = highestValuePalindrome(s, n, k);

        //bufferedWriter.write(result);
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
