class FlipkartRunner{

public static void main(String[] args){

System.out.println("------First Time Method Call------");

String order1=Flipkart.validateAndBuy(9876543210L,"Laptop","Bangalore","UPI","Ravi");
System.out.println(order1);

System.out.println("------Second Time Method Call------");

String order2=Flipkart.validateAndBuy(9876543211L,"Headphones","Mysore","Card","Kiran");
System.out.println(order2);

}
}