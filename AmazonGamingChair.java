class AmazonGamingChair {

    public static void recline() {
        System.out.println("Gaming chair is reclining smoothly");
    }

    public static void getChairDetails(String brand,
                                       String material,
                                       String color,
                                       int weightCapacity,
                                       boolean adjustableHeight) {

        System.out.println("Invoking getChairDetails");
        System.out.println("Brand : " + brand);
        System.out.println("Material : " + material);
        System.out.println("Color : " + color);
        System.out.println("Weight Capacity : " + weightCapacity + " kg");
        System.out.println("Adjustable Height : " + adjustableHeight);
    }

    public static void getPrice(double price) {
        System.out.println("Price of Gaming Chair : ₹" + price);
    }
}