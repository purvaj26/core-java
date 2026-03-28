class Paytm{

public static String validateAndSendMoney(long mobileNumber,String receiverName,String bankName,String amount,String userName){

System.out.println("validateAndSendMoney method is started");

String paymentStatus=null;

if(mobileNumber!=0 && receiverName!=null && bankName!=null && amount!=null && userName!=null){

    if(receiverName.length()>3 && userName.length()>3){

        paymentStatus="Hello "+userName+" Money sent successfully to "+receiverName;

    }else{

        paymentStatus="Please check Receiver Name or User Name length";

    }

}else{

    paymentStatus="Please enter valid payment details";

}

System.out.println("validateAndSendMoney method is Ended");

return paymentStatus;

}

}