class NetflixRunner{

public static void main(String[] args){

System.out.println("------First Time Method Call------");

String sub1=Netflix.validateAndSubscribe(9876543210L,"rahul@gmail.com","Premium","abc12345","Rahul");
System.out.println(sub1);

System.out.println("------Second Time Method Call------");

String sub2=Netflix.validateAndSubscribe(9876543211L,"arjun@gmail.com","Basic","pass567","Arjun");
System.out.println(sub2);

}
}