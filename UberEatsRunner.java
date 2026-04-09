public class UberEatsRunner 
{
    public static void main(String[] args) 
    {
        // 1. Create the UberEats object
        UberEats app = new UberEats();

        // 2. Specify order details
        String selectedFood = "Dose";
        int qty = 2;

        System.out.println("--- Welcome to UberEats ---");

        // 3. Process the order
        double unitPrice = app.getPriceByFoodName(selectedFood);

        if (unitPrice > 0) 
        {
            double subTotal = app.getTotalAmountByPriceAndQuantity(unitPrice, qty);
            double finalBill = app.getDiscount(subTotal);

            // 4. Display Final Receipt
            System.out.println("***************************");
            System.out.println("Item: " + selectedFood);
            System.out.println("Price: " + unitPrice);
            System.out.println("Quantity: " + qty);
            System.out.println("Subtotal: " + subTotal);
            System.out.println("Final Bill (Discounted): " + finalBill);
            System.out.println("***************************");
        } 
        else 
        {
            System.out.println("Sorry, " + selectedFood + " is not available on UberEats.");
        }
    }
}