package Implementation;

import java.util.ArrayList;
import java.util.List;

public class NumberAGradingStudents {
    public static void main(String[] args){
        List<Integer> grades = new ArrayList<>(List.of(73, 67, 38, 33));

        System.out.println(grades);
     for(int i=0; i<grades.size(); i++) {
         int X = grades.get(i);
         System.out.println("This is X "+ X);
         int Y = X % 5;

         if (X >= 38 && Y>=3) {
             X += (5 - Y);
         }
         System.out.println("This is grades "+ X);

     }
}
}
// MyCode Complexity is O(n) because just one for loop.
// while if conditional doesn't affect complexity?