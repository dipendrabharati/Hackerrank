package Strings.NumberI;

public class NumberISeparateTheNumbers {
    public static void main(String[] args){
        String s= "99100";
        int count=0;
        int prev = Integer.parseInt(String.valueOf(s.charAt(0)));
        int pos=0;
        int curr=0;
        int noofd=0;
        int n = s.length()/2;

        for(int i=1; i<s.length();i++) {

            if (s.length() % 2 == 1) {
                while (noofd < n - 1) {
                    System.out.println("This is position i  " + i);
                    System.out.println("This is previous" + prev);

                    if (prev == 9 || prev > 9) {
                        String newv = s.substring(i, i + 2);
                        curr = Integer.parseInt(newv);
                        System.out.println("This is curr when prev is nine " + curr);
                        i++;

                    } else {
                        curr = Integer.parseInt(String.valueOf(s.charAt(i)));
                        System.out.println("This is the curr when prev is less than nine  " + curr);
                    }

                    if (curr - prev == 1) {
                        count++;
                        System.out.println("This is the value of count " + count);
                    } else {

                    }
                    prev = curr;
                }
            }
        }
//        if( s.length()> 1 &&count==s.length()){
//            System.out.println("YES"+" "+String.valueOf(s.charAt(0)));
//        }else{
//            System.out.println("NO");
//        }
    }
}
