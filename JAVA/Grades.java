import java.util.*;

public class Grades {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks:");
        int marks = sc.nextInt();
        if (marks > 90) {
            System.out.println("Grade A");
        } else if (marks > 80) {
            System.out.println("Grade B");
        } else if (marks > 70) {
            System.out.println("Grade c");
        } else if (marks > 60) {
            System.out.println("Grade D");
        } else if (marks > 50) {
            System.out.println("Grade E");
        } else {
            System.out.println("Fail");
        }
    }
}
