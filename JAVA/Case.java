public class Case {
    public static void main(String args[]) {
        String lightcolor = "Green";
        String action;
        switch (lightcolor) {
            case "Red":
                action = "Stop";
                break;
            case "Yellow":
                action = "Slow";
                break;
            case "Green":
                action = "Go";
                break;
            default:
                action = "invalid light color";
        }
        System.out.println("the action is:" + action);
    }
}
