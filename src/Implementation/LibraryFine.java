public class LibraryFine {
    public static void main(String[] args){
        int d1= 2;
        int m1 = 7;
        int y1 = 1014;

        int d2 = 1;
        int m2 =1;
        int y2 = 2015;

        int fine =0;

        if ( y1 == y2 && m1 == m2 && d1> d2){     // month and year are same but days late
            fine = 15 *  ( d1 - d2);

        } else if  ( y1 ==y2 && m1 > m2) {         // if year is same but days late
            fine = 500 * (m1-m2);

        } else if ( y1> y2) {                     // if it's year late
            fine= 10000;
        } else {
            fine=0;
        }
        System.out.println(fine);
    }
}
// Brute Force Approach: if conditions