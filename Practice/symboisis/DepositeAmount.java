package Practice.symboisis;

import java.util.Scanner;

public class DepositeAmount {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name = sc.nextLine();

        System.out.println("Enter your salary");
        int salary = sc.nextInt();

        System.out.println("Enter Deposite amount");
        int deposite = sc.nextInt();

        System.out.println("Name is :- " + name);
        System.out.println("Salary is :- " + salary);
        System.out.println("Deposited amount is :- " + deposite);
    }
}
