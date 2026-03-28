class WhatsApp{

public static String validateAndCreateAccount(long mobileNumber,String name,String about,String country,String userName){

System.out.println("validateAndCreateAccount method is started");

String accountStatus=null;

if(mobileNumber!=0 && name!=null && about!=null && country!=null && userName!=null){

    if(name.length()>3 && userName.length()>3){

        accountStatus="Welcome "+name+" Your WhatsApp account created successfully";

    }else{

        accountStatus="Please check the length of Name or User Name";

    }

}else{

    accountStatus="Please enter the valid data";

}

System.out.println("validateAndCreateAccount method is Ended");

return accountStatus;

}

}