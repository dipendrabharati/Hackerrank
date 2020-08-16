package Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberRGamesOfThrones {
        static String gameOfThrones(String s) {
            String returnstr="YES";
            int count = 0;
            int n = s.length(); int n1=0;
            int palv = 0;    int strval1 =0;
            HashMap<String, Integer> map1 = new HashMap<>();
            List<String>list1=new ArrayList<>();

            for (int i =0; i<s.length(); i++){
                String strchar =String.valueOf(s.charAt(i));
                if(!list1.contains(strchar)){
                    list1.add(strchar);
                }
            }
            for (int i =0; i<n; i++){
                String str =String.valueOf(s.charAt(i));
                if(map1.containsKey(str))  {
                    System.out.println("This is contains strval1 "+strval1);
                    map1.put(str, map1.get(str)+1);
                }else {
                    strval1 =1;
                    map1.put(str, strval1);
                    System.out.println("This is strval1 "+strval1);
                }
            }
            System.out.println("This is map1 "+ map1);
            for(int i=0; i< map1.size();i++){
                if( n % 2==0 && map1.get(list1.get(i))%2==1){
                    returnstr = "NO";
                    break;
                }
                if(n%2==1 && map1.get(list1.get(i))%2 == 1){
                    count++;
                    if (count >1){
                        returnstr = "NO";
                        break;
                    }
                }
            }
            System.out.println("This is return string "+ returnstr);
            return returnstr;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s = scanner.nextLine();

            String result = gameOfThrones(s);

            //bufferedWriter.write(result);
            //bufferedWriter.newLine();
            //bufferedWriter.close();

            scanner.close();
        }
    }

