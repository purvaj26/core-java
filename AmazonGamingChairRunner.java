class AmazonGamingChairRunner {

    public static void main(String[] args) {

        AmazonGamingChair.recline();

        AmazonGamingChair.getChairDetails(
                "GreenSoul",
                "Leather",
                "Red & Black",
                120,
                true
        );

        AmazonGamingChair.getPrice(15999);
    }
}