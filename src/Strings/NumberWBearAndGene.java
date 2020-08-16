package Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    public class NumberWBearAndGene {
        static int steadyGene(String gene) {

        return 0;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String gene = scanner.nextLine();

            int result = steadyGene(gene);

            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
            //bufferedWriter.close();

            scanner.close();
        }
    }
// MediumProblem5: 3:40pm
//n divisible by 4
// smallest possible substring to replace to make steady
// THe frequency of A,C,T, G should be same

// Given String, what should be the length of A, C, T, G i.e. n/4
// Iterate through the string, and calculate the frequency of A, C, T, G
// Add the difference between the corresponding values
//Example
// GAAATAAA, A=2, C=2, T=2, G=2, what we have, A=6, C=0, T=1, G=1
// Need, Na=0, Nc=2, Nt=1, NG=1 = 4