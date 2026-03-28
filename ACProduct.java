class ACProduct {
    public static void main(String[] args) {

        int acId = 2201;
        String brand = "LG Dual Inverter AC";
        float price = 45999.00f;
        byte tonnage = 2; 
        double powerUsage = 1.8;  // per hour (kWh)
        short stock = 40;
        char starRating = '5';
        boolean wifiEnabled = true;

        // Annual electricity cost estimate (5 hrs daily, ₹6 per unit)
        double yearlyUnits = powerUsage * 5 * 365;
        double estimatedBill = yearlyUnits * 6;

        System.out.println("AC ID: " + acId);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("Tonnage: " + tonnage + " Ton");
        System.out.println("Energy Star: " + starRating);
        System.out.println("WiFi Enabled: " + wifiEnabled);
        System.out.println("Estimated Yearly Electricity Bill: ₹" + estimatedBill);
        System.out.println("Stock Available: " + stock);
    }
}