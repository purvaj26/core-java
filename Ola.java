class Ola{

public static String validateAndBookRide(long mobileNumber,String pickupLocation,String dropLocation,String cabType,String userName){

System.out.println("validateAndBookRide method is started");

String bookingStatus=null;

if(mobileNumber!=0 && pickupLocation!=null && dropLocation!=null && cabType!=null && userName!=null){

    if(pickupLocation.length()>3 && dropLocation.length()>3 && userName.length()>3){

        bookingStatus="Hello "+userName+" Your "+cabType+" ride is booked from "+pickupLocation+" to "+dropLocation;

    }else{

        bookingStatus="Please check the location or user name length";

    }

}else{

    bookingStatus="Please enter valid booking data";

}

System.out.println("validateAndBookRide method is Ended");

return bookingStatus;

}

}