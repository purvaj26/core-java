class LaptopData
{
    
    static int laptopPrice[] = {
        45000, 50000, 55000, 60000, 65000,
        70000, 75000, 80000, 85000, 90000
    };

    
    static String laptopBrand[] = {
        "Dell", "HP", "Lenovo", "Asus", "Acer",
        "Apple", "MSI", "Samsung", "LG", "Microsoft"
    };

    
    static double laptopScreenSize[] = {
        13.3, 14.0, 15.6, 16.0, 17.3,
        14.5, 13.5, 15.0, 16.5, 17.0
    };

    
    static short laptopRAM[] = {
        4, 8, 8, 16, 16,
        32, 4, 8, 16, 32
    };

public static void getLaptopDetails()
{
for(int index=0;index<laptopPrice.length;index++)
{
System.out.println("Laptop Price:"+laptopPrice[index]);
System.out.println("Laptop Brand:"+laptopBrand[index]);
System.out.println("Laptop Screen Size:"+laptopScreenSize[index]);
System.out.println("Laptop RAM:"+laptopRAM[index]);
System.out.println("-----------------------------------");
}
}
}