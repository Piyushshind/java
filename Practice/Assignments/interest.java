import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter the time period (in years): ");
        int time = sc.nextInt();
        
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

    }
}
