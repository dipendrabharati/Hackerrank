public class TaumAndBday {
    public static void main(String[] args){
        int b= 71805;
        int w = 9169;
        int bc = 905480;
        int wc = 255669;
        int z = 334440;
        long total =0;

        if(bc > wc + z){
            total = (long) (b+w) * wc + (long) b * z;

        }else if( wc > bc+z){
            total = (long) (b+w) * bc + (long) w * z;
        }else {
            total= (long) b * bc + (long) w * wc;
        }
        System.out.println(total);
    }
}
