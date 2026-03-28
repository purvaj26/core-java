class BookDetailss{
  static String bookNames[]={"harry potter","lard of the ring","tale of two","ocean","Mocking"};	
  static float bookPrice[]={120000.56f,432555.09f,34225.0f,120000.09f,780000.08f};
  static int bookratings[]={3,5,7,8,9,5,};
  public static void getBookDetailss(){
  for(int index=0;index<bookNames.length;index++){
	  System.out.println("Book Names:"+bookNames[index]);
	  System.out.println("Book price:"+bookPrice[index]);
	  System.out.println("Book ratings:"+bookratings[index]);
	  System.out.println("----------");
	  
  }
  }
  }