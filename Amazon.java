class Amazon{

//return type PD/Non PD
public static String validateAndOrder(long mobileNumber,String productName,String address,String paymentType,String userName){

System.out.println("validateAndOrder method is started");

String orderStatus=null;

if(mobileNumber!=0 && productName!=null && address!=null && paymentType!=null && userName!=null){

    if(productName.length()>3 && address.length()>5 && userName.length()>3){

        orderStatus="Thank you "+userName+" Your order for "+productName+" is placed successfully";

    }else{

        orderStatus="Please check the length of Product Name, Address or User Name";

    }

}else{

    orderStatus="Please enter the valid data";

}

System.out.println("validateAndOrder method is Ended");

return orderStatus;

}

}