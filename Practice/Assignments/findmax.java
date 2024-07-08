import java.util.Scanner;

public class findmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < 5; i++) {
            // max = arr[i] > max ? arr[i] : arr[i + 1];
            // min = arr[i] < min ? arr[i] : arr[i + 1];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("MAx is :- " + max + " Min is :- " + min);
    }
}
