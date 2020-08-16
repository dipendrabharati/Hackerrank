package Implementation.Leaderboard;
import java.util.Arrays;
import java.util.HashMap;
public class LeaderboardwithBinarySearch {
    public static void main(String[] args) {
        int[] scores = new int[]{100, 100, 50, 40, 40, 20, 10};
//        //int[] scores = new int[]{100, 90, 90, 80, 75, 60};
//        int[] scores = new int[] {100, 90, 90, 80};
//
//        //   int[] alice = {5, 25, 50, 120};
//        //int[] alice = { 65, 77, 90, 102};
        int[] alice = {70, 80, 105};
        HashMap<Integer, Integer> map = new HashMap();
        int m = alice.length;
        int n = scores.length;
        int[] finalarray = new int[m];

        int k=1;
        for (int i = 0; i < n; i++) {

            if (!map.containsValue(scores[i])) {
                map.put(k, scores[i]);
                k++;
            }
        }
        System.out.println(map);
        System.out.println(scores.length);
        System.out.println(Arrays.toString(alice));

        // binary search: basically you have a middle, and then, you compare whether the key is greater than or less than the middle
        // if it less than the middle, they you find another middle1 which is equal to the sum of low and middle divide by 2;
        // if it greater than the middle, they you find another middle which is equal to the sum of middle and position of last element divide by 2.

       // int binarySearch(int key) {
            int key=0;
            int low= 0;
            int high= map.size()-1;
            int middle=0;

            for(int i=0; i< map.size(); i++){
                int sum = high+low;
                if(sum%2==1){
                    sum=sum+1;
                }
                middle = sum/2;

                if(key==map.get(middle)){
                key = middle;
                System.out.println(middle);
                // return middle;
                    break;
                 } else if( key < map.get(middle)){

                low = middle;
                 } else {

                high= middle;
            }

        }


        System.out.println(Arrays.toString(finalarray));
    }

}
