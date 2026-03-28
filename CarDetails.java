class  CarDetails{

   
    static long carPrice[] = {550000, 650000, 750000, 900000, 950000,650000, 670000, 850000, 820000, 770000};

    static short carEngineCC[] = {700, 1000, 1300, 1400, 1500,1700, 1600, 2000, 2200, 2400};

    static char carGrade[] = {'A','B','A','C','B','A','B','C','A','B'};

    static double carMileage[] = {15.5, 28.2, 14.8, 16.4, 15.9,19.3, 21.0, 14.8, 14.6, 16.5};
	
	public static void getCarDetails(){
	for(int index=0;index<carPrice.length;index++){
	  System.out.println("car Price:"+carPrice[index]);
	  System.out.println("car EngineCC:"+carEngineCC[index]);
	  System.out.println("car Grade:"+carGrade[index]);
	  System.out.println("car Mileage :"+carMileage[index]);
	  System.out.println("----------");
}
}
}