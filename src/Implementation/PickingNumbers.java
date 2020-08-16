import java.util.*;

public class PickingNumbers {

    public static void main(String[] args) {
        //List<Integer>a=Arrays.asList(4,6,5,3,3,1);
       // List<Integer>a=Arrays.asList(1, 2, 2, 3, 1, 2);
        List<Integer>a=Arrays.asList(1,1,2,2,4,4,5,5,5);

        Collections.sort(a);
      //  System.out.println(a);
        List<Integer>reqa= Arrays.asList();

        int counter1=1;

        List<Integer>finala= Arrays.asList();

        for(int i=0; i<a.size(); i++){

            int counter =1;

            for(int j=i+1; j< a.size(); j++){

                int sum = a.get(i) - a.get(j);

                if( Math.abs(sum)==0 || Math.abs(sum)==1) {
           //reqa.add(a.get(j));
                    counter++;
                    System.out.println(reqa);
                }
            }
         //  System.out.println(reqa);

             if(counter> counter1) {
                 counter1=counter;
             //  finala=reqa;
             }
            // System.out.println(Arrays.toString(finalarr)+ counter1);
        }
     // System.out.println(finala);
       System.out.println(counter1);
    }
}
