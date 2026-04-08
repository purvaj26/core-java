class SuperMarket {

    String name;
    String location;
    int products;
    int staff;
    String manager;
    double revenue;
    String type;
    boolean hasBilling;
    boolean hasParking;
    int year;

    public String addProduct(String product) {
        System.out.println("Product Added: " + product);
        return product;
    }

    public int totalProducts(int count) {
        System.out.println("Products: " + count);
        return count;
    }

    public String assignManager(String name) {
        System.out.println("Manager: " + name);
        return name;
    }

    public double generateBill(double amount) {
        System.out.println("Bill: " + amount);
        return amount;
    }

    public boolean startBilling(boolean status) {
        System.out.println("Billing: " + status);
        return status;
    }

    public boolean openParking(boolean status) {
        System.out.println("Parking: " + status);
        return status;
    }

    public String announceOffer(String offer) {
        System.out.println("Offer: " + offer);
        return offer;
    }

    public int customers(int count) {
        System.out.println("Customers: " + count);
        return count;
    }

    public String event(String event) {
        System.out.println("Event: " + event);
        return event;
    }

    public boolean security(boolean status) {
        System.out.println("Security: " + status);
        return status;
    }
}