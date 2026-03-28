class PaytmRunner{

public static void main(String[] args){

System.out.println("------First Time Method Call------");

String pay1=Paytm.validateAndSendMoney(9876543210L,"Ravi","SBI","500","Rahul");
System.out.println(pay1);

System.out.println("------Second Time Method Call------");

String pay2=Paytm.validateAndSendMoney(9876543211L,"Kiran","HDFC","1000","Arjun");
System.out.println(pay2);

}
}