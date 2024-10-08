import java.util.Scanner;

public class LoanCalculator {

    public static void main(String[] args) {
        // Scanner to read input
        Scanner sc = new Scanner(System.in);

        // Read principal, number of years, and rate of interest
        float p = sc.nextFloat(); // Principal
        float n = sc.nextFloat(); // Number of years
        float r = sc.nextFloat(); // Rate of interest

        // Calculate interest
        float i = (p * n * r) / 100;

        // Calculate total amount to be returned (principal + interest)
        float a = p + i;

        // Calculate 2% discount on the total interest
        float d = (2 * i) / 100;

        // Calculate final settlement amount after discount
        float fs = a - d;

        // Output the values rounded to two decimal places
        System.out.printf("%.2f\n", i);  // Total interest
        System.out.printf("%.2f\n", a);  // Total amount before discount
        System.out.printf("%.2f\n", d);  // Discount on interest
        System.out.printf("%.2f\n", fs); // Final settlement amount
    }
}

