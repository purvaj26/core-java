class Swiggy{

public static String validateAndOrder(long mobileNumber,String foodName,String restaurantName,String address,String userName){

System.out.println("validateAndOrder method is started");

String orderStatus=null;

if(mobileNumber!=0 && foodName!=null && restaurantName!=null && address!=null && userName!=null){

    if(foodName.length()>3 && restaurantName.length()>3 && userName.length()>3){

        orderStatus="Hello "+userName+" Your order "+foodName+" from "+restaurantName+" is placed successfully";

    }else{

        orderStatus="Please check the length of Food Name, Restaurant Name or User Name";

    }

}else{

    orderStatus="Please enter the valid order details";

}

System.out.println("validateAndOrder method is Ended");

return orderStatus;

}
public static boolean validateRegisterFields(long mobileNumber,String foodName,String pasw,String fullName,String userName)
{
	System.out.println("validateRegisterFields is started");
	boolean isValidate=false;
	if (mobileNumber!=0)
	{
		isValidate=true;
	}
	if(pasw!=null)
	{
		isValidate=true;
	}
	if(fullName!=null)
	{
		isValidate=true;
	}
	if(userName!=null)
	{
		isValidate=true;
	}
	System.out.println("validateRegisterFields is started");
	return isValidate;
}
}
