import java.util.*;

public class Age {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age:");
        int age = sc.nextInt();
        if (age >= 0 && age <= 12) {
            System.out.println("Kid");
        } else if (age >= 10 && age <= 19) {
            System.out.println("teenagers");
        } else if (age >= 20 && age <= 59) {
            System.out.println("adults");
        } else if (age >= 60) {
            System.out.println("Seniors");
        } else {
            System.out.println("Invalid age");
        }
    }
}