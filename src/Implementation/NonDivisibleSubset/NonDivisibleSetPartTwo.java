package Implementation.NonDivisibleSubset;

import java.util.ArrayList;
import java.util.List;

public class NonDivisibleSetPartTwo {
    public static void main(String[] args){
        int k =4;
        int currMaxCount=0;
        List<Integer> s = new ArrayList<>(List.of(19, 10, 12, 10, 24, 25, 22));
        List<Integer> list3 = new ArrayList<>();

        for(int i=0; i<s.size(); i++) {
            list3.add(s.get(i));
            int j = 0;
            j = i + 1;
            int count = 1;

            while (j < s.size() && !list3.contains(s.get(j))) {

                int m = s.get(j) + s.get(i);
                if (m % k != 0) {
                    list3.add(s.get(j));
                }
                j++;
            }
            System.out.println("This is list3 " +list3);

                for (int l = 0; l < list3.size()-1; l++) {
                    int n = l + 1;
                    System.out.println("This is n " + list3.get(n) );
                    while(n < list3.size()) {
                        int q = list3.get(l) + list3.get(n);
                        System.out.println("This is q "+ q);
                        if (q % k == 0) {
                            list3.remove(n);
                            System.out.println("This is list3 remove "+list3);
                        }
                        n++;
                    }
                }
                if(list3.size()>currMaxCount){
                    currMaxCount=list3.size();
                }
               // System.out.println("This is list3  " + list3 + " " + "This is count " + count);
                list3.clear();
            }
    }
}

// Complexity is O(n^2) because there are two for loops.

