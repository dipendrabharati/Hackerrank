import static java.lang.StrictMath.sqrt;

public class SherlockandSquares {
    public static void main(String[] args){
        int a=24;
        int b=49;
        int c=0;                 // we do a squareroot of c
        int d = 0;               // we do a squareroot of d
        int count=0;
        while( a < b && sqrt(a)!=(int) sqrt(a)){     // while the square root is not an integer
             a++;                                    // we increase the value by 1
        }
        if(sqrt(a)==(int)sqrt(a)) {
            c = (int) sqrt(a);
        }
        System.out.println("This is the lower limit  "+ c);

        while( b > a && sqrt(b)!=(int)sqrt(b)){
            b--;
        }
        if(sqrt(b)==(int)sqrt(b)){
            d=(int)sqrt(b);
        }
        System.out.println("This is the upper limit  " + d);

        if( d !=0 & c!=0) {
            count = d - c + 1;
        }
        System.out.println(count);
    }
}
// Brute-force approach: Go through each element, for loop and check if it's a square root
// how do you check if a number is a pure square root
// >>> if there is no decimal >>> i.e. if it's not a float
// Efficient Approach: 16 is the nearest number which is a square of 4
// >>> 25 is the last number that is a square of 5
// >>> So we have range from 17 to 24, that means basically there is no number
// for 3 and 9   >>>  next number is 4 which is a square of 2,
// >>> 9 is a square of 3, so we have 2 and 3 and there is no numbers in between hence 2
//Efficient approach: Check if lower number is a square >>> If not check the number next to it
//>>> then check if the upper limit number is a square  >>> If not keep on decreasing until you find the number
//>>> finalnumber x = upper - lower  + 1;


/*
    int a=17;
    int b=24;
    double c =0;
    int count=0;
        for(int i=a; i <= b; i++){
                c =sqrt(i);
                System.out.println(c);
                if( c == (int)c){
                count++;
                }
                }
                System.out.println(count);*/
