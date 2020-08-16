package Implementation.Leaderboard;

import java.util.Arrays;
import java.util.HashMap;


public class LeaderboardPart3 {
    public static void main(String[] args) {
     // int[] scores = new int[]{100, 100, 50, 40, 40, 20, 10};
      //int[] scores = new int[]{100, 90, 90, 80, 75, 60};
         int[] scores = new int[] {100, 90, 90, 80};

     //   int[] alice = {5, 25, 50, 120};
      //int[] alice = { 65, 77, 90, 102};
         int[] alice ={70,80,105};

        int n = scores.length;
        int m = alice.length;
        HashMap<Integer, Integer> map = new HashMap();
        int[] finalarray = new int[m];
        int k = 0;

        for (int i = 0; i < n; i++) {

            if (!map.containsValue(scores[i])) {
                map.put(k, scores[i]);
                k++;
            }

        }
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(Arrays.toString(alice));
        int p=0;

        for (int i=m-1; i>=0; i--) { // alice array

            for (int j = p; j<map.size(); j++) {  //map score array

                if (alice[i] >= map.get(j)){
                    finalarray[i] = j + 1;
                    p=j;
                    break;
                }
                if(alice[i] > map.get(0)){
                    finalarray[i]=1;
                    break;
                }
                if ( alice[i] < map.get(map.size()-1)){
                    finalarray[i]= map.size()+1;
                    p=0;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(finalarray));
    }
}

