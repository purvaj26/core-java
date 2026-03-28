class ElectricStoveProduct {
    public static void main(String[] args) {

        int stoveId = 6605;
        String brand = "Prestige Induction Cooktop";
        float price = 2799.00f;
        byte heatingLevels = 8;
        short powerWatts = 2000;
        double efficiency = 0.92;
        char surfaceType = 'G'; // G = Glass
        boolean autoShutOff = true;

        double effectivePower = powerWatts * efficiency;

        System.out.println("Stove ID: " + stoveId);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("Heating Levels: " + heatingLevels);
        System.out.println("Power: " + powerWatts + "W");
        System.out.println("Effective Power Output: " + effectivePower + "W");
        System.out.println("Surface Type: " + surfaceType);
        System.out.println("Auto Shut-Off: " + autoShutOff);
    }
}