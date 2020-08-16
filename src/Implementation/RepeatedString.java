public class RepeatedString {
    public static void main(String[] args){
            String s= "a";
            long n= 100000000;
            long rem =  n%s.length();
            System.out.println(rem);
            long count=0;
            long count1=0;
            for(int i=0; i< s.length(); i++){
                if(s.charAt(i)=='a'){
                    count++;
                }
            }
           System.out.println("The numbers of a  "+ count);

            for(int i=0; i<rem; i++){
                if(s.charAt(i)=='a'){
                    count1++;
                }
            }
            System.out.println("The number of a's in the rem is "+ count1);

            long totalcount=0;
            totalcount= n/s.length() * count+count1;
            System.out.println("The total number of totalcount is  " + totalcount);
    }
}
// long n : size of the string to consider
//For the given string, find the number of 'a': 2 a's in 'aba'
// size n =10, length of the string = m,  n/m i.e. 10 /3 = 3
// forloop, if charAt(postiton) = 'a', then count+=1;
// then 3*2 + 1 =7