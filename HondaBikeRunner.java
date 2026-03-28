class HondaBikeRunner {

    public static void main(String[] args) {

        System.out.println("----- First Method Call -----");
        boolean bikeStatus = HondaBike.startOrStop();
        System.out.println("Main Method Bike Status: " + bikeStatus);

        System.out.println("----- Second Method Call -----");
        HondaBike.startOrStop();

        System.out.println("----- Third Method Call -----");
        HondaBike.startOrStop();

        System.out.println("----- Fourth Method Call -----");
        HondaBike.startOrStop();

        System.out.println("----- Fifth Method Call -----");
        HondaBike.startOrStop();
    }
}