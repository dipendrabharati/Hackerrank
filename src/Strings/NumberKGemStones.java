package Strings;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NumberKGemStones {
        static int gemstones(String[] arr) {
            HashMap<Integer, String> map = new HashMap<>();
                for(int i=0; i<arr[0].length(); i++){
                    String val =String.valueOf(arr[0].charAt(i));

                    if(!map.containsValue(val)) {
                        map.put(i, val);
                    }
                }
                System.out.println("this is map "+ map );

                for(int i=0; i<arr.length; i++){
                    int j=0;

                    while(j < arr[0].length()){
                        String valsec=String.valueOf(map.get(j));
                        if(!arr[i].contains(valsec)){
                            map.remove(j);
                        }
                        j++;
                    }

                }
                System.out.println("This is finalmap "+map );
            return map.size();
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String[] arr = new String[n];

            for (int i = 0; i < n; i++) {
                String arrItem = scanner.nextLine();
                arr[i] = arrItem;
            }

            int result = gemstones(arr);

            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
            //bufferedWriter.close();
            scanner.close();
        }
    }
//EasyProblem1 : GemStones ; 8:15am
// we need to find number of minerals present inall the rocks
// abc , a:b:c: , keep it in a hashmap,
// then we check if the minerals are present in all the rocks i.e.
// if a is present in second rock, abc ans: yes, continue to keep the element in the hashmap
// b and c as well
// Third rock; Check if mineral a is present: ans:No, remove a from the hashmap
// Do this until the end of the loo
