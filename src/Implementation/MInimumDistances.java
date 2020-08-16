import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MInimumDistances {
    public static void main(String[] args){
        int[] a= new int []{ 1, 2, 3, 4, 10 };
        int pos =0;
        List<Integer> list= new ArrayList<>();

        for(int i=0; i < a.length-1; i++){          // goes upto second last element
            int j= i+1;

            while(j < a.length){                   // goes upto last element
                if (a[i]== a[j]){
                    pos= j-i;
                    list.add(pos);
                    System.out.println("This is the list" + list);
                    break;
                }
                j++;
            }
            System.out.println("This is the value of i " + i);
        }
        int ans=0;
        if(list.isEmpty()){
           ans = -1;
        }else{
            ans = Collections.min(list);
        }
        System.out.println("This is the value of min "+ ans);
    }
}
// Brute-Force: Go through the array using for loop; Keep track of the position of the first element
// >>> Check if the array contains that element; if you find the matching element find the difference between their postion
// >>> Keep the value in a list
// >>> Do the same for the rest of the element
// >>> Find the minimum value in the list
