class Perfume
{
    static String perfumeNames[] = {
        "Chanel No.5",
        "Dior Sauvage",
        "Gucci Bloom",
        "Versace Eros",
        "Calvin Klein Eternity",
        "Armani Code",
        "Yves Saint Laurent Libre",
        "Burberry Her"
    };

    static float perfumePrice[] = {
        10500.0f, 9500.0f, 8700.0f, 9200.0f, 7600.0f, 8900.0f, 9800.0f, 8300.0f
    };

    static double perfumeRatings[] = {
        4.8, 4.7, 4.6, 4.5, 4.4, 4.6, 4.7, 4.5
    };

    static String perfumeBrand[] = {
        "Chanel",
        "Dior",
        "Gucci",
        "Versace",
        "Calvin Klein",
        "Armani",
        "Yves Saint Laurent",
        "Burberry"
    };

    public static void getPerfumeDetails()
    {
        for(int i=0;i<perfumeNames.length;i++)
        {
            System.out.println("Perfume Name : " + perfumeNames[i]);
            System.out.println("Price : " + perfumePrice[i]);
            System.out.println("Rating : " + perfumeRatings[i]);
            System.out.println("Brand : " + perfumeBrand[i]);
            System.out.println();
        }
    }
}