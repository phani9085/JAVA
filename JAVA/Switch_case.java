import java.util.*;

public class Switch_case {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        String action;
        switch (temp) {
            case 80:
                action = "Low BP";
                break;
            case 90:
                action = "Normal";
                break;
            case 100:
                action = "Fewer";
                break;
            default:
                action = "Person expired";
        }
        System.out.println("the action is:" + action);
    }
}
