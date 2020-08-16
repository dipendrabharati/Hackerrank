package Implementation.Leaderboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class LeaderboardPart2 {
    public static void main(String[] args) {
        int[] scores = new int[]{100, 90, 90, 80, 75, 60, 40, 30, 20, 10};
        int[] alice = {5, 102, 102};
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
        List<Integer> mapvalues = map.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        int p = mapvalues.size() - 1;
        for (int i = 0; i < m; i++) {
            System.out.println("The value of i " + i);
            System.out.println(" THe value of p        " + p);
            for (int j = p; j >= 0; j--) {
                if (alice[i] < mapvalues.get(p)) {
                    finalarray[i] = p + 2;
                    p--;
                    break;
                }
                if (alice[i] == mapvalues.get(p)) {
                    finalarray[i] = p + 1;
                    p--;
                    break;
                }
                if (alice[i] > mapvalues.get(0)) {
                    finalarray[i] = 1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(finalarray));
    }
}
