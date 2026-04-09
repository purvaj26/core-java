class UberEats
{
    public double getPriceByFoodName(String foodName)
    {
        System.out.println("invoking getPriceByFoodName in UberEats: " + foodName);
        double price = 0.0;

        // Using .equals() for reliable String comparison
        if("Egg Rice".equals(foodName))
        {
            price = 75.0;
        }
        else if("Fried Rice".equals(foodName))
        {
            price = 50.99;
        }
        else if("Dose".equals(foodName))
        {
            price = 85.21;
        }
        else if(" DumBiriyani".equals(foodName))
        {
            price = 140.0;
        }
        else if("Boti Gojju".equals(foodName))
        {
            price = 150.0;
        }
        else
        {
            price = 0.0;
        }

        System.out.println("end of getPriceByFoodName");
        return price;
    }

    public double getTotalAmountByPriceAndQuantity(double price, int quantity)
    {
        System.out.println("invoking getTotalAmountByPriceAndQuantity in UberEats");
        double totalAmount = price * quantity;
        System.out.println("end of getTotalAmountByPriceAndQuantity");
        return totalAmount;
    }

    public double getDiscount(double totalAmount)
    {
        System.out.println("invoking getDiscount in UberEats");
        // Logic: Total - 10% discount
        double discountedPrice = totalAmount - (totalAmount * 0.10); 
        System.out.println("end of getDiscount");
        return discountedPrice;
    }
}