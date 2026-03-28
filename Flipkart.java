class Flipkart{

public static String validateAndBuy(long mobileNumber,String productName,String address,String paymentType,String userName){

System.out.println("validateAndBuy method is started");

String buyStatus=null;

if(mobileNumber!=0 && productName!=null && address!=null && paymentType!=null && userName!=null){

    if(productName.length()>3 && userName.length()>3){

        buyStatus="Thank you "+userName+" Your purchase of "+productName+" is successful";

    }else{

        buyStatus="Please check the length of Product Name or User Name";

    }

}else{

    buyStatus="Please enter the valid purchase data";

}

System.out.println("validateAndBuy method is Ended");

return buyStatus;

}

}