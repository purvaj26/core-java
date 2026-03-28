class AmazonDroneRunner {

    public static void main(String[] args) {

        AmazonDrone.fly();

        AmazonDrone.getDroneDetails(
                "DJI",
                48,
                30,
                5000,
                "Grey"
        );

        AmazonDrone.getPrice(74999);
    }
}