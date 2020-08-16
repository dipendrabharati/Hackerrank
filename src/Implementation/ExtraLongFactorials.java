import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args){
        int n=30;
        //BigInteger factorial = new BigInteger("30")
        BigInteger factorial = new BigInteger(String.valueOf(n)); // wrapping in as string
        for(int i=n-1; i>0; i--) {
            factorial= factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
