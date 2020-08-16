
import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // List<Integer> a = Arrays.asList(2, 4);
        // List<Integer> b = Arrays.asList(16, 32, 96);

        int i,j;
        List <Integer> v1 =  new ArrayList();
        List <Integer> v2 =  new ArrayList();
      for ( i=a.get(a.size()-1); i<=b.get(0); i++){
          int count=0;
          for(j=0; j<a.size();j++){
              if (i % a.get(j)==0) {
                  count++;
              }
          }
        //  System.out.println("number:"+i + "count:"+count);
          if(count==a.size()) {
              v1.add(i);
          }

      }
//System.out.println(v1);

        for ( i=0; i<v1.size(); i++){
            int count=0;
            for(j=0; j<b.size();j++){
                if (b.get(j) % v1.get(i)==0) {
                    count++;
                }
            }
            System.out.println("number:"+i + "count:"+count);
            if(count==b.size()) {
                v2.add(v1.get(i));
            }

        }
       // System.out.println(v2);
        return v2.size();
    }

}

