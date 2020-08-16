import java.util.*;
import java.util.stream.Collectors;

public class PairOfShocks {
    public static void main (String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
       // List<Integer> ar = Arrays.asList(1, 2, 3, 4, 5, 9, 4, 3, 2, 1, 3, 4, 8, 8);
        List<Integer> ar = Arrays.asList(0,1 , 1, 1, 3, 2, 1, 1,1,3, 3, 3, 3);
        int count = 1;
        int paircount=0;

        for (int i = 0; i < ar.size(); i++) {
            if (map.containsKey(ar.get(i))) {
                map.put(ar.get(i), map.get(ar.get(i)) + 1);

            } else {
                map.put(ar.get(i), count);
            }
        }

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        List<Integer> maxvalues= map.entrySet()
                .stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(maxvalues);


        for(int i=0; i<maxvalues.size(); i++) {
            // paircount = paircount+ map.get(ar.get(i))/2;
           paircount += map.get(maxvalues.get(i)) / 2;

        }
        System.out.println(paircount);

    }
}
