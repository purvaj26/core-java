class OlaRunner{

public static void main(String[] args){

System.out.println("------First Time Method Call------");

String ride1=Ola.validateAndBookRide(9876543210L,"Mandya","Mysore","Mini","Ravi");
System.out.println(ride1);

System.out.println("------Second Time Method Call------");

String ride2=Ola.validateAndBookRide(9876543211L,"Bangalore","Airport","Sedan","Kiran");
System.out.println(ride2);

}
}