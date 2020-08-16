package Implementation;

public class ValleysNewway {


        public static void main(String[] args) {
            String s = "DUUDDU";
            int counter = 0;
            int sealevel = 0;
            for (int i = 0; i < s.length(); i++) {

                        if (s.charAt(i) == 'U') {
                            sealevel = sealevel + 1;
                            System.out.println("The mountain is added " + sealevel);
                        }
                        if (s.charAt(i) == 'D') {
                            sealevel = sealevel - 1;
                            System.out.println("The valley is added " + sealevel);
                        }

                if (sealevel == 0 && s.charAt(i)=='U') {
                   counter++;
                    System.out.println("The number of count in the string is " + counter);
                    System.out.println(counter);
                }
                    }
            System.out.println(counter);
            }
        }

