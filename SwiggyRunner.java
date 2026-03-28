class SwiggyRunner{

public static void main(String[] args){

System.out.println("------First Time Method Call------");

String order1=Swiggy.validateAndOrder(9876543210L,"Burger","KFC","Bangalore","Rahul");
System.out.println(order1);

System.out.println("------Second Time Method Call------");
String order2=Swiggy.validateAndOrder(9876543211L,"Pizza","PizzaHut","Mysore","Arjun");
System.out.println(order2);
System.out.println("------Second time method call------");
boolean result=Swiggy.validateRegisterFields(9876543211L,"Pizza","PizzaHut","Mysore","Arjun");
System.out.println(result);
}
}
