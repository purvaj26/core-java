class OnlineProduct {
    public static void main(String[] args) {

        int productId = 10125;
        float productPrice = 1499.75f;
        long sellerContact = 9876543210L;
        double productRating = 4.4;
        byte discountPercentage = 15;
        short itemsInStock = 320;
        char deliveryType = 'F';   // F = Fast Delivery
        boolean isReturnable = true;
        String productName = "Wireless Headphones";

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + productPrice);
        System.out.println("Seller Contact: " + sellerContact);
        System.out.println("Rating: " + productRating);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Items In Stock: " + itemsInStock);
        System.out.println("Delivery Type: " + deliveryType);
        System.out.println("Returnable: " + isReturnable);
    }
}