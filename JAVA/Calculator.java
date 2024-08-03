import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 marks");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        System.out.println("Enter opertaion");
        char opt = sc.next().charAt(0);
        double res;
        switch (opt) {
            case '+':
                res = m1 + m2;
                break;
            case '-':
                res = m1 - m2;
                break;
            case '*':
                res = m1 * m2;
                break;
            case '/':
                if (m2 != 0) {
                    res = m1 / m2;
                } else {
                    System.out.println("Error:division is zero");
                    return;
                }
                break;
            default:
                res = Double.NaN;
                System.out.println("Error:Invalid operation");
                return;
        }
        System.out.println(res);
    }
}