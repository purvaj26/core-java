class AmazonDrone {

    public static void fly() {
        System.out.println("Drone is flying high in the sky");
    }

    public static void getDroneDetails(String brand,
                                       int cameraMP,
                                       int batteryTime,
                                       int range,
                                       String color) {

        System.out.println("Invoking getDroneDetails");
        System.out.println("Brand : " + brand);
        System.out.println("Camera : " + cameraMP + " MP");
        System.out.println("Battery Time : " + batteryTime + " mins");
        System.out.println("Range : " + range + " meters");
        System.out.println("Color : " + color);
    }

    public static void getPrice(double price) {
        System.out.println("Price of Drone : ₹" + price);
    }
}