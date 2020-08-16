
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * A simple Java Program to demonstrate how to use map and filter method Java 8.
 * In this program, we'll convert a list of String into a list of Integer and
 * then filter all even numbers.
 */
public class Hello {
    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(3, 4);
        List<Integer> b = Arrays.asList(24, 48);
        int total=0;

            for(int i=0; i <=100 ;i++) {
                    int finalI = i;

                    if ( (a.stream().allMatch(number -> finalI % number == 0)) && (b.stream().allMatch(number -> number % finalI == 0))) {
                        total++;

                }
            }
        System.out.println(total);
    }
}