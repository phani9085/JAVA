public class Nat_num_Even {
    public static void main(String args[]) {
        int n = 11;
        int odd = 0;
        int even = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even += i;
                System.out.println("sum of even " + even);
            } else {
                odd += i;
                System.out.println("sum of odd " + odd);
            }
        }
    }
}
