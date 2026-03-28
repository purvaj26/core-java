class LaptopDetails {

    static int laptopPrice[] = {45000, 55000, 65000, 75000, 85000};
    static short laptopRAM[] = {8, 8, 16, 16, 32};
    static char laptopGrade[] = {'A','A','B','B','A'};
    static double laptopRating[] = {4.3, 4.6, 4.5, 4.2, 4.8};

    public static void getLaptopDetails(){

        for(int index=0; index<laptopPrice.length; index++){

            System.out.println("Laptop Price: "+laptopPrice[index]);
            System.out.println("Laptop RAM: "+laptopRAM[index]);
            System.out.println("Laptop Grade: "+laptopGrade[index]);
            System.out.println("Laptop Rating: "+laptopRating[index]);
            System.out.println("--------------");
        }
    }
}