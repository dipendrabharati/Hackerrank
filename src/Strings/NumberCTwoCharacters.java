package Strings;

import java.util.ArrayList;
import java.util.List;

public class NumberCTwoCharacters {
    public static void main(String[] args){
        String s= "asdcbsdcagfsdbgdfanfghbsfdab";
        List<Character> list = new ArrayList<>();
        String finalstr ="";
        int finalcount=0;

        for(int i=0; i<s.length(); i++){

            if (!list.contains(s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        System.out.println("This is the initial list "+ list);
        String strlist = list.toString()
                .substring(1, 3 * list.size() - 1)
                .replaceAll(", ", "");
        System.out.println("this is strlist "+strlist);

        for(int i=0; i<list.size()-1; i++) {
            String out="";
            int j=i+1;

            while(j<list.size()) {
                int count=1;
                String s1 = String.valueOf(list.get(i));
                String s2 = String.valueOf(list.get(j));
                finalstr=s.replaceAll("[^" + s1 + " " + s2+ "]", "");
               System.out.println("This is string without "+ s1 + " "+ s2 + " " + finalstr);
                j++;

                for(int k=0; k<finalstr.length()-1;k++){
                    int l = k+1;
                    String first =String.valueOf(finalstr.charAt(k));
                    String second= String.valueOf(finalstr.charAt(l));
                   // System.out.println(" This is first "+ first + " "+ "this is second "+second);
                    if(!first.equals(second)){
                        count++;
                        System.out.println("This is count increasing "+count);
                    }else{
                        break;
                    }
                }
                if(count == finalstr.length() && count>finalcount){
                    finalcount=count;
                }
              //  System.out.println("This is count "+count);
                System.out.println("This is finalcount"+finalcount);
            }

        }
    }
}
// Brute-force Approach: for loop, find different characters
// >>> make set of two characters for all the different characters
// >>> Take one set, delete all the character in the string except that set
// >>> Check it has alternating character; start at 0 and if even pos = i and odd pos = j, counter = length of out;
// if yes, put its size in a counter
// >>> Take second set, delete all the rest
// >>> Check it has alternating characters; if yes, Check if it greate than counter; if yes, it becomes the counter
// How to make strings from characters?
//