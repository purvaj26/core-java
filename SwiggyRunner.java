class SwiggyRunner {

    public static void main(String[] args) {

        Swiggy swiggy = new Swiggy();

        boolean loginStatus = swiggy.login("Purvaj MS","purv@123");
        System.out.println("Login status:"+loginStatus);

        String search1 = swiggy.search("Chicken Fry");
        System.out.println(search1);

        String search2 = swiggy.search("Chicken Fry","Amaravati Hotel");
        System.out.println(search2);

        String search3 = swiggy.search("Chicken Fry","Amaravati Hotel",350);
        System.out.println(search3);

        String search4 = swiggy.search("Chicken Fry","Amaravati Hotel",350,"NonVeg");
        System.out.println(search4);

        String search5 = swiggy.search("Chicken Fry","Amaravati Hotel",350,"NonVeg","Full");
        System.out.println(search5);

    }
}