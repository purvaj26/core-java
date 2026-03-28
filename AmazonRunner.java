class AmazonRunner{

public static void main(String[] args){

System.out.println("------First Time Method Call------");

String order1=Amazon.validateAndOrder(9876543210L,"Laptop","Bangalore","UPI","Rahul");
System.out.println(order1);

System.out.println("------Second Time Method Call------");

String order2=Amazon.validateAndOrder(9876543211L,"Mobile","Mysore","Card","Arjun");
System.out.println(order2);

}
}