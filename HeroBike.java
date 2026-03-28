class HeroBike {

    static String bikeNames[] = {"Hero Splendor", "Hero HF Deluxe", "Hero Passion Pro", "Hero Glamour", "Hero Xtreme"};
    static float bikePrice[] = {75000.50f, 65000.75f, 82000.60f, 90000.40f, 120000.90f};
    static int bikeMileage[] = {65, 70, 60, 55, 50};

    public static void getBikeDetails(){

        for(int index = 0; index < bikeNames.length; index++){

            System.out.println("Bike Name: " + bikeNames[index]);
            System.out.println("Bike Price: " + bikePrice[index]);
            System.out.println("Bike Mileage: " + bikeMileage[index]);
            System.out.println("--------------------");

        }
    }
}