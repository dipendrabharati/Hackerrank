package Implementation.BeautifulDays;

public class BeautifulDaysPart2 {

    public static void main(String[] args) {
        int i = 20, j = 23, k = 6;
        int count = 0;

        for (int l = i; l <= j; l++) {

            int reversenum=0;

            while(i/10 != 0){
                reversenum = (i % 10) * 10 + reversenum;
            }
              System.out.println(reversenum);

            int diff = Math.abs(reversenum - l);

            //  System.out.println(diff/k);

            if (diff % k == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
// 1234
// 1234 mod 10, 4
// 120 mod 10, 0
// 12 mod 10, 2
//1 mod 10, 1
// 4 , 4 * 10 + 0 = 40,  43 * 10 + 2= 432,  432 * 10 + 1= 4021

// 1234 quo 10, 123
// 123 quo 10, 12
//12 quo 10, 1
//1 quo 10, 0