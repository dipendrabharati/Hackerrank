public class JumpingCloudLatter {
    public static void main(String[] args){
        int[] c = { 0, 0, 0, 1, 0, 0};
        int jump=0;
        int i=0;

       while( i < c.length){
            System.out.println(i);
            if(i+2 < c.length && c[i+2] == 0){
                i=i+2;
                System.out.println("This is jump size 2  "+ i);
            }else {
                i++;
            }
           jump++;

           System.out.println("This is JumpNO " + jump);
            if(i==c.length-1){
                break;
            }
        }
    }
}
// To Get: Minimum number of jumps
// for loop : Just try to jump two every time i guess
// if i+2 =='0', count+2;  else count+1;
// 0 1 0 1 0 0 1 0 0
// Basically, I will make jump size '2' whenever I can,  when I reach end and i+2 > length-1, then make jump size 1