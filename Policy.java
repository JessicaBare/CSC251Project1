public class Policy {
    public int policyNumber;
    public String providerName;
    public String firstName;
    public String lastName;
    public int age;
    public String smoking;
    public double height;
    public double weight;

    /**
     * Default Cconstructor
     */
    public Policy() {
        this.policyNumber = 0;
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smoking = "non-smoker";
        this.height = 0;
        this.weight = 0;
    }

    /**
     * Paramterized Constructor
     * @param policyNumber - the policy number
     * @param providerName - the name of the provider
     * @param firstName - policy holder's first name
     * @param lastName - policy holder's last name
     * @param age - policy holder's age
     * @param smoking - does the policy holder smoke
     * @param height - policy holder's height
     * @param weight - policy holder's weight
     */
    public Policy(int policyNumber, String providerName, String firstName, 
        String lastName, int age, String smoking, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smoking = smoking;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Calculates the BMI
     * @return bmi - the calculated bmi
     */
    public double calculateBMI() {
        double bmi = (this.weight * 703 / (this.height * this.height));
        return bmi;
    }

    /**
     * Calculates the policy price
     * @return calculated price
     */
    public double calculatePolicyPrice() {
        double basePrice = 600;
        if (this.age > 50) {
            basePrice += 75;
        }
        if (this.smoking.equalsIgnoreCase("smoker")) {
            basePrice += 100;
        }
        double bmi = calculateBMI();
        if (bmi > 35) {
            basePrice += (bmi - 35) * 20;
        }
        return basePrice;
    }

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + "\n" +
                "Provider Name: " + providerName + "\n" +
                "Policyholder’s First Name: " + firstName + "\n" +
                "Policyholder’s Last Name: " + lastName + "\n" +
                "Policyholder’s Age: " + age + "\n" +
                "Policyholder’s Smoking: " + smoking + "\n" +
                "Policyholder’s Height: " + height + "\n" +
                "Policyholder’s Weight: " + weight + "\n" +
                "Policyholder’s BMI: " + String.format("%.2f", calculateBMI()) + "\n" +
                "Policy Price: " + String.format("$%.2f", calculateBMI()) + "\n";
    }
}