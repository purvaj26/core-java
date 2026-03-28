class OnlineOrder {
    public static void main(String[] args) {

        byte quantity = 2;
        short deliveryDays = 5;
        int price = 1999;
        long orderId = 987654321234L;
        float discount = 10.5f;
        double totalAmount = 1799.75;
        char paymentMode = 'C';
        boolean isDelivered = false;
        String productName = "Headphones";

        System.out.println("Quantity: " + quantity);
        System.out.println("Delivery Days: " + deliveryDays);
        System.out.println("Price: " + price);
        System.out.println("Order ID: " + orderId);
        System.out.println("Discount: " + discount);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Payment Mode: " + paymentMode);
        System.out.println("Delivered: " + isDelivered);
        System.out.println("Product Name: " + productName);
    }
}