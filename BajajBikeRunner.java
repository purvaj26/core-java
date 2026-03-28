class BajajBikeRunner {

    public static void main(String[] args) {

        System.out.println("----- First Method Call -----");
        boolean bikeStatus = BajajBike.startOrStop();
        System.out.println("Main Method Bike Status: " + bikeStatus);

        System.out.println("----- Second Method Call -----");
        BajajBike.startOrStop();

        System.out.println("----- Third Method Call -----");
        BajajBike.startOrStop();

        System.out.println("----- Fourth Method Call -----");
        BajajBike.startOrStop();

        System.out.println("----- Fifth Method Call -----");
        BajajBike.startOrStop();
    }
}