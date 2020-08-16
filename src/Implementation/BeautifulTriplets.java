package Implementation;

import java.util.ArrayList;
import java.util.List;

public class BeautifulTriplets {
    public static void main(String[] args){
        int[] arr= {1, 2, 4, 5, 7, 8, 10};
        int d=3;
        List<Integer> finallist= new ArrayList<>();
        int k=0;
        int count=0;

        for(int i=0; i<arr.length-1; i++){           // i only goes upto second last element
            System.out.println("This is the value of i " + i);
            finallist.add(arr[i]);
                int j= i+1;
            while(j <arr.length) {                   // j goes upto last element

                if (arr[j] - arr[i] == d ) {
                    finallist.add(arr[j]);
                    System.out.println(arr[j]);
                    i=j;
                }
                j++;
            }
            System.out.println("This is the list for " + " " + finallist);

            if(finallist.size()/3 >= 1){
                count++;
            }
            finallist.clear();
           i=k++;
        }
        System.out.println("The number of triplets is "+ count);
    }
}
// I think I suck at problem like these because I think I don't have a proper strategy
// Brute-Force Approach:>>> Take the first element; Subtract that element from the next element from the next element
//>>> if the difference is =d, then keep track of that element; else move on
//>>> Once you have found two elements, keep those three elements in an array
//>>> Then continue the search from the same position
//>>> if you find two more elements with same difference again, keep them in another array
//>>> Do the same until you reach the end of the given array.
//>>> Once you are done with the first element, Do the same with the second element

//>>>Keep the first element and just add one to whatever 'i' was before