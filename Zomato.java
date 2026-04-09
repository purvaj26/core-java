class Zomato
{
    public double getPriceByFoodName(String foodName)
    {
        System.out.println("invoking getPriceByFoodName in Zomato: " + foodName);
        double price = 0.0;

        // Using .equals() is the best practice for String comparison in Java
        if("Egg Rice".equals(foodName))
        {
            price = 75.0;
        }
        else if("Fried chicken".equals(foodName))
        {
            price = 80.99;
        }
        else if("Paratha".equals(foodName))
        {
            price = 70.21;
        }
        else if("Veg Biriyani".equals(foodName))
        {
            price = 150.0;
        }
        else if("Dragon chicken".equals(foodName))
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
        System.out.println("invoking getTotalAmountByPriceAndQuantity");

        double totalAmount = price * quantity;

        System.out.println("end of getTotalAmountByPriceAndQuantity");
        return totalAmount;
    }

    public double getDiscount(double totalAmount)
    {
        System.out.println("invoking getDiscount");

        // Applies a 10% discount
        double discountedPrice = totalAmount - (totalAmount * 0.10); 

        System.out.println("end of getDiscount");
        return discountedPrice;
    }
}