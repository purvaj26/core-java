class FridgeProduct {
    public static void main(String[] args) {

        int fridgeId = 3302;
        String model = "Samsung Double Door";
        float price = 30999.50f;
        short capacity = 345; // liters
        byte shelves = 4;
        double powerConsumption = 0.9; // per day
        char coolingType = 'F'; // F = Frost Free
        boolean inverterCompressor = true;

        double monthlyUnits = powerConsumption * 30;

        System.out.println("Fridge ID: " + fridgeId);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("Capacity: " + capacity + "L");
        System.out.println("Shelves: " + shelves);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Inverter Compressor: " + inverterCompressor);
        System.out.println("Estimated Monthly Units: " + monthlyUnits);
    }
}