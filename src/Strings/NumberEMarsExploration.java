package Strings;

import javax.net.ssl.SSLContext;
import java.util.HashMap;
import java.io.*;
import java.util.*;
class NumberEMarsExplortion {
    static int marsExploration(String s) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, String.valueOf("S"));
        //System.out.println("map.put 0 " + map.get(0));
        map.put(1, String.valueOf("O"));
        map.put(2, String.valueOf("S"));
        //System.out.println("This is map "+ map);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println("This is value of i  " + i);
            //System.out.println("This is value of j "+ j);
            //System.out.println("THis is map.get(j) " + map.get(j));
                int j =0;
            while (j < 3) {
                String checkstr = String.valueOf(s.charAt(i));
               // System.out.println("Outside: This is checkstr "+ checkstr + " map.get(j) "+ map.get(j));
                System.out.println("THis is j " + j + " Checkstr " + checkstr + " map j "+ map.get(j) );

                if (!checkstr.equals(map.get(j))) {
                    System.out.println("This is checkstr "+ checkstr + " j " + j + " map.get(j) "+ map.get(j));
                    count++;
                }
                j++;
                i++;
            }
            i--;
            System.out.println("This is value of i  " + i);
            System.out.println("This is count "+ count);
        }
        return count;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
// EasyProblem: MarsExploration Start:9:00 am
// i =0
// while ( j < i+3 && i+3 < s.length)
// j=0 , s.charAt(j) == 'S'
// j=1 , s.charAt(j) == '0'
// j=2 , s.charAt(j) == 'S'
// i+2;

// i=0 , i= 1 , i=2, j=3 while coming
// j=0, j=1, j=2, j=3 while coming