import java.lang.reflect.Array;
import java.util.Arrays;

public class SequenceEquation {
    public static void main(String[] args){
            int n=3;
            int[] p= {2, 3, 1};
            int[] newarray =new int[p.length];
            int[] finalarray = new int[p.length];
            // position of 1 (x) = 3 (y)
            // position of 3 (y) = 2    - e1
            // postion  of 2 (x) = 1 (y)
            // position of 1 (y) = 3    - e2
            // position of 3 (x) = 2 (y)
            // position of 2 (y) = 1    -e3
            // [e1, e2, e3] = [ 2, 3, 1];
        int j=0;

        for(int i=0; i < p.length; i++){
            System.out.println("This is i " + i);
            if (p[i]==j+1) {        // if it finds 1 in the array,
                newarray[j]=i+1;  // new array will keep the position of 1
                System.out.println("This the newly added element " + newarray[j]);

              finalarray[i]= p[j];
              System.out.println("This is finalarray element "+ finalarray[i]);
                i=-1;              // I want to repeat the loop from begining
                j++;              // the next element to look for becomes 1+1
                System.out.println("This is the value of j  " + j);
            }
            System.out.println("This is the present value of i "+ i);
        }
        System.out.println(Arrays.toString(newarray));

        for(int i=0; i < newarray.length; i++){
           finalarray[i]= newarray[newarray[i]-1];
        }

        System.out.println(Arrays.toString(finalarray));
    }
}
// x = p(y) = 1 ,  p(y1) = y,  p ( p(y1)) = 1
// 1 is at position y=3
// Now we need to look for if there a y(=3) that exits in the array
// If yes, at what position, y1= 4
// So y1=4 is our answer
// Both number of elements and the value of each element is less than 50.
// Procedure:
// find the position y for x =1
// find the position y1 for y (x=3)

