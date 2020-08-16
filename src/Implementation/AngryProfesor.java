package Implementation;

public class AngryProfesor {
    public static void main(String[] args){
      //  int k=3;
        int k= 2;
      //  int[] a= {-1,-3, 4,2};
        int[] a= {0, -1, 2, 1};

        int count=0;
        for(int i=0; i< a.length; i++) {
            if (a[i] <= 0) {
                count++;
            }
        }
            if (count>=k){

                String returnvalue= "NO";
                System.out.println(returnvalue);
               // return returnvalue;
            }else{
                String returnvalue="YES";
                System.out.println(returnvalue);
                // return returnvalue;
            }
    }
}
