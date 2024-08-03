public class Reverse_str {
    public static void main(String[] args) {
        String name = "Phani";
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev += name.charAt(i);
        }
        System.out.println(rev);
    }
}