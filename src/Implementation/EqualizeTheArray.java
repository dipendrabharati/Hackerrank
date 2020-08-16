import java.util.Collections;
import java.util.HashMap;


public class EqualizeTheArray {
    public static void main(String[] args){
        int[] arr = {3, 3, 2, 1, 3};
        int deletion =0;
        int common = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        int count=1;
        for(int i=0; i<arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], count);
            }
        }
        System.out.println(map);

        common=Collections.max(map.values());
        System.out.println(common);

        deletion = arr.length - common;
        System.out.println(deletion);
    }
}
// If there is a common element: length of array - no. of common elements
// find maximum number of common elements: Use a hash map
// keep a counter for each value: find the maximum value
// i.e.
// If there is no common element: then the length of array -1
