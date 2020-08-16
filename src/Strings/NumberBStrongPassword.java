package Strings;

import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;

public class NumberBStrongPassword {
    public static void main(String[] args){
      String  numbers = "0123456789";
       String lower_case = "abcdefghijklmnopqrstuvwxyz";
       String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String special_characters = "!@#$%^&*()-+";
       int req=4;
       String password ="zss";
       String str[]= password.split("");
       int num = 0, lower = 0, upper = 0, special = 0;

       for( int i=0; i< password.length(); i++) {

           if (Character.isDigit(password.charAt(i)) && num == 0) {
               num++;
               req--;
           }
           if (Character.isUpperCase(password.charAt(i)) && upper == 0) {
               upper++;
               req--;
           }
           if (lower_case.contains(str[i]) && lower == 0) {
               lower++;
               req--;
           }
           if(special_characters.contains(str[i]) && special==0){
               special++;
               req--;
           }
       }
       System.out.println(req);
       int count = password.length()-6;
       System.out.println(count);

       if(count < 0 &&  Math.abs(count) >= req){
           req=Math.abs(count);
       }
        System.out.println(req);
    }
}
// find the minimum number of character she must add to make the password strong
// Use for loop to go through the elements: check for the four condition
// When each condition is met, do n-1; where n is 4 in the begining
// but how to stop the condition for executing once the condtion is satisfied once: put a variable
// How to check if a char is equal to any char of the given string
// count =3 , req = 1, count > req then req = count