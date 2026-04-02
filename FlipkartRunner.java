class FlipkartRunner {

  public static void main(String[] arg) {

    Flipkart Flipkart = new Flipkart();

    boolean login = Flipkart.login("Purvaj", "MS@43");
    System.out.println(login);
    
	
	
    String result = Flipkart.login(74113242, 0000);
    System.out.println(result);
	
	
    
    String msg = Flipkart.search("smartwatch");
    System.out.println(msg);
	
    msg = Flipkart.search("smartwatch", "Boult");
    System.out.println(msg);
	
    
    msg = Flipkart.search("smartwatch");
    System.out.println(msg);


    msg = Flipkart.search("smartwatch", "Boult", 7000, "black");
    System.out.println(msg);

    msg = Flipkart.search("smartwatch", "Boult", 7000, "black", "2GB");
    System.out.println(msg);
	
	
  }
}