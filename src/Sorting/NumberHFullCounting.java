package Sorting;

import java.io.*;
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

public class NumberHFullCounting {
        static void countSort(List<List<String>> arr) {
            String[] csvStrings = new String[] {
                    "0,ab", " 6,cd", "0,ef", "6,gh", "4,ij", "0,ab",
                    "6,cd", "0,ef", "6,gh", "0,ij", "4,that", "3,be",
                    "0,to", "1,be","5,question","1,or","2,not","4,is",
                    "2,to","4,the"
            };

            List<List<String>> outsideInt = new ArrayList<List<String>>();

            for(String line : csvStrings)
            {
                String[] linePieces = line.split(",");
                List<String> insideString = new ArrayList<String>(linePieces.length);
                for(String piece : linePieces)
                {
                    insideString.add(piece);
                }
                outsideInt.add(insideString);
            }
            System.out.println("This is outside list "+outsideInt);
            List<List<String>> finallist = new ArrayList<List<String>>();
            int x = outsideInt.size()/2;
            for(int i=0; i<x;i++){
                List<String> newlist =new ArrayList<>(List.of(String.valueOf(i),"-"));
                finallist.add(newlist);
            }
            System.out.println("This is final list "+finallist);
                int y=0;
            for(List<String> csv : outsideInt){
                if(y < outsideInt.size()/2){

                }else{
                    break;
                }
                y++;
                }
                System.out.print("\n");
            }



        public static void main(String[] args) throws IOException {
            //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            //int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<List<String>> arr = new ArrayList<>();

//            IntStream.range(0, n).forEach(i -> {
//                try {
//                    arr.add(
//                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                    .collect(toList())
//                    );
//                } catch (IOException ex) {
//                    throw new RuntimeException(ex);
//                }
//            });

            countSort(arr);

            //bufferedReader.close();
        }
    }

