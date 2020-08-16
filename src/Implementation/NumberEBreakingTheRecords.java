import java.lang.reflect.Array;
import java.util.Arrays;

public class NumberEBreakingTheRecords {
    public static void main(String[] args) {
        int[] first = {3,4,  21 ,36, 10, 28, 35, 5 , 24, 42};
        //int[] first = new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int max = first[0];
        int min = first[0];
        int len = first.length;
        int count1 = 0;
        int count2 = 0;

        for (int i = 1; i < len; i++) {
            if (first[i] > max) {
                count1++;
                max = first[i];
            } else if (first[i] < min) {
                count2++;
                min = first[i];
            }
        }
        int [] second = new int[] { count1, count2};
        System.out.println(Arrays.toString(second));
    }
}
//  for loop for point scores
// max =a[0] and min=a[0]
// max and min are zero in the begiing
// if the value is greater than max or less than min, update both max and min
// if (greather than) + counter else if (less than)+ counter else (equal)
//add both counter