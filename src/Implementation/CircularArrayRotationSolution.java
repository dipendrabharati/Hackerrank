import java.util.Arrays;
import java.util.Scanner;

public class CircularArrayRotationSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] a = {3, 4, 5};             // given array
        int[] queries = {1, 2};
        int n = 3;               // number of elments in the array
        int k = 2;            // rotation count
        int q = queries.length;               // number of queries

      /*  for (int a_i = 0; a_i < n; a_i++) {  // asking the user to give the array
            a[a_i] = in.nextInt();
        }*/

        for (int a0 = 0; a0 < q; a0++) {      // to get the element for query
            int m = queries[a0];              // each individual query elements
            int var1 = (k % n);                 // what happens when you do k%n, if k=n, the position is unchanged, i guess its useful when rotation is more
                                                // gives you the shift of each element
            int var2 = (k % n) + m;             // it gives the current position of each element in the array, which was previously in position m

            int var3 = ((k % n) + m) % n;     // if the value of (k%n)+m is greater than n, mod n gives the postion from starting for that variable

            int var4 = (n - (k % n) + m) % n;  // Why subtracting again from n??

            System.out.println(a[var4]);  // what is value of the element in that positon
        }
        // System.out.println(Arrays.toString(a));
    }
}
// var1 = 2 , m = 1 && var2 = 2+1=3,  var3= 3 % 2=1, var4 = 2-1= 1
// so, at position 1, array will have element; a[1] = 4
