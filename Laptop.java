class Laptop
{
    static float laptopPrice = 55000.5f;
    static String laptopBrand = "Dell";
    static int manufactureYear = 2022;

    public static void getLaptopPrice()
    {
        System.out.println("Laptop Price: " + laptopPrice);
    }

    public static String getLaptopBrand()
    {
        System.out.println("Laptop Brand: " + laptopBrand);
        return "laptopBrand";
    }

    public static String getLaptopManufacturer(String manufacturer)
    {
        System.out.println("Laptop Manufacturer: " + manufacturer);
        return "manufacturer";
    }

    public static void getLaptopYear()
    {
        System.out.println("Manufacturing Year: " + manufactureYear);
    }
}