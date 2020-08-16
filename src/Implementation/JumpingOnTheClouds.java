import java.util.Arrays;

public class JumpingOnTheClouds {
    public static void main(String[] args){
        int n = 16;
        int k = 1;
        int[] c ={1, 1, 1, 1, 1, 1, 1,1,1,1,1,1,1,1,1,1};
        int[] d = Arrays.copyOf(c,c.length+1);
        d[c.length] = d[0];
        System.out.println(d[c.length]);
        int e = 100;

        for(int i=k; i<d.length; i+=k){
            System.out.println("This is he clould no  " + i);
            if( d[i]==1){
                e = e -1 - 2;
                System.out.println("This is the cloud energy at i   " + e);
            }else{
                e = e - 1;
                System.out.println("This is the cloud energy at i   " + e);
            }
        }
        System.out.println("The final value of e " + e);
    }
}
// Things to consider
//increment = +2,  a[x] = ?, e = 100 - a[x]