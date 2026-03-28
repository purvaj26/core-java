class AmazonRobotVacuum {

    // Method without parameters
    public static void cleanFloor() {
        System.out.println("Robot vacuum is automatically cleaning the floor");
    }

    // Method with 5 parameters
    public static void getVacuumDetails(String brand,
                                        int batteryLife,
                                        String cleaningMode,
                                        boolean wifiEnabled,
                                        String color) {

        System.out.println("Invoking getVacuumDetails");
        System.out.println("Brand : " + brand);
        System.out.println("Battery Life : " + batteryLife + " minutes");
        System.out.println("Cleaning Mode : " + cleaningMode);
        System.out.println("WiFi Enabled : " + wifiEnabled);
        System.out.println("Color : " + color);
    }

    // Method with 1 parameter
    public static void getPrice(double price) {
        System.out.println("Price of Robot Vacuum : ₹" + price);
    }
}