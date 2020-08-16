import java.util.*;
import java.util.stream.Collectors;

public class Hashmapproblem {

public static void main (String[] args) {

    HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();

    List<Integer> arr= Arrays.asList( 1, 2, 3, 4, 5,9, 4, 3, 2, 1, 3, 4,8,8);

    int count=1;

    for( int i=0; i <arr.size(); i++) {
        if (map.containsKey(arr.get(i))){
            map.put(arr.get(i), map.get(arr.get(i))+1);
        }else{
            map.put( arr.get(i), count);
        }
    }
    List<Integer> maxvalues= map.entrySet()
            .stream()
            .filter(entry -> entry.getValue() == Collections.max(map.values()))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

    for(Map.Entry m : map.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());
    }

    System.out.println(maxvalues);
   System.out.println(maxvalues.get(0));


}
}
