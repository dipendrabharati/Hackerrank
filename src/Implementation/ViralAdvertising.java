public class ViralAdvertising {
    public static void main(String[] args){
        int n = 50;
        int shared = 5;
        int liked = 2;
        int commulative=2;
        for(int i=2; i<=n; i++){
            shared= liked * 3;
            liked = shared / 2;
            System.out.println(liked);
            commulative += liked;
            System.out.println(commulative);
        }
        System.out.println(commulative);


    }
}
// for loop to go from day 1 to day x
// shared, liked, commulative will be intialized
// shared= liked * 3;
// liked = shared / 2;
// commulative = commulative + liked