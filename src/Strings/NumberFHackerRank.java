package Strings;

public class NumberFHackerRank {
    public static void main(String[] args){
        String s = "hereiamstackerrank";
        String s1= "hackerrank";

        int j=0;
        for(int i=0; i< s.length(); i++){
                if (s.charAt(i) == s1.charAt(j)){
                    j++;
                    System.out.println("This is the value of j "+j);
                }
              if (j==s1.length()){
                  System.out.println("YES");
                  break;
            }
        }
        if(j<s1.length()){
            System.out.println("NO");
        }
    }
}
// Brute force approach: Array with a hackerrank
// >>> Now I have to check if it has hackerrank in sequence
// >>> Go through the entire string
//>>> Two things: move through the strings
//>>>  : move through our hackerrank array
//>>>   : when you find 'h', look for 'a' and soon
//>>>   : when you find 'h', store in a list
//>>>   : in the end if the size of the list is equal to size of hackerrank string
//>>>   : we have the string