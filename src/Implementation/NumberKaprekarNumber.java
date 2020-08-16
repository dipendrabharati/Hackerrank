package Implementation;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberKaprekarNumber {
    static void kaprekarNumbers(int p, int q) {
        int count=0;
        for(int i=p ; i <=q; i++){
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            //System.out.println(numbers);
            long x= (long) Math.pow(i,2);
            //System.out.println("This is square of "+ i + " " + x);
            String req = String.valueOf(x);
            int len = req.length();
            String firsthalf="";
            String secondhalf="";
            int finalval=0;
            if(req.equals("1")){
                System.out.print(1+" ");
                count++;
            }
            if(len%2==0 && len >1){
                firsthalf = req.substring(0,len /2 );
                secondhalf= req.substring(len/2, len);
               // System.out.println("This is first "+ firsthalf + " "+ "This is second half "+ secondhalf);
                finalval= Integer.parseInt(firsthalf) + Integer.parseInt(secondhalf);
              //  System.out.println("This is finalvalue "+finalvalue);
                if(finalval == i){
                    System.out.print(finalval+" ");
                    count++;
                }
            }
            if(len%2 ==1 && len >1){
                firsthalf = req.substring(0,len/2 );
                secondhalf= req.substring(len/2, len);
              //  System.out.println("This is first "+ firsthalf + " "+ "This is second half "+ secondhalf);
                finalval= Integer.parseInt(firsthalf) + Integer.parseInt(secondhalf);
              //  System.out.println("This is finalvalue "+finalvalue);

                if(finalval==i){
                    System.out.print(finalval+" ");
                    count++;
                }
            }
        }
        if(count==0){
            System.out.print("INVALID RANGE");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
// 11:40 started
// n, n2, split a and b, a + b = n
// if n = odd,  5, left = 2 and right = 3
// if n = even, 6, left = 3 and right = 3

