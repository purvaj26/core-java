class Netflix{

public static String validateAndSubscribe(long mobileNumber,String email,String planType,String password,String userName){

System.out.println("validateAndSubscribe method is started");

String subscribeStatus=null;

if(mobileNumber!=0 && email!=null && planType!=null && password!=null && userName!=null){

    if(password.length()>5 && userName.length()>3){

        subscribeStatus="Hello "+userName+" Your Netflix "+planType+" subscription is activated";

    }else{

        subscribeStatus="Please check the length of Password or User Name";

    }

}else{

    subscribeStatus="Please enter the valid subscription data";

}

System.out.println("validateAndSubscribe method is Ended");

return subscribeStatus;

}

}