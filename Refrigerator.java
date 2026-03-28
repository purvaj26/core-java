class Refrigerator
{
    static float fridgePrice = 30000.0f;
    static String fridgeBrand = "Samsung";
    static int manufactureYear = 2022;

    public static void getFridgePrice()
    {
        System.out.println("Fridge Price: " + fridgePrice);
    }

    public static String getFridgeBrand()
    {
        System.out.println("Fridge Brand: " + fridgeBrand);
        return "fridgeBrand";
    }

    public static String getFridgeManufacturer(String manufacturer)
    {
        System.out.println("Fridge Manufacturer: " + manufacturer);
        return "manufacturer";
    }

    public static void getFridgeYear()
    {
        System.out.println("Manufacturing Year: " + manufactureYear);
    }
}