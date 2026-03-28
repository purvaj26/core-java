class ZomatoRunner{
	public static void main(String[] args){

	System.out.println("------First Time Method Call------");

	String order1=Zomato.validateAndOrder(9876543210L,"Biryani","Meghana","Bangalore","Rahul");
	System.out.println(order1);

	System.out.println("------Second Time Method Call------");

	String order2=Zomato.validateAndOrder(9876543211L,"Pizza","Dominos","Mysore","Arjun");
	System.out.println(order2);

	}
}