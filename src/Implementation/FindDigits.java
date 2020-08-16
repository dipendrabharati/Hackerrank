public class FindDigits {
    public static void main(String[] args){
        int n = 12 ;
        int m = n;
         int count =0;

        while( n !=0) {  // the remainder is zero, only for the last element

         int x = n % 10;   // this gives me 2
            System.out.println(x);


         if ( x !=0 && m % x ==0 ){  // if m is divided by x, you get zero, so this is true
             count++;        // so we increase the count
         }

             n = n/10;      // else we continue with the quotient
         }
         System.out.println(count);
    }
}
// n is less than the max size of int
// Brute Force: i> you do n mod 10 = y
// ii>  n divide y ==0 or not
// iii> if yes increase the count
// I think we need to use the recursive function