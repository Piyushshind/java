import java.util.Scanner;

public class cheackinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean flag = false;
        System.out.println("Enter a digit :- ");
        int a = sc.nextInt();
        sc.close();
        for (int i = 1; i < 9; i++) {
            if (a == i) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Correct Number");
        } else {
            System.out.println("Wrong input");
        }
    }
}
