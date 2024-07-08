import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[5];

        System.out.println("Element frequencies:");
        for (int i = 0; i < 5; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < 5; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println("Element " + arr[i] + " appears " + count + " times.");
            }
        }

        sc.close();
    }
}
