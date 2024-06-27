import java.util.Scanner;

public class Salary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic salary :- ");

        double sal = sc.nextInt();
        double basic_sal;
        double withdraw;
        System.out.println(" enter amout to be withdraw :- ");
        withdraw = sc.nextInt();
        if (withdraw <= sal) {

            if (sal > 25000) {
                basic_sal = withdraw - (sal - (sal * 0.10));
            } else {
                basic_sal = sal - withdraw;
            }
            System.out.println(" your final Amount  is :- " + basic_sal);
        } else {
            System.out.println(" enter correct withdrow amount");
        }
    }
}
