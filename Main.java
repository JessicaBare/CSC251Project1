// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the Policy Number: ");
        int policyNumber = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        System.out.print("Please enter the Provider Name: ");
        String providerName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smoking = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double height = scanner.nextDouble();

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double weight = scanner.nextDouble();

        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smoking, height, weight);

        System.out.println();
        System.out.println("Policy Number: " + policy.policyNumber);
        System.out.println("Provider Name: " + policy.providerName);
        System.out.println("Policyholder’s First Name: " + policy.firstName);
        System.out.println("Policyholder’s Last Name: " + policy.lastName);
        System.out.println("Policyholder’s Age: " + policy.age);
        System.out.println("Policyholder’s Smoking Status: " + policy.smoking);
        System.out.println("Policyholder’s Height: " + policy.height + " inches");
        System.out.println("Policyholder’s Weight: " + policy.weight + " pounds");
        System.out.println("Policyholder’s BMI: " + String.format("%.2f", policy.calculateBMI()));
        System.out.println("Policy Price: $" + String.format("%.2f", policy.calculatePolicyPrice()));
    }
}
