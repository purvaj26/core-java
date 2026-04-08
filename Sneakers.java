class Sneakers {
    // Instance Variables
    String brand;
    String model;
    int year;
    String color;
    double price;
    boolean isWaterproof;    // Replaced isElectric
    double size;             // Replaced seatingCapacity (UK/US Size)
    String material;         // Replaced fuelType (Leather, Mesh, Synthetic)
    double distanceCovered;  // Replaced mileage (Total km walked/run)
    String ownerName;

    // Static Variables
    static String country = "India";
    static String productCategory = "Footwear";

    // Methods
    public String putOn(String lacingStyle) {
        System.out.println("Sneakers worn using " + lacingStyle + " style");
        return lacingStyle;
    }

    public String takeOff(String location) {
        System.out.println("Sneakers removed at: " + location);
        return location;
    }

    public double walk(double steps) {
        System.out.println("Walking... Steps recorded: " + steps);
        return steps;
    }

    public double run(double pace) {
        System.out.println("Running at pace: " + pace + " min/km");
        return pace;
    }

    public String applyPolish(String shade) {
        System.out.println("Polishing Sneakers with " + shade + " wax");
        return shade;
    }

    public boolean toggleCushioning(boolean status) {
        System.out.println("Extra Arch Support: " + status);
        return status;
    }

    public double replaceSole(double cost) {
        System.out.println("Soling repaired. Cost incurred: " + cost);
        return cost;
    }

    public int showStepCount(int totalSteps) {
        System.out.println("Lifetime steps in these Sneakers: " + totalSteps);
        return totalSteps;
    }

    public boolean tieLaces(boolean status) {
        System.out.println("Laces secured: " + status);
        return status;
    }

    public String trackActivity(String activityType) {
        System.out.println("Activity tracked: " + activityType);
        return activityType;
    }
}