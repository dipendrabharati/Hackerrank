package Implementation.SaveThePrisoner;

import java.util.HashMap;
// if there are 9 students and if we start at from 1,then we will reach at 3 i.e. 12 % 9
// 8 + 12%9 = 11
// 11%9 = 2, i.e. if ther are 12 chocolates, and if you start at 8, then you end up at 2.
public class SavethePrisoner {
    public static void main(String[] args) {
        int n = 9;
        int m = 12;
        int s = 8;
        HashMap<Integer, Integer> map = new HashMap<>();

        if (n > m) {
            int var = s + m - 1;

            if (var > n) {
                if (var % n == 0) {
                    System.out.println(n);
                } else {
                    System.out.println(var % n);
                }
            } else {
                System.out.println(var);
            }
        }

        if (m > n) {
            int rem = m % n;
            int var = s+ rem-1;
            System.out.println(var);

            if(var > n ){
                var = var%n +1;
                System.out.println(var);
            }
        }
    }
}
// I think somehow using the multiples
// So it 1, 2 ,3 ,4 ,5   prisoners
//       1, 2,
//          1, 2,
// 1, 2, 3 prisoners
//        1  chocolates
// 2,  3, 4
// 5,  6, 7
// Answer here is =  s+rem-1 = 3 +1 -1
// 1, 2, 3, 4, 5, 6, 7  prisoner
//    1, 2, 3, 4, 5, 6   chocolates
// 7, 8, 9, 10,11,12,13
//14,15,16, 17,18,19
// answer here is = 6 = 2 + 5 -1= 6
//

// 1, 2, 3, 4, 5, 6, 7, 8 ,9    prisoners
//                      1, 2   chocolates
// 3, 4, 5, 6, 7, 8, 9, 10,11
// 12
// Answer = 1 =
// 1,2, 3, 4, 5, 6 , 7, 8, 9, 10 prisoners
//                          1, 2 chocolates
// 3,4,5,  6, 7, 8, 9
