// What the question wants?  : value of the element at a given position
// How are you gonna get it?  : Add position +1 for each rotation
//     when positon = size of array, that position becomes pos[0]
//lastTofirst: // shift the rest to +1 // perform rotation number of times // return values at certain indices

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class CircularArrayRotation {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};  // given array
        int k = 2;           // number of rotations
        int[] queries = {0, 1, 2};
        int j = 0;
        // System.out.println("This is given array" + Arrays.toString(a));

        while (j < k) {

            int temp = a[a.length - 1];
            System.out.println(temp);

            for (int i = a.length-1; i >0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
            System.out.println("The array after every rotation" + Arrays.toString(a));
            j++;
        }

        System.out.println(" This is final array " + Arrays.toString(a));

        for (int i=0; i<queries.length; i++){
            queries[i] = a[queries[i]];
            //  System.out.println("this is individual queries" + queries[i]);
        }
        //  System.out.println(Arrays.toString(queries));
        }
    }
