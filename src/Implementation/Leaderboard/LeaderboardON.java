package Implementation.Leaderboard;

import java.util.Arrays;

import static java.util.stream.IntStream.of;

public class LeaderboardON {
    public static void main(String[] args) {

        /*HashMap<Integer,Integer>map;
            //  vector<int> result(alice.size());
            int[] alice ={70,80,105};
            int[] finalarray=new int[alice.length];
            int[] scores = new int[] {100, 90, 90, 80};
            int diff = 0, j = 0;
            int n = scores.length;

            for (int i = alice.length - 1; i >= 0; i--) {

                while (alice[i] < scores[j] && j < n) {

                    if (map[scores[j]])
                        diff++;

                    map[scores[j]]++;

                    j++;
                }
                finalarray[i] = j - diff + 1;
            }

            System.out.println( finalarray);*/

        int[] scores = new int[] {100, 90, 90, 80};
        int[] alice ={70,80,105};
        int[] finalarray= new int[alice.length];
        int[] array = of(scores).distinct().toArray();
        System.out.println(Arrays.toString(array));

        int i = array.length-1;

        for(int j=0; j<alice.length;j++) {
            System.out.println(alice[j]);

            while(i>=0) {

                if(alice[j]>=array[i]) {           // compare first element of alice score with the last element of scoreboard

                    i--;}                          // if alice's score is equal or greater than compare with the second last scoreboared score (i-1)

                else {

                    finalarray[j]=i+2; break;}     // if alice's score is less the scoreboard score, then the rank array, for the position of alice score will be (j+2)

            }

            if(i<0) finalarray[j]=1;             // i becomes less than zero after after some score of alice becomes greater than or equal to the first element of score
        }                                          // All the score of Alice after this, will have rank one.

    System.out.println(Arrays.toString(finalarray));

        }
    }

