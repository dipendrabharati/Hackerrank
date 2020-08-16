public class Electronicsshop {
    public static void main(String[] args) {
        int[] keyboards = {5};
        int[] drives = new int[]{4};
        int b = 5;
      /*  int[] value = new int[keyboards.length * drives.length];
        int k=0;
        int moneyspent = 0;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                value[k] = keyboards[i] + drives[j];
               System.out.println(value[k]);
                k++;
            }
        }
        for(int i=0; i < value.length; i++){
            int min= value[0];
            if(value[i]<= min){
                min =value[i];
               System.out.println(min);
            }
            if(b <min){
                moneyspent =-1;
            }else if (value[i] <= b && value[i] > moneyspent) {
                moneyspent=value[i];
            }
        }*/
        int max = -1;

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if (keyboards[i] + drives[j] <= b && keyboards[i] + drives[j] > max)
                    max = keyboards[i] + drives[j];
            }
        }

            System.out.println("The required money spent is " + max);
        }
    }



