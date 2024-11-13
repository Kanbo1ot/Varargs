import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(contains(1, 2,1,4,5,6,7,8,9,9,7,6,56,65,6454,45645,3546,45));
    }

    public static boolean contains(int number, int... varargs) {

        boolean fount = false;

        for (int i = 0; i < varargs.length; i++) {

            if (number == varargs[i]) {
                fount = true;

            }
        }



        return fount;
    }
}