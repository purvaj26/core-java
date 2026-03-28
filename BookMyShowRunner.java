class BookMyShowRunner{

public static void main(String[] args){

System.out.println("------First Time Method Call------");

String ticket1=BookMyShow.validateAndBookTicket(9876543210L,"KGF","PVR","Gold","Rahul");
System.out.println(ticket1);

System.out.println("------Second Time Method Call------");

String ticket2=BookMyShow.validateAndBookTicket(9876543211L,"Salaar","INOX","Silver","Arjun");
System.out.println(ticket2);

}
}