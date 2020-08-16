package Implementation.Leaderboard;

import java.util.*;
import java.util.stream.Collectors;

public class Leaderboard {
    public static void main(String[] args) {

       // int[] scores = new int[]{100, 100, 50, 40, 40, 20, 10};
       int[] scores = new int[]{100, 90, 90, 80, 75, 60};
       // int[] scores = new int[] {100, 90, 90, 80};

      //  int[] alice = {5, 25, 50, 120};
        int[] alice = {50, 65, 77, 90, 102};
       // int[] alice ={70,80,105};

        int n = scores.length;

        int m = alice.length;

        HashMap<Integer, Integer> map = new HashMap();

        int[] finalarray= new int[m];

        int k=0;

        for (int i = 0; i < n; i++) {

           if (!map.containsValue(scores[i])) { // I wanna check if the map contains any of the existing value. How do i do that?
                                                  // I checked if the current score exists on the map
                map.put(k, scores[i]);
                k++;
            }
        }
        System.out.println(map);

        List<Integer> mapvalues= map.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        System.out.println(mapvalues);

        System.out.println(Arrays.toString(alice));

        int o = mapvalues.size()-1;  //4

        int p=0;

        for (int i=0; i<m; i++) {               // Iterating through each element of array alice
                    System.out.println("The value of i " + i);
                      System.out.println(" This is o " + o);
            for (int j = o; j >=0; j--) {             // We start by comparing the first element of alice to last element of map

                                                             //  For the next element of alice, we start comparing it to the element of map whose value is greater than previous alice score

                    if (alice[i] < mapvalues.get(j)) {

                        finalarray[i] = j + 2;          // the rank of the alice score will be position of map plus one if the score is less than map's value
                            o=j;
                       System.out.println("This is less than the mapvalue finalarray[i]" + finalarray[i]);
                        break;
                    }
                    if (alice[i] == mapvalues.get(j)){

                        finalarray[i] = j + 1;               // the rank of the alice score will be equal to the position of the score
                         o=j;
                        System.out.println("This is equal to map values   finalarray[i}"+ finalarray[i]);
                        break;
                    }

                    if (j==0 && alice[i] > mapvalues.get(0)) {

                        finalarray[i] = 1;                   // the rank of the array will be 1 if it is greater than the first element of score
                        System.out.println("This is greater than the first mapvalue    finalarray[i}" + finalarray[i]);
                        break;
                    }
                }
            }
        System.out.println(Arrays.toString(finalarray));
    }
}
