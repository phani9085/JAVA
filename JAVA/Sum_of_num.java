public class Sum_of_num {
    public static void main(String arg[]) {
        int num = 1234;
        int sum = 0;
        for (sum = 0; num != 0; num = num / 10) {
            sum = sum + num % 10;
        }
        System.out.println(sum);
    }
}