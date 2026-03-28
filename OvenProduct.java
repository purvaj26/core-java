class OvenProduct {
    public static void main(String[] args) {

        int ovenId = 5504;
        String model = "IFB Convection Oven";
        float price = 12499.75f;
        short capacity = 28; // liters
        byte autoMenus = 101;
        double powerRating = 1.4; // kWh
        char controlType = 'T'; // T = Touch
        boolean childLock = true;

        double cookingCostPerHour = powerRating * 6;

        System.out.println("Oven ID: " + ovenId);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
        System.out.println("Capacity: " + capacity + "L");
        System.out.println("Auto Menus: " + autoMenus);
        System.out.println("Control Type: " + controlType);
        System.out.println("Child Lock Available: " + childLock);
        System.out.println("Cost Per Hour (₹6/unit): ₹" + cookingCostPerHour);
    }
}