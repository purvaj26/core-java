class AmazonCoffeeMakerRunner {

    public static void main(String[] args) {

        AmazonCoffeeMaker.brewCoffee();

        AmazonCoffeeMaker.getCoffeeMakerDetails(
                "Prestige",
                6,
                "Automatic",
                800,
                "Black"
        );

        AmazonCoffeeMaker.getPrice(3499);
    }
}