package Implementation;

public class UtopianTree {
    public static void main(String[] args) {
        int n=1;
        int height=1;
        for (int i = 0; i <= n; i++) {

            if( i>0 && i%2 ==1){
                height= 2*height;
            } else if(i>0 && i%2 ==0) {
                height= height+1;
            }
        }
        System.out.println(height);
    }
}