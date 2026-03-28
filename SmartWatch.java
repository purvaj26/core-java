class SmartWatch
{
    static float watchPrice = 15000.0f;
    static String watchBrand = "Noise";
    static int manufactureYear = 2024;

    public static void getWatchPrice()
    {
        System.out.println("Watch Price: " + watchPrice);
    }

    public static String getWatchBrand()
    {
        System.out.println("Watch Brand: " + watchBrand);
        return "watchBrand";
    }

    public static String getWatchManufacturer(String manufacturer)
    {
        System.out.println("Watch Manufacturer: " + manufacturer);
        return "manufacturer";
    }

    public static void getWatchYear()
    {
        System.out.println("Manufacturing Year: " + manufactureYear);
    }
}