import java.awt.*;

public class Valleys {

    public static void main(String[] args) {
        String s = "UDDU";
        int counter = 0;
        int sealevel = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'D' && sealevel == 0) {
                int k;
                for ( k=i; k < s.length(); k++) {

                        if (s.charAt(k) == 'U') {
                            sealevel = sealevel + 1;
                            System.out.println("The mountain is added " + sealevel);
                        }
                        if (s.charAt(k) == 'D') {
                            sealevel = sealevel - 1;
                            System.out.println("The valley is added " + sealevel);
                        }
                        if (sealevel == 0) {
                            counter++;
                            System.out.println("The number of count in the string is " + counter);
                            System.out.println(counter);
                        }
                    }

                i=k;
                System.out.println("the value of i is "+i+"   "+"the value of K is "+k);
            }
        }
    }
}
/*
   ifsealevel == 0) {
           sealevel = -1;
           if (s.charAt(i + 1) == 'U') {
           sealevel = +1;
           } else if (s.charAt(i + 1) == 'D') {
           sealevel = -1;
           }
           if (sealevel == 0) {
           counter++;
           }*/
