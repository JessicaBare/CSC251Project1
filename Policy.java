public class Policy {
    public int policyNumber;
    public String providerName;
    public String firstName;
    public String lastName;
    public int age;
    public String smoking;
    public double height;
    public double weight;


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

    public double calculateBMI() {
        double bmi = (this.weight * 703 / (this.height * this.height));
        return bmi;
    }

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
}