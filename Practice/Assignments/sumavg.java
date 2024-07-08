import java.util.Scanner;

public class sumavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter 5 integers :- ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / 5;
        System.out.println(" sum is :- " + sum + " avarage is :- " + avg);

    }
}
