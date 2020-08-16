public class HurdleRace {
    public static void main(String[] args){
      //  int k=5;
        int k=4;
       // int[] height= {1, 4, 5, 7, 8, 9};
        int[]  height= {1,6, 3, 5, 2};
        int key=0;

        for(int i=0; i<height.length; i++){
            System.out.println("This is the top key  " + key);
            if(height[i]> key){
                key= height[i];
            }
            System.out.println(key);
        }

        int returnkey= key- k;
        if(returnkey > 0) {
            System.out.println(returnkey);
           // return returnkey;
        }else{
            System.out.println(0);
           // return 0;
        }

    }
}
