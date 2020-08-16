public class DivisibleSumPairs {
    public static void main(String[] args) {
        int n = 6, k = 3;
        int[] ar = {1, 3, 2, 6, 1, 2};
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j=i+1; j < n; j++) {

                sum = ar[i] + ar[j];
                if (i < j && sum % k == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}