class Mobile
{
	static float mobilePrice=15000.6f;
	static String mobileBrand="oppo A16k";
	static int manufacturerYear=2019;
	
   public static void getMobileDetails()
   {
	   System.out.println("Mobile price:"+mobilePrice);
   }
       public static String getMobileBrand()
	   {
           System.out.println("Mobile Brand:"+mobileBrand);
		   return  "mobileBrand";
	   }		   
	      public static String getMobileManufacturer(String manufacturer)
		  {
			  System.out.println("Mobile Manufacturer:"+manufacturer);
			  return "manufacturer";
		  }
		     public static void  getMobileManufacturingYear()
			 {
				 System.out.println("Mobile Manufacturing Year:"+manufacturerYear);
			 }
		
}