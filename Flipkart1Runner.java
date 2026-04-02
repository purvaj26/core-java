class FlipkartRunner {
    public static void main(String[] args) {

        Flipkart flipkart = new Flipkart();

        boolean login = flipkart.login("Purvaj Ms","purv@123");
        System.out.println("Login status:" + login);

        String search1 = flipkart.search("Headset");
        System.out.println(search1);

        String search2 = flipkart.search("Headset","Boat");
        System.out.println(search2);

        String search3 = flipkart.search("Headset","Boat",1500);
        System.out.println(search3);

        String search4 = flipkart.search("Headset","Boat",1500,"Black");
        System.out.println(search4);

        String search5 = flipkart.search("Headset","Boat",1500,"Black","Wireless");
        System.out.println(search5);
    }
}