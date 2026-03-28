class AC
{
    static float acPrice = 42000.0f;
    static String acBrand = "LG";
    static int manufactureYear = 2023;

    public static void getACPrice()
    {
        System.out.println("AC Price: " + acPrice);
    }

    public static String getACBrand()
    {
        System.out.println("AC Brand: " + acBrand);
        return "acBrand";
    }

    public static String getACManufacturer(String manufacturer)
    {
        System.out.println("AC Manufacturer: " + manufacturer);
        return "manufacturer";
    }

    public static void getACYear()
    {
        System.out.println("Manufacturing Year: " + manufactureYear);
    }
}