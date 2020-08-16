public class AppendDelete {
    public static void main(String[] args){
        int k=9;
        String s= "hackerhappy";
        String t= "hackerrank";
        int n = 0;
        if(s.length()>t.length()){
            n=t.length();
        }else{
            n= s.length();
        }
        int count=0;
        for(int i=0; i< n; i++){
            if(s.charAt(i)==t.charAt(i)){
                count++;
            }else{
                break;
            }
        }
        int slen= s.length();
        int tlen= t.length();
        int minreqchar= (slen-count) + (tlen-count);

        if( slen >= tlen && minreqchar <= k) {
            System.out.println("Yes");
        } else if( tlen>slen && k>2 && k%minreqchar==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
