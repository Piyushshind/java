import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String DefuserName = "Piyush07";
        System.out.println("Enter Username: ");
        String userName = sc.nextLine();
        String Defpass = "12345";
        System.out.println("Enter password: ");
        String pass = sc.nextLine(); 

        if (DefuserName.equals(userName)) {
            if (!Defpass.equals(pass)) {
                System.out.println("Invalid password");
            } else {
                System.out.println("Login successful");
            }
        } else {
            System.out.println("Invalid username");
        }

        sc.close();
    }
}



