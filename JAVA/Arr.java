import java.util.*;

public class Arr {
    public static void main(String args[]) {
        int[] myarr = new int[5];
        myarr[0] = 1;
        myarr[1] = 2;
        myarr[2] = 3;
        myarr[3] = 4;
        myarr[4] = 5;
        System.out.println(Arrays.toString(myarr));
        for (int i = 0; i < myarr.length; i++) {
            System.out.println(i);
        }
    }
}
