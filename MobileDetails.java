class MobileDetails {

    static int mobilePrice[] = {15000, 20000, 25000, 30000, 35000};
    static short mobileRAM[] = {4, 6, 8, 12, 16};
    static char mobileGrade[] = {'A','B','A','C','B'};
    static double mobileRating[] = {4.2, 4.5, 4.7, 4.1, 4.6};

    public static void getMobileDetails(){

        for(int index=0; index<mobilePrice.length; index++){

            System.out.println("Mobile Price: "+mobilePrice[index]);
            System.out.println("Mobile RAM: "+mobileRAM[index]);
            System.out.println("Mobile Grade: "+mobileGrade[index]);
            System.out.println("Mobile Rating: "+mobileRating[index]);
            System.out.println("--------------");
        }
    }
}