package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class NumberGPangrams {
    public static void main(String[] args){
        String s= "We promptly judged antique ivory buckles for the prize";
        List<String> list=new ArrayList<>();
        int count=0;
        String returnvar= "";

       for(int i=0; i<s.length();i++) {
           String s1 = String.valueOf(s.charAt(i));
           String s2 = "";

           if(Character.isLowerCase(s.charAt(i))){
             s2 =s1.toUpperCase();
           }else if(Character.isUpperCase(s.charAt(i))){
             s2 = s1.toLowerCase();
           }

           if (Pattern.matches("[a-zA-Z]", s1)) {
              if( !list.contains(s1) && !list.contains(s2)) {
                   list.add(s1);
                   count++;
                   System.out.println("This is the value of count " + count);
               }
               if (count == 26) {
                   returnvar = "pangram";
                   break;
               }
           }
       }
       if(count<26){
           returnvar="not pangram";
       }
       System.out.println(returnvar);
    }
}
//>>> Go through the sentence
//>>> put the 26 english alphabet as a string
//>>> Check if string s contains the the letter && map doesn't contain it
//>>> put in the map.
//>>> if the size of the map= 26 , print pangram ,break;
//>>> else come out of the loop and print not pangram