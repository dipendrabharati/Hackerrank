package Strings;

import java.util.HashMap;

public class NumberDCaesarCipher {
    public static void main(String[] args) {
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s = "abcdez";   String out = "";
        int pos = 0; int k=4;
        HashMap<String,String> map= new HashMap<>();
        map.put(String.valueOf("w"),String.valueOf("z"));
        map.put(String.valueOf("x"), String.valueOf("a"));
        map.put(String.valueOf("y"), String.valueOf("b"));
        map.put(String.valueOf("z"), String.valueOf("c"));

        System.out.println("this is map" + map);

        for (int i = 0; i < s.length(); i++) {
            String s1 = String.valueOf(s.charAt(i));
            boolean b = !(lowercase.contains(s1)) && !(uppercase.contains(s1));

            if (k == 3) {
                if (lowercase.contains(s1)) {
                    if (map.containsKey(s1)) {
                        out = out + map.get(s1);
                    } else {
                        pos = lowercase.indexOf(s1) + k;
                        if (pos >= 26) {
                            pos = pos % 26;
                        }
                        String addchar = String.valueOf(lowercase.charAt(pos));
                        out = out + addchar;
                    }
                }
                if (uppercase.contains(s1)) {
                    if (map.containsKey(s1)) {
                        out = out + map.get(s1);
                    } else {
                        pos = uppercase.indexOf(s1) + k ;
                        if (pos >= 26) {
                            pos = pos % 26;
                        }
                        String addchar = String.valueOf(uppercase.charAt(pos));
                        out = out + addchar;
                    }
                }
                if(b){
                    out= out + s1;
                }
                System.out.println("This is out " + out);
            }
            else {
                if (lowercase.contains(s1)) {
                        pos = lowercase.indexOf(s1) + k;
                        if (pos >= 26) {
                            pos = pos % 26;
                        }
                        String addchar = String.valueOf(lowercase.charAt(pos));
                        out = out + addchar;
                }
                if (uppercase.contains(s1)) {
                    pos = uppercase.indexOf(s1);
                        if (k >= 26) {
                            k = k % 26;
                        }
                        pos+=k;
                     //   if ( pos >)
                       // String addchar = String.valueOf(uppercase.charAt(pos));
                        //out = out + addchar;
                }
                if(b){
                    out = out+ s1;
                }
                System.out.println("This is out " + out);
            }
        }
    }
}
//>>>Approach : Rotation by 3
// Method1: Put lowercase alphabets ina astring and uppercase alphabets ina a string
        //  Go through the given string:
        //  If matches any of them, move them by three spaces
        // If the character is other than lowercase or uppercase than just keep it like that
// Method2: how to access letters without putting in as a string