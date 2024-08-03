public class Reverse {
    public static void main(String[] args) {
        int num = 123456;
        int reverse = 0;
        for (; num != 0; num = num / 10) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
        }
        System.out.println(reverse);
    }
}