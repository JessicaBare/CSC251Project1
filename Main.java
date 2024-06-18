// Main.java
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<Policy>();
        try {
            File file = new File("PolicyInformation.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                int policyNumber = scanner.nextInt();
                scanner.nextLine(); // consume the newline

                String providerName = scanner.nextLine();

                String firstName = scanner.nextLine();

                String lastName = scanner.nextLine();

                int age = scanner.nextInt();
                scanner.nextLine();

                String smoking = scanner.nextLine();

                double height = scanner.nextDouble();

                double weight = scanner.nextDouble();
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smoking, height, weight);
                policies.add(policy);
            }

            for (Policy policy : policies) {
                System.out.println(policy.toString());
            }

        } catch (IOException e) {
            System.out.println("Something went wrong reading the file: " + e.getMessage());
        }
    }
}
