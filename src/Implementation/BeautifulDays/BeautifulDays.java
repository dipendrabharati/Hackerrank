package Implementation.BeautifulDays;

import java.util.Arrays;

public class BeautifulDays {
    public static void main(String[] args) {
        int i = 134, j = 134, k = 1;
        int count=0;
            int[] arr = { 1, 2, 3, 4};
            System.out.println(Arrays.toString(arr));  // class is calling to a function and passing 'arr' as the parameter to the function
        for (int l = i; l <= j; l++) {

            StringBuilder input1 = new StringBuilder();
            input1.append(l);
            input1 = input1.reverse();

         //   System.out.println(input1);
           // System.out.println(StringBuilder.toString());

            int a = Integer.parseInt(input1.toString()); // object is calling the toString function which belons to StringBuilder
             System.out.println(a);

            int diff = Math.abs(a - l);

         //  System.out.println(diff/k);

            if (diff % k == 0) {
                count++;
            } else {
                continue;
            }

        }
          System.out.println(count);

    }
}
// number and its reverse, zero at he last gets eliminated
// numbered rande of days, beautiful numbers  |i =reverse| is evernly divisble by k
//print the numbe of beautifl days
// what I want: I want to print the number
// what is happening: I think it's printing the memory address
// How do you print the number
// how to convert memory address to value in java
// what i want: I want to convert the stringbuilder to integer
// what is happening: I have to change everything to stringbuilder