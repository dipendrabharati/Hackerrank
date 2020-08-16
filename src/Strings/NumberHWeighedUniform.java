package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.io.*;
import java.util.*;

public class NumberHWeighedUniform {
    static String[] weightedUniformStrings(String s, int[] queries) {

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> finalmap= new HashMap<>();

        String alphastr = "abcdefghijklmnopqrstuvwxyz";
        int j=0;
        for (int i = 1; i < alphastr.length(); i++) {
            map.put(String.valueOf(alphastr.charAt(i - 1)), i);
        }
        //System.out.println("This is map "+map);

        for(int i=0; i<s.length();i++){
            String strvar= String.valueOf(s.charAt(i));

            if(!map1.containsKey(strvar)) {
                map1.put(strvar, map.get(strvar));

              //  if(!finalmap.containsValue(map.get(strvar))) {
                    finalmap.put(j, map.get(strvar));
                    System.out.println("This is doesn't contain finalmap "+ finalmap);
                    j++;
              //  }
               System.out.println("This is doesn't contain "+ map1);

            }else if(map1.containsKey(strvar)){


                //if(!finalmap.containsValue(currVal)) {
                    finalmap.put(j, map1.get(strvar) + map.get(strvar));
                    map1.put(strvar, map1.get(strvar)+map.get(strvar));
                    System.out.println(" This is contains finalmap "+finalmap);
                    j++;
                //}
                System.out.println("This is map1 contains "+ map1);
            }
        }
        //System.out.println("THis is map1 "+ map1);
        System.out.println("This is last finalmap" + finalmap);
        String[] finalarray= new String[queries.length];
        //System.out.println("This is queries " + Arrays.toString(queries));
        for(int i=0; i<queries.length;i++){

            if(finalmap.containsValue(queries[i])){
                finalarray[i]= "Yes";
            }else{
                finalarray[i]= "No";
            }
        }
        System.out.println("This is finalarray  "+ Arrays.toString(finalarray));
        return finalarray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        String[] result = weightedUniformStrings(s, queries);

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(result[i]);
//
//            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        scanner.close();
    }
}
// EasyProblem:NumberHWeightedUniform 10:40am
// uniform string : single string repeated zero or more times
// Given s, we need to find uniform substrings
// find the sum of the uniform substrings
// Check if the given query value matches is in the set of sums of uniform substrings
// return string array of "YES" or "NO" for given query.

// Approach: Create a hashmap, Go through it,
// keep record of the characters and the value of repetition then find the sum for the given characters

