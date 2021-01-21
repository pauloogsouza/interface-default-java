package application;

import model.services.BrazilInterestServices;
import model.services.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();
        InterestService interest = new BrazilInterestServices();

        System.out.print("Payment after " + months + " months: ");
        System.out.println(String.format("%.2f", interest.payment(amount, months)));

        sc.close();
    }
}
