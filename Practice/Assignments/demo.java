

import java.util.Scanner;

public class demo {
    public static void main(String args[]) {
        Scanner rt = new Scanner(System.in);

        System.out.println("Enter a number :- ");
        int num = rt.nextInt();
        if (num % 2 == 0) {
            System.out.println(" This is a Even number");
        } else {
            System.out.println("this is Odd number");
        }

    }
}
