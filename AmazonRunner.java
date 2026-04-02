class AmazonRunner {

  public static void main(String[] args) {

    Amazon amazon = new Amazon();

    boolean loginResult = amazon.login("Purvaj MS", "purv@123");
    System.out.println("Login status: " + loginResult);

    String search1 = amazon.search("Shoes");
    System.out.println(search1);

    String search2 = amazon.search("Shoes", "Nike");
    System.out.println(search2);

    String search3 = amazon.search("Shoes", "Nike", 3000);
    System.out.println(search3);

    String search4 = amazon.search("Shoes", "Nike", 3000, "Black");
    System.out.println(search4);

    String search5 = amazon.search("Shoes", "Nike", 3000, "Black", "10");
    System.out.println(search5);

  }
}