public class ZomatoRunner 
{
    public static void main(String[] args) 
    {
        // 1. Create an object of the Zomato class
        Zomato zomato = new Zomato();

        // 2. Define the order details
        String item = "Fried chicken";
        int quantity = 2;

        System.out.println("--- Starting Zomato Order System ---");

        // 3. Get the price for the specific food item
        double pricePerItem = zomato.getPriceByFoodName(item);

        if (pricePerItem > 0) 
        {
            // 4. Calculate total amount based on quantity
            double totalAmount = zomato.getTotalAmountByPriceAndQuantity(pricePerItem, quantity);
            System.out.println("Total for " + quantity + " " + item + "(s): " + totalAmount);

            // 5. Calculate final price after a 10% discount
            double finalPrice = zomato.getDiscount(totalAmount);
            
            System.out.println("------------------------------------");
            System.out.println("Final Bill (After 10% Discount): " + finalPrice);
            System.out.println("------------------------------------");
        } 
        else 
        {
            System.out.println("Sorry, " + item + " is not available on our menu.");
        }
    }
}