package Implementation.NonDivisibleSubset;

import java.util.ArrayList;
import java.util.List;

public class NonDivisibleSubset {
    public static void main(String[] args){
        int k =4;
        List<Integer> s = new ArrayList<>(List.of(19, 10, 12, 10, 24, 25, 22));
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        System.out.println(s);

        for(int i=0;i<s.size();i++){
            if(s.get(i)%k!=0 && !list2.contains(s.get(i))){
                list2.add(s.get(i));
            }
            System.out.println("This is list2  "+ list2);
        }

        for(int i=0; i<list2.size();i++){
            int j=i+1;
            while(list2.get(j)+list2.get(i) % k !=0){
                if(j<list2.size()) {
                    j++;
                }
            }
            if(j==list2.size()-i-1){
                list3.get(i);
            }
        }
        System.out.println("This is list3  " + list3);
    }
}

// Subset: sum of any 2 numbers: not divisible by k
// Brute-Force Approach: Check the first number in the array
// >>> if the number is divisible by k, put it in the array a
// >>> Check if the second number is divisible by k
// >>> If yes, check if all the sum of that number with the elements of array a is also divisible by k
// >>> If yes, add that number in the array a
// Efficiet Approach: