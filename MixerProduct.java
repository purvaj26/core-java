class MixerProduct {
    public static void main(String[] args) {

        int mixerId = 4403;
        String brand = "Preethi Mixer Grinder";
        float price = 3499.00f;
        byte jars = 3;
        short motorPower = 750; // watts
        double warrantyYears = 2.0;
        char bodyMaterial = 'S'; // S = Steel
        boolean overloadProtection = true;

        System.out.println("Mixer ID: " + mixerId);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("Jars Included: " + jars);
        System.out.println("Motor Power: " + motorPower + "W");
        System.out.println("Warranty: " + warrantyYears + " Years");
        System.out.println("Body Material: " + bodyMaterial);
        System.out.println("Overload Protection: " + overloadProtection);
    }
}