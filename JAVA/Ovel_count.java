public class Ovel_count {
    public static void main(String[] args) {
        String name = "Phani";
        int count = 0;
        for (int i = name.length(); i >= 0; i++) {
            char ch = name.charAt(i);
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'e' || i == 'I' || i == 'O'
                    || i == 'U') {
                count++;
                System.out.println(count);
            } else {
                System.out.println("No Ovels");
            }
        }
    }
}