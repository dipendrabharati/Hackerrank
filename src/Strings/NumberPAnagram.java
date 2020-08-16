package Strings;

import java.awt.desktop.SystemSleepEvent;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberPAnagram {
    static int anagram(String s) {
        System.out.println("s.length "+s.length());
        String s1 = "";
        String s2 = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        List<String>list1=new ArrayList<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        int val =0; int count1=0; int count2=0;

        for (int i =0; i<s.length(); i++){
            String strchar =String.valueOf(s.charAt(i));
            if(!list1.contains(strchar)){
                list1.add(strchar);
            }
        }
        System.out.println("This is list1 "+list1);

        if (s.length() % 2 == 0){
            int n1 = s.length()/2;
            s1= s.substring(0, n1);
            s2 = s.substring(n1,s.length());
            int strval1 =0;
            int strval2 =0;

            for(int i=0; i<n1; i++) {
                String str =String.valueOf(s.charAt(i));
               // System.out.println("This is str1 "+str);
                String str2 = String.valueOf(s.charAt(n1+i));
                //System.out.println("This is str2 "+str2);

                 if(map1.containsKey(str))  {
                     strval1 ++;
                     //System.out.println("This is contains strval1 "+strval1);
                     map1.put(str, strval1);
                 }else {
                     strval1 =1;
                     map1.put(str, strval1);
                    // System.out.println("This is strval1 "+strval1);
                 }
                 if(map2.containsKey(str2)){
                    strval2 ++;
                    // System.out.println("This is contains strval2 "+strval2);
                    map2.put(str2, strval2);
                 }else {
                     strval2 = 1;
                     map2.put(str2, strval2);
                    // System.out.println("This is strval2 "+strval2);
                 }
            }
            System.out.println("This is map1 "+ map1 + " This is map2 "+ map2);
//            for(String key : map1.keySet()){
//                        list1.add(key);
//                }
//            System.out.println("This is list1 " + list1);

            for(int i=0; i<list1.size();i++){

                if (!map2.containsKey(list1.get(i))){
                    count1+= map1.get(list1.get(i));
                    System.out.println("FS  doesn't containskey "+count1 + " this is list " +list1.get(i));
                }
                if (map2.containsKey(list1.get(i))){
                    int diff = Math.abs(map1.get(list1.get(i)) - map2.get(list1.get(i)));
                    System.out.println("This is diff "+ diff);
                    count1 +=diff;
                    System.out.println(" FS containsKey "+ count1 + " this is list "+list1.get(i));
                }
                if (!map1.containsKey(list1.get(i))){
                    count2+= map2.get(list1.get(i));
                    System.out.println(" SS doesn't containskey "+count2 + " this is list " +list1.get(i));
                }
                if(map2.containsKey(list1.get(i))){
                    int diff = Math.abs(map1.get(list1.get(i)) - map2.get(list1.get(i)));
                    System.out.println("This is diff "+ diff);
                    count2 +=diff;
                    System.out.println(" SS containsKey "+ count2 + " this is list "+list1.get(i));
                }
            }
           // val=count1+count2;
        }
        else {
            val = -1;
            System.out.println("Value odd "+val);
        }
        System.out.println("Value "+ val);
        return val;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

           // bufferedWriter.write(String.valueOf(result));
           // bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}
